package com.vasa.android.stardroid.activities.util;

import android.content.Context;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class SensorAccuracyDecoder_Factory implements Factory<SensorAccuracyDecoder> {
  private final Provider<Context> contextProvider;

  public SensorAccuracyDecoder_Factory(Provider<Context> contextProvider) {  
    assert contextProvider != null;
    this.contextProvider = contextProvider;
  }

  @Override
  public SensorAccuracyDecoder get() {  
    return new SensorAccuracyDecoder(contextProvider.get());
  }

  public static Factory<SensorAccuracyDecoder> create(Provider<Context> contextProvider) {  
    return new SensorAccuracyDecoder_Factory(contextProvider);
  }
}

