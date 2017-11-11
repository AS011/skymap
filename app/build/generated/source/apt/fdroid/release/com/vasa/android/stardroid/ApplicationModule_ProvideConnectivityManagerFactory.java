package com.vasa.android.stardroid;

import android.net.ConnectivityManager;
import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class ApplicationModule_ProvideConnectivityManagerFactory implements Factory<ConnectivityManager> {
  private final ApplicationModule module;

  public ApplicationModule_ProvideConnectivityManagerFactory(ApplicationModule module) {  
    assert module != null;
    this.module = module;
  }

  @Override
  public ConnectivityManager get() {  
    ConnectivityManager provided = module.provideConnectivityManager();
    if (provided == null) {
      throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
    return provided;
  }

  public static Factory<ConnectivityManager> create(ApplicationModule module) {  
    return new ApplicationModule_ProvideConnectivityManagerFactory(module);
  }
}

