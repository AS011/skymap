package com.vasa.android.stardroid;

import com.vasa.android.stardroid.control.AstronomerModel;
import com.vasa.android.stardroid.control.MagneticDeclinationCalculator;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class ApplicationModule_ProvideAstronomerModelFactory implements Factory<AstronomerModel> {
  private final ApplicationModule module;
  private final Provider<MagneticDeclinationCalculator> magneticDeclinationCalculatorProvider;

  public ApplicationModule_ProvideAstronomerModelFactory(ApplicationModule module, Provider<MagneticDeclinationCalculator> magneticDeclinationCalculatorProvider) {  
    assert module != null;
    this.module = module;
    assert magneticDeclinationCalculatorProvider != null;
    this.magneticDeclinationCalculatorProvider = magneticDeclinationCalculatorProvider;
  }

  @Override
  public AstronomerModel get() {  
    AstronomerModel provided = module.provideAstronomerModel(magneticDeclinationCalculatorProvider.get());
    if (provided == null) {
      throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
    return provided;
  }

  public static Factory<AstronomerModel> create(ApplicationModule module, Provider<MagneticDeclinationCalculator> magneticDeclinationCalculatorProvider) {  
    return new ApplicationModule_ProvideAstronomerModelFactory(module, magneticDeclinationCalculatorProvider);
  }
}

