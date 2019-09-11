package com.moj.mainapp

import android.app.Application
import androidx.multidex.MultiDexApplication
import com.moj.common.ContextUtil


/**
 * @author : moj
 * @date : 2019/9/10
 * @description :
 */
class AppContext : Application() {

    override fun onCreate() {
        super.onCreate()
        ContextUtil.init(this)
    }
}