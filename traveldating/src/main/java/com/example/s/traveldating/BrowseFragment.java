package com.example.s.traveldating;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link BrowseFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 */
public class BrowseFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View browseLayout = inflater.inflate(R.layout.browse_layout, container, false);
        return browseLayout;
    }


}
