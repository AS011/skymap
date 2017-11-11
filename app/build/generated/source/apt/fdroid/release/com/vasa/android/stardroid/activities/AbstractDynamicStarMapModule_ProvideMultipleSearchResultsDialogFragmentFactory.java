package com.vasa.android.stardroid.activities;

import com.vasa.android.stardroid.activities.dialogs.MultipleSearchResultsDialogFragment;
import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class AbstractDynamicStarMapModule_ProvideMultipleSearchResultsDialogFragmentFactory implements Factory<MultipleSearchResultsDialogFragment> {
  private final AbstractDynamicStarMapModule module;

  public AbstractDynamicStarMapModule_ProvideMultipleSearchResultsDialogFragmentFactory(AbstractDynamicStarMapModule module) {  
    assert module != null;
    this.module = module;
  }

  @Override
  public MultipleSearchResultsDialogFragment get() {  
    MultipleSearchResultsDialogFragment provided = module.provideMultipleSearchResultsDialogFragment();
    if (provided == null) {
      throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
    return provided;
  }

  public static Factory<MultipleSearchResultsDialogFragment> create(AbstractDynamicStarMapModule module) {  
    return new AbstractDynamicStarMapModule_ProvideMultipleSearchResultsDialogFragmentFactory(module);
  }
}

