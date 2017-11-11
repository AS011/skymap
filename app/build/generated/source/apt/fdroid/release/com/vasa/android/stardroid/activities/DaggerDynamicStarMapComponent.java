package com.vasa.android.stardroid.activities;

import android.app.Activity;
import android.app.FragmentManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.hardware.SensorManager;
import android.location.LocationManager;
import android.media.MediaPlayer;
import android.os.Handler;
import android.view.animation.Animation;
import com.vasa.android.stardroid.ApplicationComponent;
import com.vasa.android.stardroid.StardroidApplication;
import com.vasa.android.stardroid.activities.dialogs.EulaDialogFragment;
import com.vasa.android.stardroid.activities.dialogs.EulaDialogFragment_MembersInjector;
import com.vasa.android.stardroid.activities.dialogs.HelpDialogFragment;
import com.vasa.android.stardroid.activities.dialogs.HelpDialogFragment_MembersInjector;
import com.vasa.android.stardroid.activities.dialogs.LocationPermissionRationaleFragment;
import com.vasa.android.stardroid.activities.dialogs.MultipleSearchResultsDialogFragment;
import com.vasa.android.stardroid.activities.dialogs.MultipleSearchResultsDialogFragment_MembersInjector;
import com.vasa.android.stardroid.activities.dialogs.NoSearchResultsDialogFragment;
import com.vasa.android.stardroid.activities.dialogs.NoSearchResultsDialogFragment_MembersInjector;
import com.vasa.android.stardroid.activities.dialogs.NoSensorsDialogFragment;
import com.vasa.android.stardroid.activities.dialogs.NoSensorsDialogFragment_MembersInjector;
import com.vasa.android.stardroid.activities.dialogs.TimeTravelDialogFragment;
import com.vasa.android.stardroid.activities.dialogs.TimeTravelDialogFragment_MembersInjector;
import com.vasa.android.stardroid.activities.util.GooglePlayServicesChecker;
import com.vasa.android.stardroid.activities.util.GooglePlayServicesChecker_Factory;
import com.vasa.android.stardroid.control.AbstractController;
import com.vasa.android.stardroid.control.AbstractController_MembersInjector;
import com.vasa.android.stardroid.control.AstronomerModel;
import com.vasa.android.stardroid.control.ControllerGroup;
import com.vasa.android.stardroid.control.ControllerGroup_Factory;
import com.vasa.android.stardroid.control.LocationController;
import com.vasa.android.stardroid.control.LocationController_Factory;
import com.vasa.android.stardroid.control.MagneticDeclinationCalculator;
import com.vasa.android.stardroid.control.MagneticDeclinationCalculatorSwitcher;
import com.vasa.android.stardroid.control.MagneticDeclinationCalculatorSwitcher_Factory;
import com.vasa.android.stardroid.control.SensorOrientationController;
import com.vasa.android.stardroid.control.SensorOrientationController_Factory;
import com.vasa.android.stardroid.layers.LayerManager;
import com.vasa.android.stardroid.util.Analytics;
import com.vasa.android.stardroid.util.Analytics_Factory;
import com.vasa.android.stardroid.util.SensorAccuracyMonitor;
import com.vasa.android.stardroid.util.SensorAccuracyMonitor_Factory;
import com.vasa.android.stardroid.util.Toaster;
import com.vasa.android.stardroid.util.Toaster_Factory;
import com.vasa.android.stardroid.util.smoothers.PlainSmootherModelAdaptor;
import com.vasa.android.stardroid.util.smoothers.PlainSmootherModelAdaptor_Factory;
import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import dagger.internal.ScopedProvider;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class DaggerDynamicStarMapComponent implements DynamicStarMapComponent {
  private Provider<Activity> provideActivityProvider;
  private Provider<StardroidApplication> provideStardroidApplicationProvider;
  private Provider<Analytics> analyticsProvider;
  private MembersInjector<EulaDialogFragment> eulaDialogFragmentMembersInjector;
  private Provider<DynamicStarMapActivity> provideDynamicStarMapActivityProvider;
  private MembersInjector<TimeTravelDialogFragment> timeTravelDialogFragmentMembersInjector;
  private MembersInjector<HelpDialogFragment> helpDialogFragmentMembersInjector;
  private MembersInjector<NoSearchResultsDialogFragment> noSearchResultsDialogFragmentMembersInjector;
  private MembersInjector<MultipleSearchResultsDialogFragment> multipleSearchResultsDialogFragmentMembersInjector;
  private Provider<SharedPreferences> provideSharedPreferencesProvider;
  private MembersInjector<NoSensorsDialogFragment> noSensorsDialogFragmentMembersInjector;
  private Provider<Context> provideActivityContextProvider;
  private Provider<AstronomerModel> provideAstronomerModelProvider;
  private MembersInjector<AbstractController> abstractControllerMembersInjector;
  private MembersInjector<SensorOrientationController> sensorOrientationControllerMembersInjector;
  private Provider<PlainSmootherModelAdaptor> plainSmootherModelAdaptorProvider;
  private Provider<SensorManager> provideSensorManagerProvider;
  private Provider<SensorOrientationController> sensorOrientationControllerProvider;
  private MembersInjector<LocationController> locationControllerMembersInjector;
  private Provider<LocationManager> provideLocationManagerProvider;
  private Provider<LocationController> locationControllerProvider;
  private Provider<ControllerGroup> controllerGroupProvider;
  private Provider<LayerManager> provideLayerManagerProvider;
  private Provider<MediaPlayer> provideTimeTravelNoiseProvider;
  private Provider<MediaPlayer> provideTimeTravelBackNoiseProvider;
  private Provider<Handler> provideHandlerProvider;
  private Provider<LocationPermissionRationaleFragment> provideLocationFragmentProvider;
  private Provider<FragmentManager> provideFragmentManagerProvider;
  private Provider<GooglePlayServicesChecker> googlePlayServicesCheckerProvider;
  private Provider<EulaDialogFragment> provideEulaDialogFragmentProvider;
  private Provider<TimeTravelDialogFragment> provideTimeTravelDialogFragmentProvider;
  private Provider<HelpDialogFragment> provideHelpDialogFragmentProvider;
  private Provider<NoSearchResultsDialogFragment> provideNoSearchResultsDialogFragmentProvider;
  private Provider<MultipleSearchResultsDialogFragment> provideMultipleSearchResultsDialogFragmentProvider;
  private Provider<NoSensorsDialogFragment> provideNoSensorsDialogFragmentProvider;
  private Provider<Toaster> toasterProvider;
  private Provider<SensorAccuracyMonitor> sensorAccuracyMonitorProvider;
  private Provider<MagneticDeclinationCalculator> provideMagDec1Provider;
  private Provider<MagneticDeclinationCalculator> provideMagDec2Provider;
  private Provider<MagneticDeclinationCalculatorSwitcher> magneticDeclinationCalculatorSwitcherProvider;
  private Provider<Animation> provideTimeTravelFlashAnimationProvider;
  private MembersInjector<DynamicStarMapActivity> dynamicStarMapActivityMembersInjector;

  private DaggerDynamicStarMapComponent(Builder builder) {  
    assert builder != null;
    initialize(builder);
  }

  public static Builder builder() {  
    return new Builder();
  }

  private void initialize(final Builder builder) {  
    this.provideActivityProvider = ScopedProvider.create(AbstractDynamicStarMapModule_ProvideActivityFactory.create(builder.dynamicStarMapModule));
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
    this.eulaDialogFragmentMembersInjector = EulaDialogFragment_MembersInjector.create((MembersInjector) MembersInjectors.noOp(), provideActivityProvider, analyticsProvider);
    this.provideDynamicStarMapActivityProvider = ScopedProvider.create(AbstractDynamicStarMapModule_ProvideDynamicStarMapActivityFactory.create(builder.dynamicStarMapModule));
    this.timeTravelDialogFragmentMembersInjector = TimeTravelDialogFragment_MembersInjector.create((MembersInjector) MembersInjectors.noOp(), provideDynamicStarMapActivityProvider);
    this.helpDialogFragmentMembersInjector = HelpDialogFragment_MembersInjector.create((MembersInjector) MembersInjectors.noOp(), provideStardroidApplicationProvider, provideActivityProvider);
    this.noSearchResultsDialogFragmentMembersInjector = NoSearchResultsDialogFragment_MembersInjector.create((MembersInjector) MembersInjectors.noOp(), provideActivityProvider);
    this.multipleSearchResultsDialogFragmentMembersInjector = MultipleSearchResultsDialogFragment_MembersInjector.create((MembersInjector) MembersInjectors.noOp(), provideDynamicStarMapActivityProvider);
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
    this.noSensorsDialogFragmentMembersInjector = NoSensorsDialogFragment_MembersInjector.create((MembersInjector) MembersInjectors.noOp(), provideActivityProvider, provideSharedPreferencesProvider);
    this.provideActivityContextProvider = ScopedProvider.create(AbstractDynamicStarMapModule_ProvideActivityContextFactory.create(builder.dynamicStarMapModule));
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
    this.sensorOrientationControllerMembersInjector = MembersInjectors.delegatingTo(abstractControllerMembersInjector);
    this.plainSmootherModelAdaptorProvider = PlainSmootherModelAdaptor_Factory.create(provideAstronomerModelProvider, provideSharedPreferencesProvider);
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
    this.sensorOrientationControllerProvider = SensorOrientationController_Factory.create(sensorOrientationControllerMembersInjector, plainSmootherModelAdaptorProvider, provideSensorManagerProvider, provideSharedPreferencesProvider);
    this.locationControllerMembersInjector = MembersInjectors.delegatingTo(abstractControllerMembersInjector);
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
    this.locationControllerProvider = LocationController_Factory.create(locationControllerMembersInjector, provideActivityContextProvider, provideLocationManagerProvider);
    this.controllerGroupProvider = ControllerGroup_Factory.create(provideActivityContextProvider, sensorOrientationControllerProvider, locationControllerProvider);
    this.provideLayerManagerProvider = new Factory<LayerManager>() {
      private final ApplicationComponent applicationComponent = builder.applicationComponent;
      @Override public LayerManager get() {
        LayerManager provided = applicationComponent.provideLayerManager();
        if (provided == null) {
          throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
        return provided;
      }
    };
    this.provideTimeTravelNoiseProvider = ScopedProvider.create(AbstractDynamicStarMapModule_ProvideTimeTravelNoiseFactory.create(builder.dynamicStarMapModule));
    this.provideTimeTravelBackNoiseProvider = ScopedProvider.create(AbstractDynamicStarMapModule_ProvideTimeTravelBackNoiseFactory.create(builder.dynamicStarMapModule));
    this.provideHandlerProvider = ScopedProvider.create(AbstractDynamicStarMapModule_ProvideHandlerFactory.create(builder.dynamicStarMapModule));
    this.provideLocationFragmentProvider = ScopedProvider.create(AbstractDynamicStarMapModule_ProvideLocationFragmentFactory.create(builder.dynamicStarMapModule));
    this.provideFragmentManagerProvider = ScopedProvider.create(AbstractDynamicStarMapModule_ProvideFragmentManagerFactory.create(builder.dynamicStarMapModule));
    this.googlePlayServicesCheckerProvider = GooglePlayServicesChecker_Factory.create((MembersInjector) MembersInjectors.noOp(), provideActivityProvider, provideSharedPreferencesProvider, provideLocationFragmentProvider, provideFragmentManagerProvider);
    this.provideEulaDialogFragmentProvider = ScopedProvider.create(AbstractDynamicStarMapModule_ProvideEulaDialogFragmentFactory.create(builder.dynamicStarMapModule));
    this.provideTimeTravelDialogFragmentProvider = ScopedProvider.create(AbstractDynamicStarMapModule_ProvideTimeTravelDialogFragmentFactory.create(builder.dynamicStarMapModule));
    this.provideHelpDialogFragmentProvider = ScopedProvider.create(AbstractDynamicStarMapModule_ProvideHelpDialogFragmentFactory.create(builder.dynamicStarMapModule));
    this.provideNoSearchResultsDialogFragmentProvider = ScopedProvider.create(AbstractDynamicStarMapModule_ProvideNoSearchResultsDialogFragmentFactory.create(builder.dynamicStarMapModule));
    this.provideMultipleSearchResultsDialogFragmentProvider = ScopedProvider.create(AbstractDynamicStarMapModule_ProvideMultipleSearchResultsDialogFragmentFactory.create(builder.dynamicStarMapModule));
    this.provideNoSensorsDialogFragmentProvider = ScopedProvider.create(AbstractDynamicStarMapModule_ProvideNoSensorsDialogFragmentFactory.create(builder.dynamicStarMapModule));
    this.toasterProvider = Toaster_Factory.create(provideActivityContextProvider);
    this.sensorAccuracyMonitorProvider = SensorAccuracyMonitor_Factory.create(provideSensorManagerProvider, provideActivityContextProvider, provideSharedPreferencesProvider, toasterProvider);
    this.provideMagDec1Provider = new Factory<MagneticDeclinationCalculator>() {
      private final ApplicationComponent applicationComponent = builder.applicationComponent;
      @Override public MagneticDeclinationCalculator get() {
        MagneticDeclinationCalculator provided = applicationComponent.provideMagDec1();
        if (provided == null) {
          throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
        return provided;
      }
    };
    this.provideMagDec2Provider = new Factory<MagneticDeclinationCalculator>() {
      private final ApplicationComponent applicationComponent = builder.applicationComponent;
      @Override public MagneticDeclinationCalculator get() {
        MagneticDeclinationCalculator provided = applicationComponent.provideMagDec2();
        if (provided == null) {
          throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
        return provided;
      }
    };
    this.magneticDeclinationCalculatorSwitcherProvider = MagneticDeclinationCalculatorSwitcher_Factory.create(provideAstronomerModelProvider, provideSharedPreferencesProvider, provideMagDec1Provider, provideMagDec2Provider);
    this.provideTimeTravelFlashAnimationProvider = ScopedProvider.create(AbstractDynamicStarMapModule_ProvideTimeTravelFlashAnimationFactory.create(builder.dynamicStarMapModule));
    this.dynamicStarMapActivityMembersInjector = DynamicStarMapActivity_MembersInjector.create((MembersInjector) MembersInjectors.noOp(), controllerGroupProvider, provideAstronomerModelProvider, provideSharedPreferencesProvider, provideLayerManagerProvider, provideTimeTravelNoiseProvider, provideTimeTravelBackNoiseProvider, provideHandlerProvider, analyticsProvider, googlePlayServicesCheckerProvider, provideFragmentManagerProvider, provideEulaDialogFragmentProvider, provideTimeTravelDialogFragmentProvider, provideHelpDialogFragmentProvider, provideNoSearchResultsDialogFragmentProvider, provideMultipleSearchResultsDialogFragmentProvider, provideNoSensorsDialogFragmentProvider, sensorAccuracyMonitorProvider, magneticDeclinationCalculatorSwitcherProvider, provideTimeTravelFlashAnimationProvider);
  }

  @Override
  public void inject(EulaDialogFragment fragment) {  
    eulaDialogFragmentMembersInjector.injectMembers(fragment);
  }

  @Override
  public void inject(TimeTravelDialogFragment fragment) {  
    timeTravelDialogFragmentMembersInjector.injectMembers(fragment);
  }

  @Override
  public void inject(HelpDialogFragment fragment) {  
    helpDialogFragmentMembersInjector.injectMembers(fragment);
  }

  @Override
  public void inject(NoSearchResultsDialogFragment fragment) {  
    noSearchResultsDialogFragmentMembersInjector.injectMembers(fragment);
  }

  @Override
  public void inject(MultipleSearchResultsDialogFragment fragment) {  
    multipleSearchResultsDialogFragmentMembersInjector.injectMembers(fragment);
  }

  @Override
  public void inject(NoSensorsDialogFragment fragment) {  
    noSensorsDialogFragmentMembersInjector.injectMembers(fragment);
  }

  @Override
  public void inject(DynamicStarMapActivity activity) {  
    dynamicStarMapActivityMembersInjector.injectMembers(activity);
  }

  public static final class Builder {
    private DynamicStarMapModule dynamicStarMapModule;
    private ApplicationComponent applicationComponent;
  
    private Builder() {  
    }
  
    public DynamicStarMapComponent build() {  
      if (dynamicStarMapModule == null) {
        throw new IllegalStateException("dynamicStarMapModule must be set");
      }
      if (applicationComponent == null) {
        throw new IllegalStateException("applicationComponent must be set");
      }
      return new DaggerDynamicStarMapComponent(this);
    }
  
    public Builder dynamicStarMapModule(DynamicStarMapModule dynamicStarMapModule) {  
      if (dynamicStarMapModule == null) {
        throw new NullPointerException("dynamicStarMapModule");
      }
      this.dynamicStarMapModule = dynamicStarMapModule;
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

