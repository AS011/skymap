package com.vasa.android.stardroid.activities;

import android.app.Activity;
import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class DiagnosticActivityModule_ProvideActivityFactory implements Factory<Activity> {
  private final DiagnosticActivityModule module;

  public DiagnosticActivityModule_ProvideActivityFactory(DiagnosticActivityModule module) {  
    assert module != null;
    this.module = module;
  }

  @Override
  public Activity get() {  
    Activity provided = module.provideActivity();
    if (provided == null) {
      throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
    return provided;
  }

  public static Factory<Activity> create(DiagnosticActivityModule module) {  
    return new DiagnosticActivityModule_ProvideActivityFactory(module);
  }
}

