package com.vasa.android.stardroid.activities;

import android.os.Handler;
import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class DiagnosticActivityModule_ProvideHandlerFactory implements Factory<Handler> {
  private final DiagnosticActivityModule module;

  public DiagnosticActivityModule_ProvideHandlerFactory(DiagnosticActivityModule module) {  
    assert module != null;
    this.module = module;
  }

  @Override
  public Handler get() {  
    Handler provided = module.provideHandler();
    if (provided == null) {
      throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
    return provided;
  }

  public static Factory<Handler> create(DiagnosticActivityModule module) {  
    return new DiagnosticActivityModule_ProvideHandlerFactory(module);
  }
}

