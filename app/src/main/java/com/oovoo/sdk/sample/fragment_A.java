package com.oovoo.sdk.sample;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.oovoo.sdk.oovoosdksampleshow.R;


/**
 * Created by Ratan on 7/29/2015.
 */
public class fragment_A extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_c, null);


    }


}