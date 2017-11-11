package com.vasa.android.stardroid.activities;

import com.vasa.android.stardroid.activities.dialogs.NoSearchResultsDialogFragment;
import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class AbstractDynamicStarMapModule_ProvideNoSearchResultsDialogFragmentFactory implements Factory<NoSearchResultsDialogFragment> {
  private final AbstractDynamicStarMapModule module;

  public AbstractDynamicStarMapModule_ProvideNoSearchResultsDialogFragmentFactory(AbstractDynamicStarMapModule module) {  
    assert module != null;
    this.module = module;
  }

  @Override
  public NoSearchResultsDialogFragment get() {  
    NoSearchResultsDialogFragment provided = module.provideNoSearchResultsDialogFragment();
    if (provided == null) {
      throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
    return provided;
  }

  public static Factory<NoSearchResultsDialogFragment> create(AbstractDynamicStarMapModule module) {  
    return new AbstractDynamicStarMapModule_ProvideNoSearchResultsDialogFragmentFactory(module);
  }
}

