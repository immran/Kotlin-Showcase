package com.immran.showcase.ui


import android.os.Bundle
import com.immran.showcase.R
import com.immran.showcase.ui.base.BaseActivity

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
