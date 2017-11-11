package com.vasa.android.stardroid;

import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class ApplicationModule_ProvideApplicationFactory implements Factory<StardroidApplication> {
  private final ApplicationModule module;

  public ApplicationModule_ProvideApplicationFactory(ApplicationModule module) {  
    assert module != null;
    this.module = module;
  }

  @Override
  public StardroidApplication get() {  
    StardroidApplication provided = module.provideApplication();
    if (provided == null) {
      throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
    return provided;
  }

  public static Factory<StardroidApplication> create(ApplicationModule module) {  
    return new ApplicationModule_ProvideApplicationFactory(module);
  }
}

