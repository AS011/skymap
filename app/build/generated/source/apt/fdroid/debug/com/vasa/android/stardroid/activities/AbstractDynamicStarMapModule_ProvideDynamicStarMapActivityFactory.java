package com.vasa.android.stardroid.activities;

import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class AbstractDynamicStarMapModule_ProvideDynamicStarMapActivityFactory implements Factory<DynamicStarMapActivity> {
  private final AbstractDynamicStarMapModule module;

  public AbstractDynamicStarMapModule_ProvideDynamicStarMapActivityFactory(AbstractDynamicStarMapModule module) {  
    assert module != null;
    this.module = module;
  }

  @Override
  public DynamicStarMapActivity get() {  
    DynamicStarMapActivity provided = module.provideDynamicStarMapActivity();
    if (provided == null) {
      throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
    return provided;
  }

  public static Factory<DynamicStarMapActivity> create(AbstractDynamicStarMapModule module) {  
    return new AbstractDynamicStarMapModule_ProvideDynamicStarMapActivityFactory(module);
  }
}

