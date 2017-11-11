package com.vasa.android.stardroid.activities;

import android.view.animation.Animation;
import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class AbstractDynamicStarMapModule_ProvideTimeTravelFlashAnimationFactory implements Factory<Animation> {
  private final AbstractDynamicStarMapModule module;

  public AbstractDynamicStarMapModule_ProvideTimeTravelFlashAnimationFactory(AbstractDynamicStarMapModule module) {  
    assert module != null;
    this.module = module;
  }

  @Override
  public Animation get() {  
    Animation provided = module.provideTimeTravelFlashAnimation();
    if (provided == null) {
      throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
    return provided;
  }

  public static Factory<Animation> create(AbstractDynamicStarMapModule module) {  
    return new AbstractDynamicStarMapModule_ProvideTimeTravelFlashAnimationFactory(module);
  }
}

