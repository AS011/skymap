package com.vasa.android.stardroid.control;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class AbstractController_MembersInjector implements MembersInjector<AbstractController> {
  private final Provider<AstronomerModel> modelProvider;

  public AbstractController_MembersInjector(Provider<AstronomerModel> modelProvider) {  
    assert modelProvider != null;
    this.modelProvider = modelProvider;
  }

  @Override
  public void injectMembers(AbstractController instance) {  
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.model = modelProvider.get();
  }

  public static MembersInjector<AbstractController> create(Provider<AstronomerModel> modelProvider) {  
      return new AbstractController_MembersInjector(modelProvider);
  }
}

