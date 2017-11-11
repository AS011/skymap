package com.vasa.android.stardroid.activities;

import com.vasa.android.stardroid.ApplicationComponent;
import com.vasa.android.stardroid.activities.dialogs.EulaDialogFragment;
import com.vasa.android.stardroid.activities.dialogs.WhatsNewDialogFragment;
import com.vasa.android.stardroid.inject.PerActivity;

import dagger.Component;

/**
 * Created by johntaylor on 4/2/16.
 */
@PerActivity
@Component(modules={SplashScreenModule.class}, dependencies = {ApplicationComponent.class})
public interface SplashScreenComponent extends EulaDialogFragment.ActivityComponent,
        WhatsNewDialogFragment.ActivityComponent {
  void inject(SplashScreenActivity activity);
}
