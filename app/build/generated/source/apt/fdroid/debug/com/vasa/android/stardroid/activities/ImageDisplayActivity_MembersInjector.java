package com.vasa.android.stardroid.activities;

import com.vasa.android.stardroid.util.Analytics;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class ImageDisplayActivity_MembersInjector implements MembersInjector<ImageDisplayActivity> {
  private final MembersInjector<InjectableActivity> supertypeInjector;
  private final Provider<Analytics> analyticsProvider;

  public ImageDisplayActivity_MembersInjector(MembersInjector<InjectableActivity> supertypeInjector, Provider<Analytics> analyticsProvider) {  
    assert supertypeInjector != null;
    this.supertypeInjector = supertypeInjector;
    assert analyticsProvider != null;
    this.analyticsProvider = analyticsProvider;
  }

  @Override
  public void injectMembers(ImageDisplayActivity instance) {  
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    supertypeInjector.injectMembers(instance);
    instance.analytics = analyticsProvider.get();
  }

  public static MembersInjector<ImageDisplayActivity> create(MembersInjector<InjectableActivity> supertypeInjector, Provider<Analytics> analyticsProvider) {  
      return new ImageDisplayActivity_MembersInjector(supertypeInjector, analyticsProvider);
  }
}

