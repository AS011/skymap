package com.vasa.android.stardroid;

import com.vasa.android.stardroid.control.MagneticDeclinationCalculator;
import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class ApplicationModule_ProvideDefaultMagneticDeclinationCalculatorFactory implements Factory<MagneticDeclinationCalculator> {
  private final ApplicationModule module;

  public ApplicationModule_ProvideDefaultMagneticDeclinationCalculatorFactory(ApplicationModule module) {  
    assert module != null;
    this.module = module;
  }

  @Override
  public MagneticDeclinationCalculator get() {  
    MagneticDeclinationCalculator provided = module.provideDefaultMagneticDeclinationCalculator();
    if (provided == null) {
      throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
    return provided;
  }

  public static Factory<MagneticDeclinationCalculator> create(ApplicationModule module) {  
    return new ApplicationModule_ProvideDefaultMagneticDeclinationCalculatorFactory(module);
  }
}

