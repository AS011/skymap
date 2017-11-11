package com.vasa.android.stardroid.activities;

import com.vasa.android.stardroid.activities.dialogs.WhatsNewDialogFragment;
import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class SplashScreenModule_ProvideWhatsNewDialogFragmentFactory implements Factory<WhatsNewDialogFragment> {
  private final SplashScreenModule module;

  public SplashScreenModule_ProvideWhatsNewDialogFragmentFactory(SplashScreenModule module) {  
    assert module != null;
    this.module = module;
  }

  @Override
  public WhatsNewDialogFragment get() {  
    WhatsNewDialogFragment provided = module.provideWhatsNewDialogFragment();
    if (provided == null) {
      throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
    return provided;
  }

  public static Factory<WhatsNewDialogFragment> create(SplashScreenModule module) {  
    return new SplashScreenModule_ProvideWhatsNewDialogFragmentFactory(module);
  }
}

