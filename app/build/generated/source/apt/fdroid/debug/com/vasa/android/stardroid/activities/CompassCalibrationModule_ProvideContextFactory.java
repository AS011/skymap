package com.vasa.android.stardroid.activities;

import android.content.Context;
import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class CompassCalibrationModule_ProvideContextFactory implements Factory<Context> {
  private final CompassCalibrationModule module;

  public CompassCalibrationModule_ProvideContextFactory(CompassCalibrationModule module) {  
    assert module != null;
    this.module = module;
  }

  @Override
  public Context get() {  
    Context provided = module.provideContext();
    if (provided == null) {
      throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
    return provided;
  }

  public static Factory<Context> create(CompassCalibrationModule module) {  
    return new CompassCalibrationModule_ProvideContextFactory(module);
  }
}

