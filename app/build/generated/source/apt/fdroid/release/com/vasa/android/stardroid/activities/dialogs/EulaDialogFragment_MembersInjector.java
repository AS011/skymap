package com.vasa.android.stardroid.activities.dialogs;

import android.app.Activity;
import com.vasa.android.stardroid.util.Analytics;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class EulaDialogFragment_MembersInjector implements MembersInjector<EulaDialogFragment> {
  private final MembersInjector<DialogFragment> supertypeInjector;
  private final Provider<Activity> parentActivityProvider;
  private final Provider<Analytics> analyticsProvider;

  public EulaDialogFragment_MembersInjector(MembersInjector<DialogFragment> supertypeInjector, Provider<Activity> parentActivityProvider, Provider<Analytics> analyticsProvider) {  
    assert supertypeInjector != null;
    this.supertypeInjector = supertypeInjector;
    assert parentActivityProvider != null;
    this.parentActivityProvider = parentActivityProvider;
    assert analyticsProvider != null;
    this.analyticsProvider = analyticsProvider;
  }

  @Override
  public void injectMembers(EulaDialogFragment instance) {  
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    supertypeInjector.injectMembers(instance);
    instance.parentActivity = parentActivityProvider.get();
    instance.analytics = analyticsProvider.get();
  }

  public static MembersInjector<EulaDialogFragment> create(MembersInjector<DialogFragment> supertypeInjector, Provider<Activity> parentActivityProvider, Provider<Analytics> analyticsProvider) {  
      return new EulaDialogFragment_MembersInjector(supertypeInjector, parentActivityProvider, analyticsProvider);
  }
}

