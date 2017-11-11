package com.vasa.android.stardroid.activities;

import com.vasa.android.stardroid.activities.dialogs.HelpDialogFragment;
import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class AbstractDynamicStarMapModule_ProvideHelpDialogFragmentFactory implements Factory<HelpDialogFragment> {
  private final AbstractDynamicStarMapModule module;

  public AbstractDynamicStarMapModule_ProvideHelpDialogFragmentFactory(AbstractDynamicStarMapModule module) {  
    assert module != null;
    this.module = module;
  }

  @Override
  public HelpDialogFragment get() {  
    HelpDialogFragment provided = module.provideHelpDialogFragment();
    if (provided == null) {
      throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
    return provided;
  }

  public static Factory<HelpDialogFragment> create(AbstractDynamicStarMapModule module) {  
    return new AbstractDynamicStarMapModule_ProvideHelpDialogFragmentFactory(module);
  }
}

