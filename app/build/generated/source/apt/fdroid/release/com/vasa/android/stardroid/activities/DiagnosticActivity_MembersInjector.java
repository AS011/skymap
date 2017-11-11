package com.vasa.android.stardroid.activities;

import android.hardware.SensorManager;
import android.location.LocationManager;
import android.net.ConnectivityManager;
import android.os.Handler;
import com.vasa.android.stardroid.StardroidApplication;
import com.vasa.android.stardroid.activities.util.SensorAccuracyDecoder;
import com.vasa.android.stardroid.control.AstronomerModel;
import com.vasa.android.stardroid.control.LocationController;
import com.vasa.android.stardroid.util.Analytics;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class DiagnosticActivity_MembersInjector implements MembersInjector<DiagnosticActivity> {
  private final MembersInjector<InjectableActivity> supertypeInjector;
  private final Provider<Analytics> analyticsProvider;
  private final Provider<StardroidApplication> appProvider;
  private final Provider<SensorManager> sensorManagerProvider;
  private final Provider<ConnectivityManager> connectivityManagerProvider;
  private final Provider<LocationManager> locationManagerProvider;
  private final Provider<LocationController> locationControllerProvider;
  private final Provider<AstronomerModel> modelProvider;
  private final Provider<Handler> handlerProvider;
  private final Provider<SensorAccuracyDecoder> sensorAccuracyDecoderProvider;

  public DiagnosticActivity_MembersInjector(MembersInjector<InjectableActivity> supertypeInjector, Provider<Analytics> analyticsProvider, Provider<StardroidApplication> appProvider, Provider<SensorManager> sensorManagerProvider, Provider<ConnectivityManager> connectivityManagerProvider, Provider<LocationManager> locationManagerProvider, Provider<LocationController> locationControllerProvider, Provider<AstronomerModel> modelProvider, Provider<Handler> handlerProvider, Provider<SensorAccuracyDecoder> sensorAccuracyDecoderProvider) {  
    assert supertypeInjector != null;
    this.supertypeInjector = supertypeInjector;
    assert analyticsProvider != null;
    this.analyticsProvider = analyticsProvider;
    assert appProvider != null;
    this.appProvider = appProvider;
    assert sensorManagerProvider != null;
    this.sensorManagerProvider = sensorManagerProvider;
    assert connectivityManagerProvider != null;
    this.connectivityManagerProvider = connectivityManagerProvider;
    assert locationManagerProvider != null;
    this.locationManagerProvider = locationManagerProvider;
    assert locationControllerProvider != null;
    this.locationControllerProvider = locationControllerProvider;
    assert modelProvider != null;
    this.modelProvider = modelProvider;
    assert handlerProvider != null;
    this.handlerProvider = handlerProvider;
    assert sensorAccuracyDecoderProvider != null;
    this.sensorAccuracyDecoderProvider = sensorAccuracyDecoderProvider;
  }

  @Override
  public void injectMembers(DiagnosticActivity instance) {  
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    supertypeInjector.injectMembers(instance);
    instance.analytics = analyticsProvider.get();
    instance.app = appProvider.get();
    instance.sensorManager = sensorManagerProvider.get();
    instance.connectivityManager = connectivityManagerProvider.get();
    instance.locationManager = locationManagerProvider.get();
    instance.locationController = locationControllerProvider.get();
    instance.model = modelProvider.get();
    instance.handler = handlerProvider.get();
    instance.sensorAccuracyDecoder = sensorAccuracyDecoderProvider.get();
  }

  public static MembersInjector<DiagnosticActivity> create(MembersInjector<InjectableActivity> supertypeInjector, Provider<Analytics> analyticsProvider, Provider<StardroidApplication> appProvider, Provider<SensorManager> sensorManagerProvider, Provider<ConnectivityManager> connectivityManagerProvider, Provider<LocationManager> locationManagerProvider, Provider<LocationController> locationControllerProvider, Provider<AstronomerModel> modelProvider, Provider<Handler> handlerProvider, Provider<SensorAccuracyDecoder> sensorAccuracyDecoderProvider) {  
      return new DiagnosticActivity_MembersInjector(supertypeInjector, analyticsProvider, appProvider, sensorManagerProvider, connectivityManagerProvider, locationManagerProvider, locationControllerProvider, modelProvider, handlerProvider, sensorAccuracyDecoderProvider);
  }
}

