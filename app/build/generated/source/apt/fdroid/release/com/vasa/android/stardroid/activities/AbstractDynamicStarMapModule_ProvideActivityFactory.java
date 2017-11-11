package com.vasa.android.stardroid.activities;

import android.app.Activity;
import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class AbstractDynamicStarMapModule_ProvideActivityFactory implements Factory<Activity> {
  private final AbstractDynamicStarMapModule module;

  public AbstractDynamicStarMapModule_ProvideActivityFactory(AbstractDynamicStarMapModule module) {  
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

  public static Factory<Activity> create(AbstractDynamicStarMapModule module) {  
    return new AbstractDynamicStarMapModule_ProvideActivityFactory(module);
  }
}

