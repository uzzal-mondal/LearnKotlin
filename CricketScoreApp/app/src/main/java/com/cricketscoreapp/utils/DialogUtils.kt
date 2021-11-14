package com.cricketscoreapp.utils


class DialogUtils {

    companion object {

        /*fun showSimpleDialog(context: Context, title: String, message: String) {
            AlertDialog.Builder(context, R.style.MyAlertDialogTheme)
                    .setTitle(title)
                    .setMessage(message)
                    .setPositiveButton(
                            android.R.string.ok
                    ) { dialog, which ->
                        dialog.dismiss()
                    }
                    .setIcon(android.R.drawable.ic_dialog_info)
                    .setCancelable(false)
                    .show()
        }*/

       /* fun showDialog(context: Context, title: String, message: String, callback: Callback) {
            val dialog = AlertDialog.Builder(context, R.style.MyAlertDialogTheme)
                    .setTitle(title)
                    .setMessage(message)
                    .setPositiveButton(
                          android.R.string.ok
                    ) { dialog, which ->
                        dialog.dismiss()
                        callback.onPositive()
                    }
                    .setIcon(android.R.drawable.ic_dialog_info)
                    .setCancelable(false)
            dialog?.show()
        }*/


        interface Callback {
            fun onPositive()
            fun onNegative()
        }

        interface RepeatCallBack {
            fun onClick(name: String)
        }

        interface CheckedListCallback {
            fun onChecked(list: List<String>)
        }
    }
}