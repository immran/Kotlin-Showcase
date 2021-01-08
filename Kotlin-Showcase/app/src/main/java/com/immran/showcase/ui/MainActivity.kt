package com.immran.showcase.ui


import android.os.Bundle
import com.immran.showcase.R
import com.immran.showcase.ui.base.BaseActivity
import com.immran.showcase.utils.log.Logger
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject
import javax.inject.Named

@AndroidEntryPoint
class MainActivity : BaseActivity() {

    @Inject
    @Named("uuid")
    lateinit var uuid: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Logger.d("MainActivity", "UUID: $uuid")
    }
}
