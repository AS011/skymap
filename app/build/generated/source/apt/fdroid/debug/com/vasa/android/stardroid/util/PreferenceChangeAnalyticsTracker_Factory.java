package com.vasa.android.stardroid.util;

import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class PreferenceChangeAnalyticsTracker_Factory implements Factory<PreferenceChangeAnalyticsTracker> {
  private final Provider<Analytics> analyticsProvider;

  public PreferenceChangeAnalyticsTracker_Factory(Provider<Analytics> analyticsProvider) {  
    assert analyticsProvider != null;
    this.analyticsProvider = analyticsProvider;
  }

  @Override
  public PreferenceChangeAnalyticsTracker get() {  
    return new PreferenceChangeAnalyticsTracker(analyticsProvider.get());
  }

  public static Factory<PreferenceChangeAnalyticsTracker> create(Provider<Analytics> analyticsProvider) {  
    return new PreferenceChangeAnalyticsTracker_Factory(analyticsProvider);
  }
}

