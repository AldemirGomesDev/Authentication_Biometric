package com.aldemir.authenticationbiometric.data.sharedPreferences

import android.content.Context
import android.content.SharedPreferences

class SharedPreferences(private val context: Context)  {
    private val PREFS_NAMES = "users"
    private val sharedPref: SharedPreferences = context.getSharedPreferences(PREFS_NAMES, Context.MODE_PRIVATE)

    fun saveSharedPreference(KEY_NAME: String, value: String) {
        val editor: SharedPreferences.Editor = sharedPref.edit()
        editor.putString(KEY_NAME, value)
        editor.apply()
    }

    fun getSharedPreference(KEY_NAME: String): String? {
        return sharedPref.getString(KEY_NAME, null)
    }

    fun removeSharedPreference(KEY_NAME: String) {
        val editor: SharedPreferences.Editor = sharedPref.edit()

        editor.remove(KEY_NAME)
        editor.apply()
    }

    fun clearSharedPreference() {
        val editor: SharedPreferences.Editor = sharedPref.edit()
        //sharedPref = PreferenceManager.getDefaultSharedPreferences(context);
        editor.clear()
        editor.apply()
    }
}