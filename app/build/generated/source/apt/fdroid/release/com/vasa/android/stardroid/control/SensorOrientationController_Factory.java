package com.vasa.android.stardroid.control;

import android.content.SharedPreferences;
import android.hardware.SensorManager;
import com.vasa.android.stardroid.util.smoothers.PlainSmootherModelAdaptor;
import dagger.MembersInjector;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class SensorOrientationController_Factory implements Factory<SensorOrientationController> {
  private final MembersInjector<SensorOrientationController> membersInjector;
  private final Provider<PlainSmootherModelAdaptor> modelAdaptorProvider;
  private final Provider<SensorManager> managerProvider;
  private final Provider<SharedPreferences> sharedPreferencesProvider;

  public SensorOrientationController_Factory(MembersInjector<SensorOrientationController> membersInjector, Provider<PlainSmootherModelAdaptor> modelAdaptorProvider, Provider<SensorManager> managerProvider, Provider<SharedPreferences> sharedPreferencesProvider) {  
    assert membersInjector != null;
    this.membersInjector = membersInjector;
    assert modelAdaptorProvider != null;
    this.modelAdaptorProvider = modelAdaptorProvider;
    assert managerProvider != null;
    this.managerProvider = managerProvider;
    assert sharedPreferencesProvider != null;
    this.sharedPreferencesProvider = sharedPreferencesProvider;
  }

  @Override
  public SensorOrientationController get() {  
    SensorOrientationController instance = new SensorOrientationController(modelAdaptorProvider, managerProvider.get(), sharedPreferencesProvider.get());
    membersInjector.injectMembers(instance);
    return instance;
  }

  public static Factory<SensorOrientationController> create(MembersInjector<SensorOrientationController> membersInjector, Provider<PlainSmootherModelAdaptor> modelAdaptorProvider, Provider<SensorManager> managerProvider, Provider<SharedPreferences> sharedPreferencesProvider) {  
    return new SensorOrientationController_Factory(membersInjector, modelAdaptorProvider, managerProvider, sharedPreferencesProvider);
  }
}

