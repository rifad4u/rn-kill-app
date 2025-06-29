package com.rnkillapp

import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.module.annotations.ReactModule

class RnKillAppModule(reactContext: ReactApplicationContext) : NativeRnKillAppSpec(reactContext) {

    private var delegate: RnKillAppImpl = RnKillAppImpl()

    override fun getName(): String {
        return RnKillAppImpl.NAME
    }

    override fun killApp() {
        delegate.killApp(reactApplicationContext)
    }

}