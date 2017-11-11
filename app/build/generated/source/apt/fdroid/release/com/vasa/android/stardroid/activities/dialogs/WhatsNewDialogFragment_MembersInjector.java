package com.vasa.android.stardroid.activities.dialogs;

import android.app.Activity;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class WhatsNewDialogFragment_MembersInjector implements MembersInjector<WhatsNewDialogFragment> {
  private final MembersInjector<DialogFragment> supertypeInjector;
  private final Provider<Activity> parentActivityProvider;

  public WhatsNewDialogFragment_MembersInjector(MembersInjector<DialogFragment> supertypeInjector, Provider<Activity> parentActivityProvider) {  
    assert supertypeInjector != null;
    this.supertypeInjector = supertypeInjector;
    assert parentActivityProvider != null;
    this.parentActivityProvider = parentActivityProvider;
  }

  @Override
  public void injectMembers(WhatsNewDialogFragment instance) {  
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    supertypeInjector.injectMembers(instance);
    instance.parentActivity = parentActivityProvider.get();
  }

  public static MembersInjector<WhatsNewDialogFragment> create(MembersInjector<DialogFragment> supertypeInjector, Provider<Activity> parentActivityProvider) {  
      return new WhatsNewDialogFragment_MembersInjector(supertypeInjector, parentActivityProvider);
  }
}

