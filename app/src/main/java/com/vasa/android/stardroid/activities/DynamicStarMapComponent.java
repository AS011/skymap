package com.vasa.android.stardroid.activities;

import com.vasa.android.stardroid.ApplicationComponent;
import com.vasa.android.stardroid.activities.dialogs.EulaDialogFragment;
import com.vasa.android.stardroid.activities.dialogs.HelpDialogFragment;
import com.vasa.android.stardroid.activities.dialogs.MultipleSearchResultsDialogFragment;
import com.vasa.android.stardroid.activities.dialogs.NoSearchResultsDialogFragment;
import com.vasa.android.stardroid.activities.dialogs.NoSensorsDialogFragment;
import com.vasa.android.stardroid.activities.dialogs.TimeTravelDialogFragment;
import com.vasa.android.stardroid.inject.PerActivity;

import dagger.Component;

/**
 * Created by johntaylor on 3/29/16.
 */
@PerActivity
@Component(modules={DynamicStarMapModule.class}, dependencies={ApplicationComponent.class})
public interface DynamicStarMapComponent extends EulaDialogFragment.ActivityComponent,
        TimeTravelDialogFragment.ActivityComponent, HelpDialogFragment.ActivityComponent,
        NoSearchResultsDialogFragment.ActivityComponent,
        MultipleSearchResultsDialogFragment.ActivityComponent,
        NoSensorsDialogFragment.ActivityComponent {
  void inject(DynamicStarMapActivity activity);
}

