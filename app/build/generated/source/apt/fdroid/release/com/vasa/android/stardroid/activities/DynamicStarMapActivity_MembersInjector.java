package com.vasa.android.stardroid.activities;

import android.app.FragmentManager;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.os.Handler;
import android.view.animation.Animation;
import com.vasa.android.stardroid.activities.dialogs.EulaDialogFragment;
import com.vasa.android.stardroid.activities.dialogs.HelpDialogFragment;
import com.vasa.android.stardroid.activities.dialogs.MultipleSearchResultsDialogFragment;
import com.vasa.android.stardroid.activities.dialogs.NoSearchResultsDialogFragment;
import com.vasa.android.stardroid.activities.dialogs.NoSensorsDialogFragment;
import com.vasa.android.stardroid.activities.dialogs.TimeTravelDialogFragment;
import com.vasa.android.stardroid.activities.util.GooglePlayServicesChecker;
import com.vasa.android.stardroid.control.AstronomerModel;
import com.vasa.android.stardroid.control.ControllerGroup;
import com.vasa.android.stardroid.control.MagneticDeclinationCalculatorSwitcher;
import com.vasa.android.stardroid.layers.LayerManager;
import com.vasa.android.stardroid.util.Analytics;
import com.vasa.android.stardroid.util.SensorAccuracyMonitor;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class DynamicStarMapActivity_MembersInjector implements MembersInjector<DynamicStarMapActivity> {
  private final MembersInjector<InjectableActivity> supertypeInjector;
  private final Provider<ControllerGroup> controllerProvider;
  private final Provider<AstronomerModel> modelProvider;
  private final Provider<SharedPreferences> sharedPreferencesProvider;
  private final Provider<LayerManager> layerManagerProvider;
  private final Provider<MediaPlayer> timeTravelNoiseProvider;
  private final Provider<MediaPlayer> timeTravelBackNoiseProvider;
  private final Provider<Handler> handlerProvider;
  private final Provider<Analytics> analyticsProvider;
  private final Provider<GooglePlayServicesChecker> playServicesCheckerProvider;
  private final Provider<FragmentManager> fragmentManagerProvider;
  private final Provider<EulaDialogFragment> eulaDialogFragmentNoButtonsProvider;
  private final Provider<TimeTravelDialogFragment> timeTravelDialogFragmentProvider;
  private final Provider<HelpDialogFragment> helpDialogFragmentProvider;
  private final Provider<NoSearchResultsDialogFragment> noSearchResultsDialogFragmentProvider;
  private final Provider<MultipleSearchResultsDialogFragment> multipleSearchResultsDialogFragmentProvider;
  private final Provider<NoSensorsDialogFragment> noSensorsDialogFragmentProvider;
  private final Provider<SensorAccuracyMonitor> sensorAccuracyMonitorProvider;
  private final Provider<MagneticDeclinationCalculatorSwitcher> magneticSwitcherProvider;
  private final Provider<Animation> flashAnimationProvider;

  public DynamicStarMapActivity_MembersInjector(MembersInjector<InjectableActivity> supertypeInjector, Provider<ControllerGroup> controllerProvider, Provider<AstronomerModel> modelProvider, Provider<SharedPreferences> sharedPreferencesProvider, Provider<LayerManager> layerManagerProvider, Provider<MediaPlayer> timeTravelNoiseProvider, Provider<MediaPlayer> timeTravelBackNoiseProvider, Provider<Handler> handlerProvider, Provider<Analytics> analyticsProvider, Provider<GooglePlayServicesChecker> playServicesCheckerProvider, Provider<FragmentManager> fragmentManagerProvider, Provider<EulaDialogFragment> eulaDialogFragmentNoButtonsProvider, Provider<TimeTravelDialogFragment> timeTravelDialogFragmentProvider, Provider<HelpDialogFragment> helpDialogFragmentProvider, Provider<NoSearchResultsDialogFragment> noSearchResultsDialogFragmentProvider, Provider<MultipleSearchResultsDialogFragment> multipleSearchResultsDialogFragmentProvider, Provider<NoSensorsDialogFragment> noSensorsDialogFragmentProvider, Provider<SensorAccuracyMonitor> sensorAccuracyMonitorProvider, Provider<MagneticDeclinationCalculatorSwitcher> magneticSwitcherProvider, Provider<Animation> flashAnimationProvider) {  
    assert supertypeInjector != null;
    this.supertypeInjector = supertypeInjector;
    assert controllerProvider != null;
    this.controllerProvider = controllerProvider;
    assert modelProvider != null;
    this.modelProvider = modelProvider;
    assert sharedPreferencesProvider != null;
    this.sharedPreferencesProvider = sharedPreferencesProvider;
    assert layerManagerProvider != null;
    this.layerManagerProvider = layerManagerProvider;
    assert timeTravelNoiseProvider != null;
    this.timeTravelNoiseProvider = timeTravelNoiseProvider;
    assert timeTravelBackNoiseProvider != null;
    this.timeTravelBackNoiseProvider = timeTravelBackNoiseProvider;
    assert handlerProvider != null;
    this.handlerProvider = handlerProvider;
    assert analyticsProvider != null;
    this.analyticsProvider = analyticsProvider;
    assert playServicesCheckerProvider != null;
    this.playServicesCheckerProvider = playServicesCheckerProvider;
    assert fragmentManagerProvider != null;
    this.fragmentManagerProvider = fragmentManagerProvider;
    assert eulaDialogFragmentNoButtonsProvider != null;
    this.eulaDialogFragmentNoButtonsProvider = eulaDialogFragmentNoButtonsProvider;
    assert timeTravelDialogFragmentProvider != null;
    this.timeTravelDialogFragmentProvider = timeTravelDialogFragmentProvider;
    assert helpDialogFragmentProvider != null;
    this.helpDialogFragmentProvider = helpDialogFragmentProvider;
    assert noSearchResultsDialogFragmentProvider != null;
    this.noSearchResultsDialogFragmentProvider = noSearchResultsDialogFragmentProvider;
    assert multipleSearchResultsDialogFragmentProvider != null;
    this.multipleSearchResultsDialogFragmentProvider = multipleSearchResultsDialogFragmentProvider;
    assert noSensorsDialogFragmentProvider != null;
    this.noSensorsDialogFragmentProvider = noSensorsDialogFragmentProvider;
    assert sensorAccuracyMonitorProvider != null;
    this.sensorAccuracyMonitorProvider = sensorAccuracyMonitorProvider;
    assert magneticSwitcherProvider != null;
    this.magneticSwitcherProvider = magneticSwitcherProvider;
    assert flashAnimationProvider != null;
    this.flashAnimationProvider = flashAnimationProvider;
  }

  @Override
  public void injectMembers(DynamicStarMapActivity instance) {  
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    supertypeInjector.injectMembers(instance);
    instance.controller = controllerProvider.get();
    instance.model = modelProvider.get();
    instance.sharedPreferences = sharedPreferencesProvider.get();
    instance.layerManager = layerManagerProvider.get();
    instance.timeTravelNoiseProvider = timeTravelNoiseProvider;
    instance.timeTravelBackNoiseProvider = timeTravelBackNoiseProvider;
    instance.handler = handlerProvider.get();
    instance.analytics = analyticsProvider.get();
    instance.playServicesChecker = playServicesCheckerProvider.get();
    instance.fragmentManager = fragmentManagerProvider.get();
    instance.eulaDialogFragmentNoButtons = eulaDialogFragmentNoButtonsProvider.get();
    instance.timeTravelDialogFragment = timeTravelDialogFragmentProvider.get();
    instance.helpDialogFragment = helpDialogFragmentProvider.get();
    instance.noSearchResultsDialogFragment = noSearchResultsDialogFragmentProvider.get();
    instance.multipleSearchResultsDialogFragment = multipleSearchResultsDialogFragmentProvider.get();
    instance.noSensorsDialogFragment = noSensorsDialogFragmentProvider.get();
    instance.sensorAccuracyMonitor = sensorAccuracyMonitorProvider.get();
    instance.magneticSwitcher = magneticSwitcherProvider.get();
    instance.flashAnimation = flashAnimationProvider.get();
  }

  public static MembersInjector<DynamicStarMapActivity> create(MembersInjector<InjectableActivity> supertypeInjector, Provider<ControllerGroup> controllerProvider, Provider<AstronomerModel> modelProvider, Provider<SharedPreferences> sharedPreferencesProvider, Provider<LayerManager> layerManagerProvider, Provider<MediaPlayer> timeTravelNoiseProvider, Provider<MediaPlayer> timeTravelBackNoiseProvider, Provider<Handler> handlerProvider, Provider<Analytics> analyticsProvider, Provider<GooglePlayServicesChecker> playServicesCheckerProvider, Provider<FragmentManager> fragmentManagerProvider, Provider<EulaDialogFragment> eulaDialogFragmentNoButtonsProvider, Provider<TimeTravelDialogFragment> timeTravelDialogFragmentProvider, Provider<HelpDialogFragment> helpDialogFragmentProvider, Provider<NoSearchResultsDialogFragment> noSearchResultsDialogFragmentProvider, Provider<MultipleSearchResultsDialogFragment> multipleSearchResultsDialogFragmentProvider, Provider<NoSensorsDialogFragment> noSensorsDialogFragmentProvider, Provider<SensorAccuracyMonitor> sensorAccuracyMonitorProvider, Provider<MagneticDeclinationCalculatorSwitcher> magneticSwitcherProvider, Provider<Animation> flashAnimationProvider) {  
      return new DynamicStarMapActivity_MembersInjector(supertypeInjector, controllerProvider, modelProvider, sharedPreferencesProvider, layerManagerProvider, timeTravelNoiseProvider, timeTravelBackNoiseProvider, handlerProvider, analyticsProvider, playServicesCheckerProvider, fragmentManagerProvider, eulaDialogFragmentNoButtonsProvider, timeTravelDialogFragmentProvider, helpDialogFragmentProvider, noSearchResultsDialogFragmentProvider, multipleSearchResultsDialogFragmentProvider, noSensorsDialogFragmentProvider, sensorAccuracyMonitorProvider, magneticSwitcherProvider, flashAnimationProvider);
  }
}

