package com.vasa.android.stardroid.activities;

import android.app.Activity;
import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class SplashScreenModule_ProvideActivityFactory implements Factory<Activity> {
  private final SplashScreenModule module;

  public SplashScreenModule_ProvideActivityFactory(SplashScreenModule module) {  
    assert module != null;
    this.module = module;
  }

  @Override
  public Activity get() {  
    Activity provided = module.provideActivity();
    if (provided == null) {
      throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
    return provided;
  }

  public static Factory<Activity> create(SplashScreenModule module) {  
    return new SplashScreenModule_ProvideActivityFactory(module);
  }
}

