package com.vasa.android.stardroid.activities;

import android.view.animation.Animation;
import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class SplashScreenModule_ProvideFadeoutAnimationFactory implements Factory<Animation> {
  private final SplashScreenModule module;

  public SplashScreenModule_ProvideFadeoutAnimationFactory(SplashScreenModule module) {  
    assert module != null;
    this.module = module;
  }

  @Override
  public Animation get() {  
    Animation provided = module.provideFadeoutAnimation();
    if (provided == null) {
      throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
    return provided;
  }

  public static Factory<Animation> create(SplashScreenModule module) {  
    return new SplashScreenModule_ProvideFadeoutAnimationFactory(module);
  }
}

