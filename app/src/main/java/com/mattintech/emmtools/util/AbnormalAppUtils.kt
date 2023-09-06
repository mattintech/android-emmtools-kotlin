package com.mattintech.emmtools.util

import android.util.Log
import com.mattintech.emmtools.AppConstants

class AbnormalAppUtils {
    private val TAG: String = String.format("%sAbnormalAppUtils:", AppConstants.LOG_TAG)

    fun startAnr() {
        //intentionally start anr
        Log.d(TAG, "startAnr: started.")
        while (true) {
            //intentionally blank
        }
    }

    fun appCrash() {
        //intentionally force an application crash
        0 / 0
    }
}