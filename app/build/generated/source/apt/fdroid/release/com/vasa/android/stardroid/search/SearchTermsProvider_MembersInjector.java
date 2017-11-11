package com.vasa.android.stardroid.search;

import android.content.ContentProvider;
import com.vasa.android.stardroid.layers.LayerManager;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class SearchTermsProvider_MembersInjector implements MembersInjector<SearchTermsProvider> {
  private final MembersInjector<ContentProvider> supertypeInjector;
  private final Provider<LayerManager> layerManagerProvider;

  public SearchTermsProvider_MembersInjector(MembersInjector<ContentProvider> supertypeInjector, Provider<LayerManager> layerManagerProvider) {  
    assert supertypeInjector != null;
    this.supertypeInjector = supertypeInjector;
    assert layerManagerProvider != null;
    this.layerManagerProvider = layerManagerProvider;
  }

  @Override
  public void injectMembers(SearchTermsProvider instance) {  
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    supertypeInjector.injectMembers(instance);
    instance.layerManager = layerManagerProvider.get();
  }

  public static MembersInjector<SearchTermsProvider> create(MembersInjector<ContentProvider> supertypeInjector, Provider<LayerManager> layerManagerProvider) {  
      return new SearchTermsProvider_MembersInjector(supertypeInjector, layerManagerProvider);
  }
}

