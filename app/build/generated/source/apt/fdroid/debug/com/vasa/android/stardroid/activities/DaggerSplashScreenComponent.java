package com.vasa.android.stardroid.activities;

import android.app.Activity;
import android.app.FragmentManager;
import android.content.SharedPreferences;
import android.view.animation.Animation;
import com.vasa.android.stardroid.ApplicationComponent;
import com.vasa.android.stardroid.StardroidApplication;
import com.vasa.android.stardroid.activities.dialogs.EulaDialogFragment;
import com.vasa.android.stardroid.activities.dialogs.EulaDialogFragment_MembersInjector;
import com.vasa.android.stardroid.activities.dialogs.WhatsNewDialogFragment;
import com.vasa.android.stardroid.activities.dialogs.WhatsNewDialogFragment_MembersInjector;
import com.vasa.android.stardroid.activities.util.ConstraintsChecker_Factory;
import com.vasa.android.stardroid.util.Analytics;
import com.vasa.android.stardroid.util.Analytics_Factory;
import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import dagger.internal.ScopedProvider;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class DaggerSplashScreenComponent implements SplashScreenComponent {
  private Provider<Activity> provideActivityProvider;
  private Provider<StardroidApplication> provideStardroidApplicationProvider;
  private Provider<Analytics> analyticsProvider;
  private MembersInjector<EulaDialogFragment> eulaDialogFragmentMembersInjector;
  private MembersInjector<WhatsNewDialogFragment> whatsNewDialogFragmentMembersInjector;
  private Provider<SharedPreferences> provideSharedPreferencesProvider;
  private Provider<Animation> provideFadeoutAnimationProvider;
  private Provider<EulaDialogFragment> provideEulaDialogFragmentProvider;
  private Provider<FragmentManager> provideFragmentManagerProvider;
  private Provider<WhatsNewDialogFragment> provideWhatsNewDialogFragmentProvider;
  private MembersInjector<SplashScreenActivity> splashScreenActivityMembersInjector;

  private DaggerSplashScreenComponent(Builder builder) {  
    assert builder != null;
    initialize(builder);
  }

  public static Builder builder() {  
    return new Builder();
  }

  private void initialize(final Builder builder) {  
    this.provideActivityProvider = ScopedProvider.create(SplashScreenModule_ProvideActivityFactory.create(builder.splashScreenModule));
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
    this.whatsNewDialogFragmentMembersInjector = WhatsNewDialogFragment_MembersInjector.create((MembersInjector) MembersInjectors.noOp(), provideActivityProvider);
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
    this.provideFadeoutAnimationProvider = ScopedProvider.create(SplashScreenModule_ProvideFadeoutAnimationFactory.create(builder.splashScreenModule));
    this.provideEulaDialogFragmentProvider = ScopedProvider.create(SplashScreenModule_ProvideEulaDialogFragmentFactory.create(builder.splashScreenModule));
    this.provideFragmentManagerProvider = ScopedProvider.create(SplashScreenModule_ProvideFragmentManagerFactory.create(builder.splashScreenModule));
    this.provideWhatsNewDialogFragmentProvider = ScopedProvider.create(SplashScreenModule_ProvideWhatsNewDialogFragmentFactory.create(builder.splashScreenModule));
    this.splashScreenActivityMembersInjector = SplashScreenActivity_MembersInjector.create((MembersInjector) MembersInjectors.noOp(), provideStardroidApplicationProvider, analyticsProvider, provideSharedPreferencesProvider, provideFadeoutAnimationProvider, provideEulaDialogFragmentProvider, provideFragmentManagerProvider, provideWhatsNewDialogFragmentProvider, ConstraintsChecker_Factory.create());
  }

  @Override
  public void inject(EulaDialogFragment fragment) {  
    eulaDialogFragmentMembersInjector.injectMembers(fragment);
  }

  @Override
  public void inject(WhatsNewDialogFragment fragment) {  
    whatsNewDialogFragmentMembersInjector.injectMembers(fragment);
  }

  @Override
  public void inject(SplashScreenActivity activity) {  
    splashScreenActivityMembersInjector.injectMembers(activity);
  }

  public static final class Builder {
    private SplashScreenModule splashScreenModule;
    private ApplicationComponent applicationComponent;
  
    private Builder() {  
    }
  
    public SplashScreenComponent build() {  
      if (splashScreenModule == null) {
        throw new IllegalStateException("splashScreenModule must be set");
      }
      if (applicationComponent == null) {
        throw new IllegalStateException("applicationComponent must be set");
      }
      return new DaggerSplashScreenComponent(this);
    }
  
    public Builder splashScreenModule(SplashScreenModule splashScreenModule) {  
      if (splashScreenModule == null) {
        throw new NullPointerException("splashScreenModule");
      }
      this.splashScreenModule = splashScreenModule;
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

