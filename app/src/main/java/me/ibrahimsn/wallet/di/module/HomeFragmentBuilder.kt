package me.ibrahimsn.wallet.di.module

import dagger.Module
import dagger.android.ContributesAndroidInjector
import me.ibrahimsn.wallet.ui.importWallet.ImportWalletActivity
import me.ibrahimsn.wallet.ui.wallet.WalletFragment

@Module
abstract class HomeFragmentBuilder {

    @ContributesAndroidInjector
    internal abstract fun buildWalletFragment(): WalletFragment

    @ContributesAndroidInjector
    internal abstract fun buildImportWalletFragment(): ImportWalletActivity
}