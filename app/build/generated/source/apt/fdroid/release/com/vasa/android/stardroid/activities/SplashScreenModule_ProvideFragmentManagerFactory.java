package com.vasa.android.stardroid.activities;

import android.app.FragmentManager;
import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class SplashScreenModule_ProvideFragmentManagerFactory implements Factory<FragmentManager> {
  private final SplashScreenModule module;

  public SplashScreenModule_ProvideFragmentManagerFactory(SplashScreenModule module) {  
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

  public static Factory<FragmentManager> create(SplashScreenModule module) {  
    return new SplashScreenModule_ProvideFragmentManagerFactory(module);
  }
}

