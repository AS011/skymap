package com.vasa.android.stardroid.util.smoothers;

import android.content.SharedPreferences;
import com.vasa.android.stardroid.control.AstronomerModel;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class PlainSmootherModelAdaptor_Factory implements Factory<PlainSmootherModelAdaptor> {
  private final Provider<AstronomerModel> modelProvider;
  private final Provider<SharedPreferences> sharedPreferencesProvider;

  public PlainSmootherModelAdaptor_Factory(Provider<AstronomerModel> modelProvider, Provider<SharedPreferences> sharedPreferencesProvider) {  
    assert modelProvider != null;
    this.modelProvider = modelProvider;
    assert sharedPreferencesProvider != null;
    this.sharedPreferencesProvider = sharedPreferencesProvider;
  }

  @Override
  public PlainSmootherModelAdaptor get() {  
    return new PlainSmootherModelAdaptor(modelProvider.get(), sharedPreferencesProvider.get());
  }

  public static Factory<PlainSmootherModelAdaptor> create(Provider<AstronomerModel> modelProvider, Provider<SharedPreferences> sharedPreferencesProvider) {  
    return new PlainSmootherModelAdaptor_Factory(modelProvider, sharedPreferencesProvider);
  }
}

