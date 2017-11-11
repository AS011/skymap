package com.vasa.android.stardroid;

import dagger.internal.Factory;
import java.util.concurrent.ExecutorService;
import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class ApplicationModule_ProvideBackgroundExecutorFactory implements Factory<ExecutorService> {
  private final ApplicationModule module;

  public ApplicationModule_ProvideBackgroundExecutorFactory(ApplicationModule module) {  
    assert module != null;
    this.module = module;
  }

  @Override
  public ExecutorService get() {  
    ExecutorService provided = module.provideBackgroundExecutor();
    if (provided == null) {
      throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
    return provided;
  }

  public static Factory<ExecutorService> create(ApplicationModule module) {  
    return new ApplicationModule_ProvideBackgroundExecutorFactory(module);
  }
}

