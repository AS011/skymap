package com.vasa.android.stardroid;

import android.accounts.AccountManager;
import android.content.Context;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class ApplicationModule_ProvideAccountManagerFactory implements Factory<AccountManager> {
  private final ApplicationModule module;
  private final Provider<Context> contextProvider;

  public ApplicationModule_ProvideAccountManagerFactory(ApplicationModule module, Provider<Context> contextProvider) {  
    assert module != null;
    this.module = module;
    assert contextProvider != null;
    this.contextProvider = contextProvider;
  }

  @Override
  public AccountManager get() {  
    AccountManager provided = module.provideAccountManager(contextProvider.get());
    if (provided == null) {
      throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
    return provided;
  }

  public static Factory<AccountManager> create(ApplicationModule module, Provider<Context> contextProvider) {  
    return new ApplicationModule_ProvideAccountManagerFactory(module, contextProvider);
  }
}

