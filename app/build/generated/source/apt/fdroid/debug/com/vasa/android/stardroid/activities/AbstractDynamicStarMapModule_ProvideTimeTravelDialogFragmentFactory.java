package com.vasa.android.stardroid.activities;

import com.vasa.android.stardroid.activities.dialogs.TimeTravelDialogFragment;
import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class AbstractDynamicStarMapModule_ProvideTimeTravelDialogFragmentFactory implements Factory<TimeTravelDialogFragment> {
  private final AbstractDynamicStarMapModule module;

  public AbstractDynamicStarMapModule_ProvideTimeTravelDialogFragmentFactory(AbstractDynamicStarMapModule module) {  
    assert module != null;
    this.module = module;
  }

  @Override
  public TimeTravelDialogFragment get() {  
    TimeTravelDialogFragment provided = module.provideTimeTravelDialogFragment();
    if (provided == null) {
      throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
    return provided;
  }

  public static Factory<TimeTravelDialogFragment> create(AbstractDynamicStarMapModule module) {  
    return new AbstractDynamicStarMapModule_ProvideTimeTravelDialogFragmentFactory(module);
  }
}

