package com.vasa.android.stardroid.activities.dialogs;

import android.app.Activity;
import android.app.DialogFragment;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class NoSearchResultsDialogFragment_MembersInjector implements MembersInjector<NoSearchResultsDialogFragment> {
  private final MembersInjector<DialogFragment> supertypeInjector;
  private final Provider<Activity> parentActivityProvider;

  public NoSearchResultsDialogFragment_MembersInjector(MembersInjector<DialogFragment> supertypeInjector, Provider<Activity> parentActivityProvider) {  
    assert supertypeInjector != null;
    this.supertypeInjector = supertypeInjector;
    assert parentActivityProvider != null;
    this.parentActivityProvider = parentActivityProvider;
  }

  @Override
  public void injectMembers(NoSearchResultsDialogFragment instance) {  
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    supertypeInjector.injectMembers(instance);
    instance.parentActivity = parentActivityProvider.get();
  }

  public static MembersInjector<NoSearchResultsDialogFragment> create(MembersInjector<DialogFragment> supertypeInjector, Provider<Activity> parentActivityProvider) {  
      return new NoSearchResultsDialogFragment_MembersInjector(supertypeInjector, parentActivityProvider);
  }
}

