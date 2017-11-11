package com.vasa.android.stardroid;

import android.content.res.Resources;
import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class ApplicationModule_ProvideResourcesFactory implements Factory<Resources> {
  private final ApplicationModule module;

  public ApplicationModule_ProvideResourcesFactory(ApplicationModule module) {  
    assert module != null;
    this.module = module;
  }

  @Override
  public Resources get() {  
    Resources provided = module.provideResources();
    if (provided == null) {
      throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
    return provided;
  }

  public static Factory<Resources> create(ApplicationModule module) {  
    return new ApplicationModule_ProvideResourcesFactory(module);
  }
}

