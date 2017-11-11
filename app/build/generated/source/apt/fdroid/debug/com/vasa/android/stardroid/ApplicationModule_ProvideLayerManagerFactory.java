package com.vasa.android.stardroid;

import android.content.SharedPreferences;
import android.content.res.AssetManager;
import android.content.res.Resources;
import com.vasa.android.stardroid.control.AstronomerModel;
import com.vasa.android.stardroid.layers.LayerManager;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class ApplicationModule_ProvideLayerManagerFactory implements Factory<LayerManager> {
  private final ApplicationModule module;
  private final Provider<AssetManager> assetManagerProvider;
  private final Provider<Resources> resourcesProvider;
  private final Provider<AstronomerModel> modelProvider;
  private final Provider<SharedPreferences> preferencesProvider;

  public ApplicationModule_ProvideLayerManagerFactory(ApplicationModule module, Provider<AssetManager> assetManagerProvider, Provider<Resources> resourcesProvider, Provider<AstronomerModel> modelProvider, Provider<SharedPreferences> preferencesProvider) {  
    assert module != null;
    this.module = module;
    assert assetManagerProvider != null;
    this.assetManagerProvider = assetManagerProvider;
    assert resourcesProvider != null;
    this.resourcesProvider = resourcesProvider;
    assert modelProvider != null;
    this.modelProvider = modelProvider;
    assert preferencesProvider != null;
    this.preferencesProvider = preferencesProvider;
  }

  @Override
  public LayerManager get() {  
    LayerManager provided = module.provideLayerManager(assetManagerProvider.get(), resourcesProvider.get(), modelProvider.get(), preferencesProvider.get());
    if (provided == null) {
      throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
    return provided;
  }

  public static Factory<LayerManager> create(ApplicationModule module, Provider<AssetManager> assetManagerProvider, Provider<Resources> resourcesProvider, Provider<AstronomerModel> modelProvider, Provider<SharedPreferences> preferencesProvider) {  
    return new ApplicationModule_ProvideLayerManagerFactory(module, assetManagerProvider, resourcesProvider, modelProvider, preferencesProvider);
  }
}

