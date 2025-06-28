package com.rnkillapp

import com.facebook.react.bridge.ReactApplicationContext

class RnKillAppImpl {

    fun exitApp(reactContext: ReactApplicationContext) {
        reactContext.currentActivity?.finishAndRemoveTask()
        System.exit(0)
    }

    companion object {
        const val NAME = "RnKillApp"
    }

}