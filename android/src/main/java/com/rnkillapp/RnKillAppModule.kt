package com.rnkillapp

import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.module.annotations.ReactModule

class RnKillAppModule(reactContext: ReactApplicationContext) : NativeRnKillAppSpec(reactContext) {

    override fun getName(): String {
        return NAME
    }

    override fun exitApp() {
        getReactApplicationContext().currentActivity?.finishAndRemoveTask()
        System.exit(0)
    }

    companion object {
        const val NAME = "RnKillApp"
    }

}
