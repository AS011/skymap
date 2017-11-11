package com.vasa.android.stardroid;

import android.app.Application;
import android.content.SharedPreferences;
import android.hardware.SensorManager;
import com.vasa.android.stardroid.layers.LayerManager;
import com.vasa.android.stardroid.util.Analytics;
import com.vasa.android.stardroid.util.PreferenceChangeAnalyticsTracker;
import dagger.MembersInjector;
import java.util.concurrent.ExecutorService;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class StardroidApplication_MembersInjector implements MembersInjector<StardroidApplication> {
  private final MembersInjector<Application> supertypeInjector;
  private final Provider<SharedPreferences> preferencesProvider;
  private final Provider<LayerManager> layerManagerProvider;
  private final Provider<ExecutorService> backgroundExecutorProvider;
  private final Provider<Analytics> analyticsProvider;
  private final Provider<SensorManager> sensorManagerProvider;
  private final Provider<PreferenceChangeAnalyticsTracker> preferenceChangeAnalyticsTrackerProvider;

  public StardroidApplication_MembersInjector(MembersInjector<Application> supertypeInjector, Provider<SharedPreferences> preferencesProvider, Provider<LayerManager> layerManagerProvider, Provider<ExecutorService> backgroundExecutorProvider, Provider<Analytics> analyticsProvider, Provider<SensorManager> sensorManagerProvider, Provider<PreferenceChangeAnalyticsTracker> preferenceChangeAnalyticsTrackerProvider) {  
    assert supertypeInjector != null;
    this.supertypeInjector = supertypeInjector;
    assert preferencesProvider != null;
    this.preferencesProvider = preferencesProvider;
    assert layerManagerProvider != null;
    this.layerManagerProvider = layerManagerProvider;
    assert backgroundExecutorProvider != null;
    this.backgroundExecutorProvider = backgroundExecutorProvider;
    assert analyticsProvider != null;
    this.analyticsProvider = analyticsProvider;
    assert sensorManagerProvider != null;
    this.sensorManagerProvider = sensorManagerProvider;
    assert preferenceChangeAnalyticsTrackerProvider != null;
    this.preferenceChangeAnalyticsTrackerProvider = preferenceChangeAnalyticsTrackerProvider;
  }

  @Override
  public void injectMembers(StardroidApplication instance) {  
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    supertypeInjector.injectMembers(instance);
    instance.preferences = preferencesProvider.get();
    instance.layerManager = layerManagerProvider.get();
    instance.backgroundExecutor = backgroundExecutorProvider.get();
    instance.analytics = analyticsProvider.get();
    instance.sensorManager = sensorManagerProvider.get();
    instance.preferenceChangeAnalyticsTracker = preferenceChangeAnalyticsTrackerProvider.get();
  }

  public static MembersInjector<StardroidApplication> create(MembersInjector<Application> supertypeInjector, Provider<SharedPreferences> preferencesProvider, Provider<LayerManager> layerManagerProvider, Provider<ExecutorService> backgroundExecutorProvider, Provider<Analytics> analyticsProvider, Provider<SensorManager> sensorManagerProvider, Provider<PreferenceChangeAnalyticsTracker> preferenceChangeAnalyticsTrackerProvider) {  
      return new StardroidApplication_MembersInjector(supertypeInjector, preferencesProvider, layerManagerProvider, backgroundExecutorProvider, analyticsProvider, sensorManagerProvider, preferenceChangeAnalyticsTrackerProvider);
  }
}

