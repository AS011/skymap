package com.vasa.android.stardroid.activities;

import android.content.SharedPreferences;
import android.preference.PreferenceActivity;
import com.vasa.android.stardroid.util.Analytics;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class EditSettingsActivity_MembersInjector implements MembersInjector<EditSettingsActivity> {
  private final MembersInjector<PreferenceActivity> supertypeInjector;
  private final Provider<Analytics> analyticsProvider;
  private final Provider<SharedPreferences> sharedPreferencesProvider;

  public EditSettingsActivity_MembersInjector(MembersInjector<PreferenceActivity> supertypeInjector, Provider<Analytics> analyticsProvider, Provider<SharedPreferences> sharedPreferencesProvider) {  
    assert supertypeInjector != null;
    this.supertypeInjector = supertypeInjector;
    assert analyticsProvider != null;
    this.analyticsProvider = analyticsProvider;
    assert sharedPreferencesProvider != null;
    this.sharedPreferencesProvider = sharedPreferencesProvider;
  }

  @Override
  public void injectMembers(EditSettingsActivity instance) {  
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    supertypeInjector.injectMembers(instance);
    instance.analytics = analyticsProvider.get();
    instance.sharedPreferences = sharedPreferencesProvider.get();
  }

  public static MembersInjector<EditSettingsActivity> create(MembersInjector<PreferenceActivity> supertypeInjector, Provider<Analytics> analyticsProvider, Provider<SharedPreferences> sharedPreferencesProvider) {  
      return new EditSettingsActivity_MembersInjector(supertypeInjector, analyticsProvider, sharedPreferencesProvider);
  }
}

