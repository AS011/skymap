package com.vasa.android.stardroid.activities;

import android.content.SharedPreferences;
import android.hardware.SensorManager;
import com.vasa.android.stardroid.activities.util.SensorAccuracyDecoder;
import com.vasa.android.stardroid.util.Analytics;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class CompassCalibrationActivity_MembersInjector implements MembersInjector<CompassCalibrationActivity> {
  private final MembersInjector<InjectableActivity> supertypeInjector;
  private final Provider<SensorManager> sensorManagerProvider;
  private final Provider<SensorAccuracyDecoder> accuracyDecoderProvider;
  private final Provider<SharedPreferences> sharedPreferencesProvider;
  private final Provider<Analytics> analyticsProvider;

  public CompassCalibrationActivity_MembersInjector(MembersInjector<InjectableActivity> supertypeInjector, Provider<SensorManager> sensorManagerProvider, Provider<SensorAccuracyDecoder> accuracyDecoderProvider, Provider<SharedPreferences> sharedPreferencesProvider, Provider<Analytics> analyticsProvider) {  
    assert supertypeInjector != null;
    this.supertypeInjector = supertypeInjector;
    assert sensorManagerProvider != null;
    this.sensorManagerProvider = sensorManagerProvider;
    assert accuracyDecoderProvider != null;
    this.accuracyDecoderProvider = accuracyDecoderProvider;
    assert sharedPreferencesProvider != null;
    this.sharedPreferencesProvider = sharedPreferencesProvider;
    assert analyticsProvider != null;
    this.analyticsProvider = analyticsProvider;
  }

  @Override
  public void injectMembers(CompassCalibrationActivity instance) {  
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    supertypeInjector.injectMembers(instance);
    instance.sensorManager = sensorManagerProvider.get();
    instance.accuracyDecoder = accuracyDecoderProvider.get();
    instance.sharedPreferences = sharedPreferencesProvider.get();
    instance.analytics = analyticsProvider.get();
  }

  public static MembersInjector<CompassCalibrationActivity> create(MembersInjector<InjectableActivity> supertypeInjector, Provider<SensorManager> sensorManagerProvider, Provider<SensorAccuracyDecoder> accuracyDecoderProvider, Provider<SharedPreferences> sharedPreferencesProvider, Provider<Analytics> analyticsProvider) {  
      return new CompassCalibrationActivity_MembersInjector(supertypeInjector, sensorManagerProvider, accuracyDecoderProvider, sharedPreferencesProvider, analyticsProvider);
  }
}

