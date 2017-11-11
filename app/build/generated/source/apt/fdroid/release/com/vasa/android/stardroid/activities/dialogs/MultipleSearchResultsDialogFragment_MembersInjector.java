package com.vasa.android.stardroid.activities.dialogs;

import android.app.DialogFragment;
import com.vasa.android.stardroid.activities.DynamicStarMapActivity;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class MultipleSearchResultsDialogFragment_MembersInjector implements MembersInjector<MultipleSearchResultsDialogFragment> {
  private final MembersInjector<DialogFragment> supertypeInjector;
  private final Provider<DynamicStarMapActivity> parentActivityProvider;

  public MultipleSearchResultsDialogFragment_MembersInjector(MembersInjector<DialogFragment> supertypeInjector, Provider<DynamicStarMapActivity> parentActivityProvider) {  
    assert supertypeInjector != null;
    this.supertypeInjector = supertypeInjector;
    assert parentActivityProvider != null;
    this.parentActivityProvider = parentActivityProvider;
  }

  @Override
  public void injectMembers(MultipleSearchResultsDialogFragment instance) {  
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    supertypeInjector.injectMembers(instance);
    instance.parentActivity = parentActivityProvider.get();
  }

  public static MembersInjector<MultipleSearchResultsDialogFragment> create(MembersInjector<DialogFragment> supertypeInjector, Provider<DynamicStarMapActivity> parentActivityProvider) {  
      return new MultipleSearchResultsDialogFragment_MembersInjector(supertypeInjector, parentActivityProvider);
  }
}

