package com.vasa.android.stardroid.activities;

import com.vasa.android.stardroid.ApplicationComponent;
import com.vasa.android.stardroid.inject.PerActivity;

import dagger.Component;

/**
 * Created by johntaylor on 4/24/16.
 */
@PerActivity
@Component(modules={CompassCalibrationModule.class}, dependencies = {ApplicationComponent.class})
public interface CompassCalibrationComponent {
  void inject(CompassCalibrationActivity activity);
}

