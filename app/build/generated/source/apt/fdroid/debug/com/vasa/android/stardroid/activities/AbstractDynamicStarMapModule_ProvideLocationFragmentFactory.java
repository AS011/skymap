package com.vasa.android.stardroid.activities;

import com.vasa.android.stardroid.activities.dialogs.LocationPermissionRationaleFragment;
import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class AbstractDynamicStarMapModule_ProvideLocationFragmentFactory implements Factory<LocationPermissionRationaleFragment> {
  private final AbstractDynamicStarMapModule module;

  public AbstractDynamicStarMapModule_ProvideLocationFragmentFactory(AbstractDynamicStarMapModule module) {  
    assert module != null;
    this.module = module;
  }

  @Override
  public LocationPermissionRationaleFragment get() {  
    LocationPermissionRationaleFragment provided = module.provideLocationFragment();
    if (provided == null) {
      throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
    return provided;
  }

  public static Factory<LocationPermissionRationaleFragment> create(AbstractDynamicStarMapModule module) {  
    return new AbstractDynamicStarMapModule_ProvideLocationFragmentFactory(module);
  }
}

