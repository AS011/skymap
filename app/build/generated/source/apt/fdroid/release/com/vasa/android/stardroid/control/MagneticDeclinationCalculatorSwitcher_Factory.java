package com.vasa.android.stardroid.control;

import android.content.SharedPreferences;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class MagneticDeclinationCalculatorSwitcher_Factory implements Factory<MagneticDeclinationCalculatorSwitcher> {
  private final Provider<AstronomerModel> modelProvider;
  private final Provider<SharedPreferences> preferencesProvider;
  private final Provider<MagneticDeclinationCalculator> zeroCalculatorProvider;
  private final Provider<MagneticDeclinationCalculator> realCalculatorProvider;

  public MagneticDeclinationCalculatorSwitcher_Factory(Provider<AstronomerModel> modelProvider, Provider<SharedPreferences> preferencesProvider, Provider<MagneticDeclinationCalculator> zeroCalculatorProvider, Provider<MagneticDeclinationCalculator> realCalculatorProvider) {  
    assert modelProvider != null;
    this.modelProvider = modelProvider;
    assert preferencesProvider != null;
    this.preferencesProvider = preferencesProvider;
    assert zeroCalculatorProvider != null;
    this.zeroCalculatorProvider = zeroCalculatorProvider;
    assert realCalculatorProvider != null;
    this.realCalculatorProvider = realCalculatorProvider;
  }

  @Override
  public MagneticDeclinationCalculatorSwitcher get() {  
    return new MagneticDeclinationCalculatorSwitcher(modelProvider.get(), preferencesProvider.get(), zeroCalculatorProvider.get(), realCalculatorProvider.get());
  }

  public static Factory<MagneticDeclinationCalculatorSwitcher> create(Provider<AstronomerModel> modelProvider, Provider<SharedPreferences> preferencesProvider, Provider<MagneticDeclinationCalculator> zeroCalculatorProvider, Provider<MagneticDeclinationCalculator> realCalculatorProvider) {  
    return new MagneticDeclinationCalculatorSwitcher_Factory(modelProvider, preferencesProvider, zeroCalculatorProvider, realCalculatorProvider);
  }
}

