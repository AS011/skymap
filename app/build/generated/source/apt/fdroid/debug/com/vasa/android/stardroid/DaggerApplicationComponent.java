package com.vasa.android.stardroid;

import android.accounts.AccountManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.hardware.SensorManager;
import android.location.LocationManager;
import android.net.ConnectivityManager;
import com.vasa.android.stardroid.activities.EditSettingsActivity;
import com.vasa.android.stardroid.activities.EditSettingsActivity_MembersInjector;
import com.vasa.android.stardroid.activities.ImageDisplayActivity;
import com.vasa.android.stardroid.activities.ImageDisplayActivity_MembersInjector;
import com.vasa.android.stardroid.activities.ImageGalleryActivity;
import com.vasa.android.stardroid.activities.ImageGalleryActivity_MembersInjector;
import com.vasa.android.stardroid.control.AstronomerModel;
import com.vasa.android.stardroid.control.MagneticDeclinationCalculator;
import com.vasa.android.stardroid.layers.LayerManager;
import com.vasa.android.stardroid.search.SearchTermsProvider;
import com.vasa.android.stardroid.search.SearchTermsProvider_MembersInjector;
import com.vasa.android.stardroid.util.Analytics;
import com.vasa.android.stardroid.util.Analytics_Factory;
import com.vasa.android.stardroid.util.PreferenceChangeAnalyticsTracker;
import com.vasa.android.stardroid.util.PreferenceChangeAnalyticsTracker_Factory;
import dagger.MembersInjector;
import dagger.internal.MembersInjectors;
import dagger.internal.ScopedProvider;
import java.util.concurrent.ExecutorService;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class DaggerApplicationComponent implements ApplicationComponent {
  private Provider<StardroidApplication> provideApplicationProvider;
  private Provider<SharedPreferences> provideSharedPreferencesProvider;
  private Provider<SensorManager> provideSensorManagerProvider;
  private Provider<ConnectivityManager> provideConnectivityManagerProvider;
  private Provider<MagneticDeclinationCalculator> provideDefaultMagneticDeclinationCalculatorProvider;
  private Provider<AstronomerModel> provideAstronomerModelProvider;
  private Provider<LocationManager> provideLocationManagerProvider;
  private Provider<AssetManager> provideAssetManagerProvider;
  private Provider<Resources> provideResourcesProvider;
  private Provider<LayerManager> provideLayerManagerProvider;
  private Provider<Context> provideContextProvider;
  private Provider<AccountManager> provideAccountManagerProvider;
  private Provider<MagneticDeclinationCalculator> provideRealMagneticDeclinationCalculatorProvider;
  private Provider<ExecutorService> provideBackgroundExecutorProvider;
  private Provider<Analytics> analyticsProvider;
  private Provider<PreferenceChangeAnalyticsTracker> preferenceChangeAnalyticsTrackerProvider;
  private MembersInjector<StardroidApplication> stardroidApplicationMembersInjector;
  private MembersInjector<EditSettingsActivity> editSettingsActivityMembersInjector;
  private MembersInjector<ImageDisplayActivity> imageDisplayActivityMembersInjector;
  private MembersInjector<ImageGalleryActivity> imageGalleryActivityMembersInjector;
  private MembersInjector<SearchTermsProvider> searchTermsProviderMembersInjector;

  private DaggerApplicationComponent(Builder builder) {  
    assert builder != null;
    initialize(builder);
  }

  public static Builder builder() {  
    return new Builder();
  }

  private void initialize(final Builder builder) {  
    this.provideApplicationProvider = ScopedProvider.create(ApplicationModule_ProvideApplicationFactory.create(builder.applicationModule));
    this.provideSharedPreferencesProvider = ScopedProvider.create(ApplicationModule_ProvideSharedPreferencesFactory.create(builder.applicationModule));
    this.provideSensorManagerProvider = ScopedProvider.create(ApplicationModule_ProvideSensorManagerFactory.create(builder.applicationModule));
    this.provideConnectivityManagerProvider = ScopedProvider.create(ApplicationModule_ProvideConnectivityManagerFactory.create(builder.applicationModule));
    this.provideDefaultMagneticDeclinationCalculatorProvider = ScopedProvider.create(ApplicationModule_ProvideDefaultMagneticDeclinationCalculatorFactory.create(builder.applicationModule));
    this.provideAstronomerModelProvider = ScopedProvider.create(ApplicationModule_ProvideAstronomerModelFactory.create(builder.applicationModule, provideDefaultMagneticDeclinationCalculatorProvider));
    this.provideLocationManagerProvider = ScopedProvider.create(ApplicationModule_ProvideLocationManagerFactory.create(builder.applicationModule));
    this.provideAssetManagerProvider = ScopedProvider.create(ApplicationModule_ProvideAssetManagerFactory.create(builder.applicationModule));
    this.provideResourcesProvider = ScopedProvider.create(ApplicationModule_ProvideResourcesFactory.create(builder.applicationModule));
    this.provideLayerManagerProvider = ScopedProvider.create(ApplicationModule_ProvideLayerManagerFactory.create(builder.applicationModule, provideAssetManagerProvider, provideResourcesProvider, provideAstronomerModelProvider, provideSharedPreferencesProvider));
    this.provideContextProvider = ApplicationModule_ProvideContextFactory.create(builder.applicationModule);
    this.provideAccountManagerProvider = ScopedProvider.create(ApplicationModule_ProvideAccountManagerFactory.create(builder.applicationModule, provideContextProvider));
    this.provideRealMagneticDeclinationCalculatorProvider = ScopedProvider.create(ApplicationModule_ProvideRealMagneticDeclinationCalculatorFactory.create(builder.applicationModule));
    this.provideBackgroundExecutorProvider = ScopedProvider.create(ApplicationModule_ProvideBackgroundExecutorFactory.create(builder.applicationModule));
    this.analyticsProvider = Analytics_Factory.create(provideApplicationProvider);
    this.preferenceChangeAnalyticsTrackerProvider = PreferenceChangeAnalyticsTracker_Factory.create(analyticsProvider);
    this.stardroidApplicationMembersInjector = StardroidApplication_MembersInjector.create((MembersInjector) MembersInjectors.noOp(), provideSharedPreferencesProvider, provideLayerManagerProvider, provideBackgroundExecutorProvider, analyticsProvider, provideSensorManagerProvider, preferenceChangeAnalyticsTrackerProvider);
    this.editSettingsActivityMembersInjector = EditSettingsActivity_MembersInjector.create((MembersInjector) MembersInjectors.noOp(), analyticsProvider, provideSharedPreferencesProvider);
    this.imageDisplayActivityMembersInjector = ImageDisplayActivity_MembersInjector.create((MembersInjector) MembersInjectors.noOp(), analyticsProvider);
    this.imageGalleryActivityMembersInjector = ImageGalleryActivity_MembersInjector.create((MembersInjector) MembersInjectors.noOp(), analyticsProvider);
    this.searchTermsProviderMembersInjector = SearchTermsProvider_MembersInjector.create((MembersInjector) MembersInjectors.noOp(), provideLayerManagerProvider);
  }

  @Override
  public StardroidApplication provideStardroidApplication() {  
    return provideApplicationProvider.get();
  }

  @Override
  public SharedPreferences provideSharedPreferences() {  
    return provideSharedPreferencesProvider.get();
  }

  @Override
  public SensorManager provideSensorManager() {  
    return provideSensorManagerProvider.get();
  }

  @Override
  public ConnectivityManager provideConnectivityManager() {  
    return provideConnectivityManagerProvider.get();
  }

  @Override
  public AstronomerModel provideAstronomerModel() {  
    return provideAstronomerModelProvider.get();
  }

  @Override
  public LocationManager provideLocationManager() {  
    return provideLocationManagerProvider.get();
  }

  @Override
  public LayerManager provideLayerManager() {  
    return provideLayerManagerProvider.get();
  }

  @Override
  public AccountManager provideAccountManager() {  
    return provideAccountManagerProvider.get();
  }

  @Override
  public MagneticDeclinationCalculator provideMagDec1() {  
    return provideDefaultMagneticDeclinationCalculatorProvider.get();
  }

  @Override
  public MagneticDeclinationCalculator provideMagDec2() {  
    return provideRealMagneticDeclinationCalculatorProvider.get();
  }

  @Override
  public void inject(StardroidApplication app) {  
    stardroidApplicationMembersInjector.injectMembers(app);
  }

  @Override
  public void inject(EditSettingsActivity activity) {  
    editSettingsActivityMembersInjector.injectMembers(activity);
  }

  @Override
  public void inject(ImageDisplayActivity activity) {  
    imageDisplayActivityMembersInjector.injectMembers(activity);
  }

  @Override
  public void inject(ImageGalleryActivity activity) {  
    imageGalleryActivityMembersInjector.injectMembers(activity);
  }

  @Override
  public void inject(SearchTermsProvider provider) {  
    searchTermsProviderMembersInjector.injectMembers(provider);
  }

  public static final class Builder {
    private ApplicationModule applicationModule;
  
    private Builder() {  
    }
  
    public ApplicationComponent build() {  
      if (applicationModule == null) {
        throw new IllegalStateException("applicationModule must be set");
      }
      return new DaggerApplicationComponent(this);
    }
  
    public Builder applicationModule(ApplicationModule applicationModule) {  
      if (applicationModule == null) {
        throw new NullPointerException("applicationModule");
      }
      this.applicationModule = applicationModule;
      return this;
    }
  }
}

