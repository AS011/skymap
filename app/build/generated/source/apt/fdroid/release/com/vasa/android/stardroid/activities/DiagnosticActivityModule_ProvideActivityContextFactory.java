package com.vasa.android.stardroid.activities;

import android.content.Context;
import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class DiagnosticActivityModule_ProvideActivityContextFactory implements Factory<Context> {
  private final DiagnosticActivityModule module;

  public DiagnosticActivityModule_ProvideActivityContextFactory(DiagnosticActivityModule module) {  
    assert module != null;
    this.module = module;
  }

  @Override
  public Context get() {  
    Context provided = module.provideActivityContext();
    if (provided == null) {
      throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
    return provided;
  }

  public static Factory<Context> create(DiagnosticActivityModule module) {  
    return new DiagnosticActivityModule_ProvideActivityContextFactory(module);
  }
}

