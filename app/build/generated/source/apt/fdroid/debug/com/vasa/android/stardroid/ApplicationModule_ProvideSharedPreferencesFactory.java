package com.vasa.android.stardroid;

import android.content.SharedPreferences;
import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class ApplicationModule_ProvideSharedPreferencesFactory implements Factory<SharedPreferences> {
  private final ApplicationModule module;

  public ApplicationModule_ProvideSharedPreferencesFactory(ApplicationModule module) {  
    assert module != null;
    this.module = module;
  }

  @Override
  public SharedPreferences get() {  
    SharedPreferences provided = module.provideSharedPreferences();
    if (provided == null) {
      throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
    return provided;
  }

  public static Factory<SharedPreferences> create(ApplicationModule module) {  
    return new ApplicationModule_ProvideSharedPreferencesFactory(module);
  }
}

