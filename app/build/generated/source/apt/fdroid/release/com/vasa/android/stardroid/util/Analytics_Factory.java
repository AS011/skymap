package com.vasa.android.stardroid.util;

import com.vasa.android.stardroid.StardroidApplication;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class Analytics_Factory implements Factory<Analytics> {
  private final Provider<StardroidApplication> applicationProvider;

  public Analytics_Factory(Provider<StardroidApplication> applicationProvider) {  
    assert applicationProvider != null;
    this.applicationProvider = applicationProvider;
  }

  @Override
  public Analytics get() {  
    return new Analytics(applicationProvider.get());
  }

  public static Factory<Analytics> create(Provider<StardroidApplication> applicationProvider) {  
    return new Analytics_Factory(applicationProvider);
  }
}

