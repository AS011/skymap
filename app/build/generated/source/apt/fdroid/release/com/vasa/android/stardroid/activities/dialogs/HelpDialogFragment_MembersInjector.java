package com.vasa.android.stardroid.activities.dialogs;

import android.app.Activity;
import com.vasa.android.stardroid.StardroidApplication;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class HelpDialogFragment_MembersInjector implements MembersInjector<HelpDialogFragment> {
  private final MembersInjector<DialogFragment> supertypeInjector;
  private final Provider<StardroidApplication> applicationProvider;
  private final Provider<Activity> parentActivityProvider;

  public HelpDialogFragment_MembersInjector(MembersInjector<DialogFragment> supertypeInjector, Provider<StardroidApplication> applicationProvider, Provider<Activity> parentActivityProvider) {  
    assert supertypeInjector != null;
    this.supertypeInjector = supertypeInjector;
    assert applicationProvider != null;
    this.applicationProvider = applicationProvider;
    assert parentActivityProvider != null;
    this.parentActivityProvider = parentActivityProvider;
  }

  @Override
  public void injectMembers(HelpDialogFragment instance) {  
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    supertypeInjector.injectMembers(instance);
    instance.application = applicationProvider.get();
    instance.parentActivity = parentActivityProvider.get();
  }

  public static MembersInjector<HelpDialogFragment> create(MembersInjector<DialogFragment> supertypeInjector, Provider<StardroidApplication> applicationProvider, Provider<Activity> parentActivityProvider) {  
      return new HelpDialogFragment_MembersInjector(supertypeInjector, applicationProvider, parentActivityProvider);
  }
}

