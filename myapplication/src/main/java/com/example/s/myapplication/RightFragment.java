package com.example.s.myapplication;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class RightFragment extends Fragment {


    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceSate) {
        View view = inflater.inflate(R.layout.right_fragment, container, false);

        return view;
    }

}

