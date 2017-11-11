package com.vasa.android.stardroid.activities;

import android.content.Context;
import android.content.SharedPreferences;
import android.hardware.SensorManager;
import com.vasa.android.stardroid.ApplicationComponent;
import com.vasa.android.stardroid.StardroidApplication;
import com.vasa.android.stardroid.activities.util.SensorAccuracyDecoder;
import com.vasa.android.stardroid.activities.util.SensorAccuracyDecoder_Factory;
import com.vasa.android.stardroid.util.Analytics;
import com.vasa.android.stardroid.util.Analytics_Factory;
import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import dagger.internal.ScopedProvider;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class DaggerCompassCalibrationComponent implements CompassCalibrationComponent {
  private Provider<SensorManager> provideSensorManagerProvider;
  private Provider<Context> provideContextProvider;
  private Provider<SensorAccuracyDecoder> sensorAccuracyDecoderProvider;
  private Provider<SharedPreferences> provideSharedPreferencesProvider;
  private Provider<StardroidApplication> provideStardroidApplicationProvider;
  private Provider<Analytics> analyticsProvider;
  private MembersInjector<CompassCalibrationActivity> compassCalibrationActivityMembersInjector;

  private DaggerCompassCalibrationComponent(Builder builder) {  
    assert builder != null;
    initialize(builder);
  }

  public static Builder builder() {  
    return new Builder();
  }

  private void initialize(final Builder builder) {  
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
    this.provideContextProvider = ScopedProvider.create(CompassCalibrationModule_ProvideContextFactory.create(builder.compassCalibrationModule));
    this.sensorAccuracyDecoderProvider = SensorAccuracyDecoder_Factory.create(provideContextProvider);
    this.provideSharedPreferencesProvider = new Factory<SharedPreferences>() {
      private final ApplicationComponent applicationComponent = builder.applicationComponent;
      @Override public SharedPreferences get() {
        SharedPreferences provided = applicationComponent.provideSharedPreferences();
        if (provided == null) {
          throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
        return provided;
      }
    };
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
    this.compassCalibrationActivityMembersInjector = CompassCalibrationActivity_MembersInjector.create((MembersInjector) MembersInjectors.noOp(), provideSensorManagerProvider, sensorAccuracyDecoderProvider, provideSharedPreferencesProvider, analyticsProvider);
  }

  @Override
  public void inject(CompassCalibrationActivity activity) {  
    compassCalibrationActivityMembersInjector.injectMembers(activity);
  }

  public static final class Builder {
    private CompassCalibrationModule compassCalibrationModule;
    private ApplicationComponent applicationComponent;
  
    private Builder() {  
    }
  
    public CompassCalibrationComponent build() {  
      if (compassCalibrationModule == null) {
        throw new IllegalStateException("compassCalibrationModule must be set");
      }
      if (applicationComponent == null) {
        throw new IllegalStateException("applicationComponent must be set");
      }
      return new DaggerCompassCalibrationComponent(this);
    }
  
    public Builder compassCalibrationModule(CompassCalibrationModule compassCalibrationModule) {  
      if (compassCalibrationModule == null) {
        throw new NullPointerException("compassCalibrationModule");
      }
      this.compassCalibrationModule = compassCalibrationModule;
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

