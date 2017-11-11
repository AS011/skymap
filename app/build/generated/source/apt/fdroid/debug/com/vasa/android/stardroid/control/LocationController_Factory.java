package com.vasa.android.stardroid.control;

import android.content.Context;
import android.location.LocationManager;
import dagger.MembersInjector;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class LocationController_Factory implements Factory<LocationController> {
  private final MembersInjector<LocationController> membersInjector;
  private final Provider<Context> contextProvider;
  private final Provider<LocationManager> locationManagerProvider;

  public LocationController_Factory(MembersInjector<LocationController> membersInjector, Provider<Context> contextProvider, Provider<LocationManager> locationManagerProvider) {  
    assert membersInjector != null;
    this.membersInjector = membersInjector;
    assert contextProvider != null;
    this.contextProvider = contextProvider;
    assert locationManagerProvider != null;
    this.locationManagerProvider = locationManagerProvider;
  }

  @Override
  public LocationController get() {  
    LocationController instance = new LocationController(contextProvider.get(), locationManagerProvider.get());
    membersInjector.injectMembers(instance);
    return instance;
  }

  public static Factory<LocationController> create(MembersInjector<LocationController> membersInjector, Provider<Context> contextProvider, Provider<LocationManager> locationManagerProvider) {  
    return new LocationController_Factory(membersInjector, contextProvider, locationManagerProvider);
  }
}

