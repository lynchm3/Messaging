package com.marklynch.messaging

import android.app.Application
import com.marklynch.messaging.ApiValues.API_KEY
import com.marklynch.messaging.ApiValues.APP_ID
import io.intercom.android.sdk.Intercom

class MessagingApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        Intercom.initialize(this, API_KEY, APP_ID);
    }
}