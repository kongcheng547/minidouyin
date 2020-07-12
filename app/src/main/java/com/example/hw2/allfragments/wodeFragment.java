package com.example.hw2.allfragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.hw2.R;


public class wodeFragment extends Fragment {

    private static final String ARG_SHOW_TEXT = "text";
    private String mContentText;

    public wodeFragment() {
        // Required empty public constructor
    }

    public static wodeFragment newInstance(String param1) {
        wodeFragment fragment = new wodeFragment();
        Bundle args = new Bundle();
        args.putString(ARG_SHOW_TEXT, param1);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mContentText = getArguments().getString(ARG_SHOW_TEXT);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_wode, container, false);
        //TextView contentTv = rootView.findViewById(R.id.content_tv);
       //contentTv.setText(mContentText);
        return rootView;
    }
}
