package com.vasa.android.stardroid.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.hardware.SensorManager;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class SensorAccuracyMonitor_Factory implements Factory<SensorAccuracyMonitor> {
  private final Provider<SensorManager> sensorManagerProvider;
  private final Provider<Context> contextProvider;
  private final Provider<SharedPreferences> sharedPreferencesProvider;
  private final Provider<Toaster> toasterProvider;

  public SensorAccuracyMonitor_Factory(Provider<SensorManager> sensorManagerProvider, Provider<Context> contextProvider, Provider<SharedPreferences> sharedPreferencesProvider, Provider<Toaster> toasterProvider) {  
    assert sensorManagerProvider != null;
    this.sensorManagerProvider = sensorManagerProvider;
    assert contextProvider != null;
    this.contextProvider = contextProvider;
    assert sharedPreferencesProvider != null;
    this.sharedPreferencesProvider = sharedPreferencesProvider;
    assert toasterProvider != null;
    this.toasterProvider = toasterProvider;
  }

  @Override
  public SensorAccuracyMonitor get() {  
    return new SensorAccuracyMonitor(sensorManagerProvider.get(), contextProvider.get(), sharedPreferencesProvider.get(), toasterProvider.get());
  }

  public static Factory<SensorAccuracyMonitor> create(Provider<SensorManager> sensorManagerProvider, Provider<Context> contextProvider, Provider<SharedPreferences> sharedPreferencesProvider, Provider<Toaster> toasterProvider) {  
    return new SensorAccuracyMonitor_Factory(sensorManagerProvider, contextProvider, sharedPreferencesProvider, toasterProvider);
  }
}

