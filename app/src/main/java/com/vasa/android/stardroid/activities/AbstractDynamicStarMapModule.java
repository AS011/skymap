package com.vasa.android.stardroid.activities;

import android.app.Activity;
import android.app.FragmentManager;
import android.content.Context;
import android.media.MediaPlayer;
import android.os.Handler;
import android.util.Log;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import com.vasa.android.stardroid.R;
import com.vasa.android.stardroid.activities.dialogs.EulaDialogFragment;
import com.vasa.android.stardroid.activities.dialogs.HelpDialogFragment;
import com.vasa.android.stardroid.activities.dialogs.LocationPermissionRationaleFragment;
import com.vasa.android.stardroid.activities.dialogs.MultipleSearchResultsDialogFragment;
import com.vasa.android.stardroid.activities.dialogs.NoSearchResultsDialogFragment;
import com.vasa.android.stardroid.activities.dialogs.NoSensorsDialogFragment;
import com.vasa.android.stardroid.activities.dialogs.TimeTravelDialogFragment;
import com.vasa.android.stardroid.inject.PerActivity;
import com.vasa.android.stardroid.util.MiscUtil;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

/**
 * Dagger module
 * Created by johntaylor on 3/29/16.
 */
@Module
public class AbstractDynamicStarMapModule {
  private static final String TAG = MiscUtil.getTag(DynamicStarMapModule.class);
  private DynamicStarMapActivity activity;

  public AbstractDynamicStarMapModule(DynamicStarMapActivity activity) {
    Log.d(TAG, "Creating activity module for " + activity);
    this.activity = activity;
  }

  @Provides
  @PerActivity
  DynamicStarMapActivity provideDynamicStarMapActivity() {
    return activity;
  }

  @Provides
  @PerActivity
  Activity provideActivity() {
    return activity;
  }

  @Provides
  @PerActivity
  Context provideActivityContext() {
    return activity;
  }

  @Provides
  @PerActivity
  EulaDialogFragment provideEulaDialogFragment() {
    EulaDialogFragment fragment = new EulaDialogFragment();
    return fragment;
  }

  @Provides
  @PerActivity
  TimeTravelDialogFragment provideTimeTravelDialogFragment() {
    return new TimeTravelDialogFragment();
  }

  @Provides
  @PerActivity
  HelpDialogFragment provideHelpDialogFragment() {
    return new HelpDialogFragment();
  }

  @Provides
  @PerActivity
  NoSearchResultsDialogFragment provideNoSearchResultsDialogFragment() {
    return new NoSearchResultsDialogFragment();
  }

  @Provides
  @PerActivity
  MultipleSearchResultsDialogFragment provideMultipleSearchResultsDialogFragment() {
    return new MultipleSearchResultsDialogFragment();
  }

  @Provides
  @PerActivity
  NoSensorsDialogFragment provideNoSensorsDialogFragment() {
    return new NoSensorsDialogFragment();
  }

  @Provides
  @PerActivity
  @Named("timetravel")
  MediaPlayer provideTimeTravelNoise() {
    return MediaPlayer.create(activity, R.raw.timetravel);
  }

  @Provides
  @PerActivity
  @Named("timetravelback")
  MediaPlayer provideTimeTravelBackNoise() {
    return MediaPlayer.create(activity, R.raw.timetravelback);
  }

  @Provides
  @PerActivity
  Animation provideTimeTravelFlashAnimation() {
    return AnimationUtils.loadAnimation(activity, R.anim.timetravelflash);
  }

  @Provides
  @PerActivity
  Handler provideHandler() {
    return new Handler();
  }

  @Provides
  @PerActivity
  FragmentManager provideFragmentManager() {
    return activity.getFragmentManager();
  }

  @Provides
  @PerActivity
  LocationPermissionRationaleFragment provideLocationFragment() {
    return new LocationPermissionRationaleFragment();
  }
}
