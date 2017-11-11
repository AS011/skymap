package com.vasa.android.stardroid.activities.util;

import android.app.Activity;
import android.app.FragmentManager;
import android.content.SharedPreferences;
import com.vasa.android.stardroid.activities.dialogs.LocationPermissionRationaleFragment;
import dagger.MembersInjector;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class GooglePlayServicesChecker_Factory implements Factory<GooglePlayServicesChecker> {
  private final MembersInjector<GooglePlayServicesChecker> membersInjector;
  private final Provider<Activity> parentProvider;
  private final Provider<SharedPreferences> preferencesProvider;
  private final Provider<LocationPermissionRationaleFragment> rationaleDialogProvider;
  private final Provider<FragmentManager> fragmentManagerProvider;

  public GooglePlayServicesChecker_Factory(MembersInjector<GooglePlayServicesChecker> membersInjector, Provider<Activity> parentProvider, Provider<SharedPreferences> preferencesProvider, Provider<LocationPermissionRationaleFragment> rationaleDialogProvider, Provider<FragmentManager> fragmentManagerProvider) {  
    assert membersInjector != null;
    this.membersInjector = membersInjector;
    assert parentProvider != null;
    this.parentProvider = parentProvider;
    assert preferencesProvider != null;
    this.preferencesProvider = preferencesProvider;
    assert rationaleDialogProvider != null;
    this.rationaleDialogProvider = rationaleDialogProvider;
    assert fragmentManagerProvider != null;
    this.fragmentManagerProvider = fragmentManagerProvider;
  }

  @Override
  public GooglePlayServicesChecker get() {  
    GooglePlayServicesChecker instance = new GooglePlayServicesChecker(parentProvider.get(), preferencesProvider.get(), rationaleDialogProvider.get(), fragmentManagerProvider.get());
    membersInjector.injectMembers(instance);
    return instance;
  }

  public static Factory<GooglePlayServicesChecker> create(MembersInjector<GooglePlayServicesChecker> membersInjector, Provider<Activity> parentProvider, Provider<SharedPreferences> preferencesProvider, Provider<LocationPermissionRationaleFragment> rationaleDialogProvider, Provider<FragmentManager> fragmentManagerProvider) {  
    return new GooglePlayServicesChecker_Factory(membersInjector, parentProvider, preferencesProvider, rationaleDialogProvider, fragmentManagerProvider);
  }
}

