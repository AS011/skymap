package com.vasa.android.stardroid.activities;

import android.content.Context;
import android.hardware.SensorManager;
import android.location.LocationManager;
import android.net.ConnectivityManager;
import android.os.Handler;
import com.vasa.android.stardroid.ApplicationComponent;
import com.vasa.android.stardroid.StardroidApplication;
import com.vasa.android.stardroid.activities.util.SensorAccuracyDecoder;
import com.vasa.android.stardroid.activities.util.SensorAccuracyDecoder_Factory;
import com.vasa.android.stardroid.control.AbstractController;
import com.vasa.android.stardroid.control.AbstractController_MembersInjector;
import com.vasa.android.stardroid.control.AstronomerModel;
import com.vasa.android.stardroid.control.LocationController;
import com.vasa.android.stardroid.control.LocationController_Factory;
import com.vasa.android.stardroid.util.Analytics;
import com.vasa.android.stardroid.util.Analytics_Factory;
import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import dagger.internal.ScopedProvider;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class DaggerDiagnosticActivityComponent implements DiagnosticActivityComponent {
  private Provider<StardroidApplication> provideStardroidApplicationProvider;
  private Provider<Analytics> analyticsProvider;
  private Provider<SensorManager> provideSensorManagerProvider;
  private Provider<ConnectivityManager> provideConnectivityManagerProvider;
  private Provider<LocationManager> provideLocationManagerProvider;
  private Provider<AstronomerModel> provideAstronomerModelProvider;
  private MembersInjector<AbstractController> abstractControllerMembersInjector;
  private MembersInjector<LocationController> locationControllerMembersInjector;
  private Provider<Context> provideActivityContextProvider;
  private Provider<LocationController> locationControllerProvider;
  private Provider<Handler> provideHandlerProvider;
  private Provider<SensorAccuracyDecoder> sensorAccuracyDecoderProvider;
  private MembersInjector<DiagnosticActivity> diagnosticActivityMembersInjector;

  private DaggerDiagnosticActivityComponent(Builder builder) {  
    assert builder != null;
    initialize(builder);
  }

  public static Builder builder() {  
    return new Builder();
  }

  private void initialize(final Builder builder) {  
    this.provideStardroidApplicationProvider = new Factory<StardroidApplication>() {
      private final ApplicationComponent applicationComponent = builder.applicationComponent;
      @Override public StardroidApplication get() {
        StardroidApplication provided = applicationComponent.provideStardroidApplication();
        if (provided == null) {
          throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
        return provided;
      }
    };
    this.analyticsProvider = Analytics_Factory.create(provideStardroidApplicationProvider);
    this.provideSensorManagerProvider = new Factory<SensorManager>() {
      private final ApplicationComponent applicationComponent = builder.applicationComponent;
      @Override public SensorManager get() {
        SensorManager provided = applicationComponent.provideSensorManager();
        if (provided == null) {
          throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
        return provided;
      }
    };
    this.provideConnectivityManagerProvider = new Factory<ConnectivityManager>() {
      private final ApplicationComponent applicationComponent = builder.applicationComponent;
      @Override public ConnectivityManager get() {
        ConnectivityManager provided = applicationComponent.provideConnectivityManager();
        if (provided == null) {
          throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
        return provided;
      }
    };
    this.provideLocationManagerProvider = new Factory<LocationManager>() {
      private final ApplicationComponent applicationComponent = builder.applicationComponent;
      @Override public LocationManager get() {
        LocationManager provided = applicationComponent.provideLocationManager();
        if (provided == null) {
          throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
        return provided;
      }
    };
    this.provideAstronomerModelProvider = new Factory<AstronomerModel>() {
      private final ApplicationComponent applicationComponent = builder.applicationComponent;
      @Override public AstronomerModel get() {
        AstronomerModel provided = applicationComponent.provideAstronomerModel();
        if (provided == null) {
          throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
        return provided;
      }
    };
    this.abstractControllerMembersInjector = AbstractController_MembersInjector.create(provideAstronomerModelProvider);
    this.locationControllerMembersInjector = MembersInjectors.delegatingTo(abstractControllerMembersInjector);
    this.provideActivityContextProvider = ScopedProvider.create(DiagnosticActivityModule_ProvideActivityContextFactory.create(builder.diagnosticActivityModule));
    this.locationControllerProvider = LocationController_Factory.create(locationControllerMembersInjector, provideActivityContextProvider, provideLocationManagerProvider);
    this.provideHandlerProvider = ScopedProvider.create(DiagnosticActivityModule_ProvideHandlerFactory.create(builder.diagnosticActivityModule));
    this.sensorAccuracyDecoderProvider = SensorAccuracyDecoder_Factory.create(provideActivityContextProvider);
    this.diagnosticActivityMembersInjector = DiagnosticActivity_MembersInjector.create((MembersInjector) MembersInjectors.noOp(), analyticsProvider, provideStardroidApplicationProvider, provideSensorManagerProvider, provideConnectivityManagerProvider, provideLocationManagerProvider, locationControllerProvider, provideAstronomerModelProvider, provideHandlerProvider, sensorAccuracyDecoderProvider);
  }

  @Override
  public void inject(DiagnosticActivity activity) {  
    diagnosticActivityMembersInjector.injectMembers(activity);
  }

  public static final class Builder {
    private DiagnosticActivityModule diagnosticActivityModule;
    private ApplicationComponent applicationComponent;
  
    private Builder() {  
    }
  
    public DiagnosticActivityComponent build() {  
      if (diagnosticActivityModule == null) {
        throw new IllegalStateException("diagnosticActivityModule must be set");
      }
      if (applicationComponent == null) {
        throw new IllegalStateException("applicationComponent must be set");
      }
      return new DaggerDiagnosticActivityComponent(this);
    }
  
    public Builder diagnosticActivityModule(DiagnosticActivityModule diagnosticActivityModule) {  
      if (diagnosticActivityModule == null) {
        throw new NullPointerException("diagnosticActivityModule");
      }
      this.diagnosticActivityModule = diagnosticActivityModule;
      return this;
    }
  
    public Builder applicationComponent(ApplicationComponent applicationComponent) {  
      if (applicationComponent == null) {
        throw new NullPointerException("applicationComponent");
      }
      this.applicationComponent = applicationComponent;
      return this;
    }
  }
}

