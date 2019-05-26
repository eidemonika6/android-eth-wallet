package me.ibrahimsn.wallet.ui.home

import android.content.Intent
import android.os.Bundle
import androidx.navigation.NavController
import me.ibrahimsn.wallet.R
import me.ibrahimsn.wallet.base.BaseActivity
import me.ibrahimsn.wallet.ui.importWallet.ImportWalletActivity

class HomeActivity : BaseActivity() {

    private lateinit var navController: NavController

    override fun layoutRes(): Int {
        return R.layout.activity_home
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        startActivity(Intent(this, ImportWalletActivity::class.java))
    }
}