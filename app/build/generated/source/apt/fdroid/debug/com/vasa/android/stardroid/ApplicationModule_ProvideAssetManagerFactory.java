package com.vasa.android.stardroid;

import android.content.res.AssetManager;
import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class ApplicationModule_ProvideAssetManagerFactory implements Factory<AssetManager> {
  private final ApplicationModule module;

  public ApplicationModule_ProvideAssetManagerFactory(ApplicationModule module) {  
    assert module != null;
    this.module = module;
  }

  @Override
  public AssetManager get() {  
    AssetManager provided = module.provideAssetManager();
    if (provided == null) {
      throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
    return provided;
  }

  public static Factory<AssetManager> create(ApplicationModule module) {  
    return new ApplicationModule_ProvideAssetManagerFactory(module);
  }
}

