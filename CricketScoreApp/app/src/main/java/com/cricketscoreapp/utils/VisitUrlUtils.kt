package com.cloudeducation.free.utils

import android.app.Activity
import android.content.Intent
import android.net.Uri


class VisitUrlUtils {
    companion object {
         fun visitWebsite(activity: Activity, url: String) {
            val i = Intent(Intent.ACTION_VIEW)
            i.data = Uri.parse(url)
            activity.startActivity(i)
        }
    }
}