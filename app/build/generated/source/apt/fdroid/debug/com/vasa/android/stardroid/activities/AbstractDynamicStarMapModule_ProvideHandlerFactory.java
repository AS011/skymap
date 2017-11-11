package com.vasa.android.stardroid.activities;

import android.os.Handler;
import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class AbstractDynamicStarMapModule_ProvideHandlerFactory implements Factory<Handler> {
  private final AbstractDynamicStarMapModule module;

  public AbstractDynamicStarMapModule_ProvideHandlerFactory(AbstractDynamicStarMapModule module) {  
    assert module != null;
    this.module = module;
  }

  @Override
  public Handler get() {  
    Handler provided = module.provideHandler();
    if (provided == null) {
      throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
    return provided;
  }

  public static Factory<Handler> create(AbstractDynamicStarMapModule module) {  
    return new AbstractDynamicStarMapModule_ProvideHandlerFactory(module);
  }
}

