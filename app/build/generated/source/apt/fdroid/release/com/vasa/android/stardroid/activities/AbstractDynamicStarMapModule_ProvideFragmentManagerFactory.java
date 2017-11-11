package com.vasa.android.stardroid.activities;

import android.app.FragmentManager;
import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class AbstractDynamicStarMapModule_ProvideFragmentManagerFactory implements Factory<FragmentManager> {
  private final AbstractDynamicStarMapModule module;

  public AbstractDynamicStarMapModule_ProvideFragmentManagerFactory(AbstractDynamicStarMapModule module) {  
    assert module != null;
    this.module = module;
  }

  @Override
  public FragmentManager get() {  
    FragmentManager provided = module.provideFragmentManager();
    if (provided == null) {
      throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
    return provided;
  }

  public static Factory<FragmentManager> create(AbstractDynamicStarMapModule module) {  
    return new AbstractDynamicStarMapModule_ProvideFragmentManagerFactory(module);
  }
}

