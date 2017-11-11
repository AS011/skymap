package com.vasa.android.stardroid;

import android.location.LocationManager;
import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class ApplicationModule_ProvideLocationManagerFactory implements Factory<LocationManager> {
  private final ApplicationModule module;

  public ApplicationModule_ProvideLocationManagerFactory(ApplicationModule module) {  
    assert module != null;
    this.module = module;
  }

  @Override
  public LocationManager get() {  
    LocationManager provided = module.provideLocationManager();
    if (provided == null) {
      throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
    return provided;
  }

  public static Factory<LocationManager> create(ApplicationModule module) {  
    return new ApplicationModule_ProvideLocationManagerFactory(module);
  }
}

