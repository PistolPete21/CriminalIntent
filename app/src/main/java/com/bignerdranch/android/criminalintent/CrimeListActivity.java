package com.bignerdranch.android.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by peterschwartz on 3/3/16.
 */
public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
