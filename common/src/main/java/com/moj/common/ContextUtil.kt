package com.moj.common

import android.app.Application
import com.alibaba.android.arouter.launcher.ARouter

/**
 * @author : moj
 * @date : 2019/9/10
 * @description :
 */
object ContextUtil {

    lateinit var application : Application

    fun init(app: Application){
        application = app

        ARouter.openLog()
        ARouter.openDebug()
        ARouter.init(application)
    }
}