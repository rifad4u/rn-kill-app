package com.rnkillapp

import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.module.annotations.ReactModule
import com.facebook.react.bridge.ReactMethod

class RnKillAppModule(reactContext: ReactApplicationContext) :
    ReactContextBaseJavaModule(reactContext) {

    private var delegate: RnKillAppImpl = RnKillAppImpl()

    override fun getName(): String {
        return RnKillAppImpl.NAME
    }

    @ReactMethod
    fun exitApp() {
        delegate.exitApp(reactApplicationContext)
    }

}
