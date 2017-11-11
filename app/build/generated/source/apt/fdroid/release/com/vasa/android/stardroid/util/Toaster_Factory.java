package com.vasa.android.stardroid.util;

import android.content.Context;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class Toaster_Factory implements Factory<Toaster> {
  private final Provider<Context> contextProvider;

  public Toaster_Factory(Provider<Context> contextProvider) {  
    assert contextProvider != null;
    this.contextProvider = contextProvider;
  }

  @Override
  public Toaster get() {  
    return new Toaster(contextProvider.get());
  }

  public static Factory<Toaster> create(Provider<Context> contextProvider) {  
    return new Toaster_Factory(contextProvider);
  }
}

