package com.vasa.android.stardroid.activities;

import com.vasa.android.stardroid.activities.dialogs.NoSensorsDialogFragment;
import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class AbstractDynamicStarMapModule_ProvideNoSensorsDialogFragmentFactory implements Factory<NoSensorsDialogFragment> {
  private final AbstractDynamicStarMapModule module;

  public AbstractDynamicStarMapModule_ProvideNoSensorsDialogFragmentFactory(AbstractDynamicStarMapModule module) {  
    assert module != null;
    this.module = module;
  }

  @Override
  public NoSensorsDialogFragment get() {  
    NoSensorsDialogFragment provided = module.provideNoSensorsDialogFragment();
    if (provided == null) {
      throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
    return provided;
  }

  public static Factory<NoSensorsDialogFragment> create(AbstractDynamicStarMapModule module) {  
    return new AbstractDynamicStarMapModule_ProvideNoSensorsDialogFragmentFactory(module);
  }
}

