package com.vasa.android.stardroid.activities;

import com.vasa.android.stardroid.activities.dialogs.EulaDialogFragment;
import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class SplashScreenModule_ProvideEulaDialogFragmentFactory implements Factory<EulaDialogFragment> {
  private final SplashScreenModule module;

  public SplashScreenModule_ProvideEulaDialogFragmentFactory(SplashScreenModule module) {  
    assert module != null;
    this.module = module;
  }

  @Override
  public EulaDialogFragment get() {  
    EulaDialogFragment provided = module.provideEulaDialogFragment();
    if (provided == null) {
      throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
    return provided;
  }

  public static Factory<EulaDialogFragment> create(SplashScreenModule module) {  
    return new SplashScreenModule_ProvideEulaDialogFragmentFactory(module);
  }
}

