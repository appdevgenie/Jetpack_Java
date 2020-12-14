package com.appdevgenie.jetpack_java.view;


import android.os.Bundle;

import androidx.preference.PreferenceFragmentCompat;

import com.appdevgenie.jetpack_java.R;


public class SettingsFragment extends PreferenceFragmentCompat {


    public SettingsFragment() {
    }

    @Override
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
        setPreferencesFromResource(R.xml.settings, rootKey);
    }

}
