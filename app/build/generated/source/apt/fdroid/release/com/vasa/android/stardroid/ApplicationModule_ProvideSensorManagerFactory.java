package com.vasa.android.stardroid;

import android.hardware.SensorManager;
import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class ApplicationModule_ProvideSensorManagerFactory implements Factory<SensorManager> {
  private final ApplicationModule module;

  public ApplicationModule_ProvideSensorManagerFactory(ApplicationModule module) {  
    assert module != null;
    this.module = module;
  }

  @Override
  public SensorManager get() {  
    SensorManager provided = module.provideSensorManager();
    if (provided == null) {
      throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
    return provided;
  }

  public static Factory<SensorManager> create(ApplicationModule module) {  
    return new ApplicationModule_ProvideSensorManagerFactory(module);
  }
}

