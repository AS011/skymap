package com.vasa.android.stardroid.activities;

import android.app.Activity;

import com.vasa.android.stardroid.ApplicationComponent;
import com.vasa.android.stardroid.StardroidApplication;

/**
 * Base class for all activities injected by Dagger.
 *
 * Created by johntaylor on 4/9/16.
 */
public abstract class InjectableActivity extends Activity {
  protected ApplicationComponent getApplicationComponent() {
    return ((StardroidApplication) getApplication()).getApplicationComponent();
  }
}
