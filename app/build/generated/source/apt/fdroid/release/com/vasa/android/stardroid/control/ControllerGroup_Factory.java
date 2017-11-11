package com.vasa.android.stardroid.control;

import android.content.Context;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class ControllerGroup_Factory implements Factory<ControllerGroup> {
  private final Provider<Context> contextProvider;
  private final Provider<SensorOrientationController> sensorOrientationControllerProvider;
  private final Provider<LocationController> locationControllerProvider;

  public ControllerGroup_Factory(Provider<Context> contextProvider, Provider<SensorOrientationController> sensorOrientationControllerProvider, Provider<LocationController> locationControllerProvider) {  
    assert contextProvider != null;
    this.contextProvider = contextProvider;
    assert sensorOrientationControllerProvider != null;
    this.sensorOrientationControllerProvider = sensorOrientationControllerProvider;
    assert locationControllerProvider != null;
    this.locationControllerProvider = locationControllerProvider;
  }

  @Override
  public ControllerGroup get() {  
    return new ControllerGroup(contextProvider.get(), sensorOrientationControllerProvider.get(), locationControllerProvider.get());
  }

  public static Factory<ControllerGroup> create(Provider<Context> contextProvider, Provider<SensorOrientationController> sensorOrientationControllerProvider, Provider<LocationController> locationControllerProvider) {  
    return new ControllerGroup_Factory(contextProvider, sensorOrientationControllerProvider, locationControllerProvider);
  }
}

