package com.vasa.android.stardroid.activities;

import android.app.FragmentManager;
import android.content.SharedPreferences;
import android.view.animation.Animation;
import com.vasa.android.stardroid.StardroidApplication;
import com.vasa.android.stardroid.activities.dialogs.EulaDialogFragment;
import com.vasa.android.stardroid.activities.dialogs.WhatsNewDialogFragment;
import com.vasa.android.stardroid.activities.util.ConstraintsChecker;
import com.vasa.android.stardroid.util.Analytics;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class SplashScreenActivity_MembersInjector implements MembersInjector<SplashScreenActivity> {
  private final MembersInjector<InjectableActivity> supertypeInjector;
  private final Provider<StardroidApplication> appProvider;
  private final Provider<Analytics> analyticsProvider;
  private final Provider<SharedPreferences> sharedPreferencesProvider;
  private final Provider<Animation> fadeAnimationProvider;
  private final Provider<EulaDialogFragment> eulaDialogFragmentWithButtonsProvider;
  private final Provider<FragmentManager> fragmentManagerProvider;
  private final Provider<WhatsNewDialogFragment> whatsNewDialogFragmentProvider;
  private final Provider<ConstraintsChecker> ccProvider;

  public SplashScreenActivity_MembersInjector(MembersInjector<InjectableActivity> supertypeInjector, Provider<StardroidApplication> appProvider, Provider<Analytics> analyticsProvider, Provider<SharedPreferences> sharedPreferencesProvider, Provider<Animation> fadeAnimationProvider, Provider<EulaDialogFragment> eulaDialogFragmentWithButtonsProvider, Provider<FragmentManager> fragmentManagerProvider, Provider<WhatsNewDialogFragment> whatsNewDialogFragmentProvider, Provider<ConstraintsChecker> ccProvider) {  
    assert supertypeInjector != null;
    this.supertypeInjector = supertypeInjector;
    assert appProvider != null;
    this.appProvider = appProvider;
    assert analyticsProvider != null;
    this.analyticsProvider = analyticsProvider;
    assert sharedPreferencesProvider != null;
    this.sharedPreferencesProvider = sharedPreferencesProvider;
    assert fadeAnimationProvider != null;
    this.fadeAnimationProvider = fadeAnimationProvider;
    assert eulaDialogFragmentWithButtonsProvider != null;
    this.eulaDialogFragmentWithButtonsProvider = eulaDialogFragmentWithButtonsProvider;
    assert fragmentManagerProvider != null;
    this.fragmentManagerProvider = fragmentManagerProvider;
    assert whatsNewDialogFragmentProvider != null;
    this.whatsNewDialogFragmentProvider = whatsNewDialogFragmentProvider;
    assert ccProvider != null;
    this.ccProvider = ccProvider;
  }

  @Override
  public void injectMembers(SplashScreenActivity instance) {  
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    supertypeInjector.injectMembers(instance);
    instance.app = appProvider.get();
    instance.analytics = analyticsProvider.get();
    instance.sharedPreferences = sharedPreferencesProvider.get();
    instance.fadeAnimation = fadeAnimationProvider.get();
    instance.eulaDialogFragmentWithButtons = eulaDialogFragmentWithButtonsProvider.get();
    instance.fragmentManager = fragmentManagerProvider.get();
    instance.whatsNewDialogFragment = whatsNewDialogFragmentProvider.get();
    instance.cc = ccProvider.get();
  }

  public static MembersInjector<SplashScreenActivity> create(MembersInjector<InjectableActivity> supertypeInjector, Provider<StardroidApplication> appProvider, Provider<Analytics> analyticsProvider, Provider<SharedPreferences> sharedPreferencesProvider, Provider<Animation> fadeAnimationProvider, Provider<EulaDialogFragment> eulaDialogFragmentWithButtonsProvider, Provider<FragmentManager> fragmentManagerProvider, Provider<WhatsNewDialogFragment> whatsNewDialogFragmentProvider, Provider<ConstraintsChecker> ccProvider) {  
      return new SplashScreenActivity_MembersInjector(supertypeInjector, appProvider, analyticsProvider, sharedPreferencesProvider, fadeAnimationProvider, eulaDialogFragmentWithButtonsProvider, fragmentManagerProvider, whatsNewDialogFragmentProvider, ccProvider);
  }
}

