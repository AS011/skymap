package com.vasa.android.stardroid.sensors;

import com.vasa.android.stardroid.control.AstronomerModel;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class SensorModelAdaptor_Factory implements Factory<SensorModelAdaptor> {
  private final Provider<AstronomerModel> modelProvider;

  public SensorModelAdaptor_Factory(Provider<AstronomerModel> modelProvider) {  
    assert modelProvider != null;
    this.modelProvider = modelProvider;
  }

  @Override
  public SensorModelAdaptor get() {  
    return new SensorModelAdaptor(modelProvider.get());
  }

  public static Factory<SensorModelAdaptor> create(Provider<AstronomerModel> modelProvider) {  
    return new SensorModelAdaptor_Factory(modelProvider);
  }
}

