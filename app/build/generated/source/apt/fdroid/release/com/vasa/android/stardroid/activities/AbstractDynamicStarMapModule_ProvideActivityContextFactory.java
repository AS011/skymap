package com.vasa.android.stardroid.activities;

import android.content.Context;
import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class AbstractDynamicStarMapModule_ProvideActivityContextFactory implements Factory<Context> {
  private final AbstractDynamicStarMapModule module;

  public AbstractDynamicStarMapModule_ProvideActivityContextFactory(AbstractDynamicStarMapModule module) {  
    assert module != null;
    this.module = module;
  }

  @Override
  public Context get() {  
    Context provided = module.provideActivityContext();
    if (provided == null) {
      throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
    return provided;
  }

  public static Factory<Context> create(AbstractDynamicStarMapModule module) {  
    return new AbstractDynamicStarMapModule_ProvideActivityContextFactory(module);
  }
}

