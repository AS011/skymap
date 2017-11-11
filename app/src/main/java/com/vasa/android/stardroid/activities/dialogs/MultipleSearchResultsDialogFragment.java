package com.vasa.android.stardroid.activities.dialogs;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;

import com.vasa.android.stardroid.R;
import com.vasa.android.stardroid.activities.DynamicStarMapActivity;
import com.vasa.android.stardroid.inject.HasComponent;
import com.vasa.android.stardroid.search.SearchResult;
import com.vasa.android.stardroid.util.MiscUtil;

import java.util.ArrayList;

import javax.inject.Inject;

/**
 * End User License agreement dialog.
 * Created by johntaylor on 4/3/16.
 */
public class MultipleSearchResultsDialogFragment extends DialogFragment {
  private static final String TAG = MiscUtil.getTag(MultipleSearchResultsDialogFragment.class);
  @Inject
  DynamicStarMapActivity parentActivity;

  private ArrayAdapter<SearchResult> multipleSearchResultsAdaptor;

  public interface ActivityComponent {
    void inject(MultipleSearchResultsDialogFragment fragment);
  }

  @Override
  public Dialog onCreateDialog(Bundle savedInstanceState) {
    // Activities using this dialog MUST implement this interface.  Obviously.
    ((HasComponent<ActivityComponent>) getActivity()).getComponent().inject(this);

    // TODO(jontayler): inject
    multipleSearchResultsAdaptor = new ArrayAdapter<>(
        parentActivity, android.R.layout.simple_list_item_1, new ArrayList<SearchResult>());


    DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() {
      public void onClick(DialogInterface dialog, int whichButton) {
        if (whichButton == Dialog.BUTTON2) {
          Log.d(TAG, "Many search results Dialog closed with cancel");
          dialog.dismiss();
        } else {
          final SearchResult item = multipleSearchResultsAdaptor.getItem(whichButton);
          parentActivity.activateSearchTarget(item.coords, item.capitalizedName);
          dialog.dismiss();
        }
      }
    };

    AlertDialog dialog = new AlertDialog.Builder(parentActivity)
        .setTitle(R.string.many_search_results_title)
        .setNegativeButton(android.R.string.cancel, onClickListener)
        .setAdapter(multipleSearchResultsAdaptor, onClickListener)
        .create();
    return dialog;
  }

  public void clearResults() {
    multipleSearchResultsAdaptor.clear();
  }

  public void add(SearchResult result) {
    multipleSearchResultsAdaptor.add(result);
  }
}
