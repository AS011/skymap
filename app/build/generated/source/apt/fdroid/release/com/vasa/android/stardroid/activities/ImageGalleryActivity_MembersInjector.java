package com.vasa.android.stardroid.activities;

import com.vasa.android.stardroid.util.Analytics;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class ImageGalleryActivity_MembersInjector implements MembersInjector<ImageGalleryActivity> {
  private final MembersInjector<InjectableActivity> supertypeInjector;
  private final Provider<Analytics> analyticsProvider;

  public ImageGalleryActivity_MembersInjector(MembersInjector<InjectableActivity> supertypeInjector, Provider<Analytics> analyticsProvider) {  
    assert supertypeInjector != null;
    this.supertypeInjector = supertypeInjector;
    assert analyticsProvider != null;
    this.analyticsProvider = analyticsProvider;
  }

  @Override
  public void injectMembers(ImageGalleryActivity instance) {  
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    supertypeInjector.injectMembers(instance);
    instance.analytics = analyticsProvider.get();
  }

  public static MembersInjector<ImageGalleryActivity> create(MembersInjector<InjectableActivity> supertypeInjector, Provider<Analytics> analyticsProvider) {  
      return new ImageGalleryActivity_MembersInjector(supertypeInjector, analyticsProvider);
  }
}

