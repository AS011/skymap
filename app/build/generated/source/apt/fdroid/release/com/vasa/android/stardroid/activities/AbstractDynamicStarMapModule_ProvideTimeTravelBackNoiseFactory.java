package com.vasa.android.stardroid.activities;

import android.media.MediaPlayer;
import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class AbstractDynamicStarMapModule_ProvideTimeTravelBackNoiseFactory implements Factory<MediaPlayer> {
  private final AbstractDynamicStarMapModule module;

  public AbstractDynamicStarMapModule_ProvideTimeTravelBackNoiseFactory(AbstractDynamicStarMapModule module) {  
    assert module != null;
    this.module = module;
  }

  @Override
  public MediaPlayer get() {  
    MediaPlayer provided = module.provideTimeTravelBackNoise();
    if (provided == null) {
      throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
    return provided;
  }

  public static Factory<MediaPlayer> create(AbstractDynamicStarMapModule module) {  
    return new AbstractDynamicStarMapModule_ProvideTimeTravelBackNoiseFactory(module);
  }
}

