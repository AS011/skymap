package com.vasa.android.stardroid.activities.dialogs;

import android.app.Activity;
import android.app.DialogFragment;
import android.content.SharedPreferences;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class NoSensorsDialogFragment_MembersInjector implements MembersInjector<NoSensorsDialogFragment> {
  private final MembersInjector<DialogFragment> supertypeInjector;
  private final Provider<Activity> parentActivityProvider;
  private final Provider<SharedPreferences> preferencesProvider;

  public NoSensorsDialogFragment_MembersInjector(MembersInjector<DialogFragment> supertypeInjector, Provider<Activity> parentActivityProvider, Provider<SharedPreferences> preferencesProvider) {  
    assert supertypeInjector != null;
    this.supertypeInjector = supertypeInjector;
    assert parentActivityProvider != null;
    this.parentActivityProvider = parentActivityProvider;
    assert preferencesProvider != null;
    this.preferencesProvider = preferencesProvider;
  }

  @Override
  public void injectMembers(NoSensorsDialogFragment instance) {  
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    supertypeInjector.injectMembers(instance);
    instance.parentActivity = parentActivityProvider.get();
    instance.preferences = preferencesProvider.get();
  }

  public static MembersInjector<NoSensorsDialogFragment> create(MembersInjector<DialogFragment> supertypeInjector, Provider<Activity> parentActivityProvider, Provider<SharedPreferences> preferencesProvider) {  
      return new NoSensorsDialogFragment_MembersInjector(supertypeInjector, parentActivityProvider, preferencesProvider);
  }
}

