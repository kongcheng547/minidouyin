package com.example.hw2.allfragments;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.hw2.R;
import com.example.hw2.navigate_page;
import com.example.hw2.recycler.MyAdapter;
import com.example.hw2.recycler.TestData;
import com.example.hw2.recycler.TestDataSet;


public class xiaoxiFragment extends Fragment implements MyAdapter.IOnItemClickListener{

    private static final String ARG_SHOW_TEXT = "text";
    private String mContentText;

    //用于recycle view
    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private MyAdapter mAdapter;

    public xiaoxiFragment() {
        // Required empty public constructor
    }

    public static xiaoxiFragment newInstance(String param1) {
        xiaoxiFragment fragment = new xiaoxiFragment();
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
        View rootView = inflater.inflate(R.layout.fragment_xiaoxi, container, false);
        //初始化recycleView
        initRecyclerView(rootView);
        return rootView;
    }

    private void initRecyclerView(View rootView){
        recyclerView = (RecyclerView) rootView.findViewById(R.id.recycler);
        recyclerView.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);

        mAdapter = new MyAdapter(TestDataSet.getData());
        mAdapter.setOnItemClickListener(this);

        recyclerView.setAdapter(mAdapter);

        recyclerView.addItemDecoration(new DividerItemDecoration(getActivity(), LinearLayoutManager.VERTICAL));
    }

    //点击消息列表跳转打相应的页面
    public void onItemCLick(int position, TestData data) {
        Toast.makeText(getActivity(), "点击了第" + position + "条", Toast.LENGTH_SHORT).show();
        Intent it = new Intent(getActivity(), navigate_page.class);
        it.putExtra("position",position);
        startActivity(it);
    }

    public void onItemLongCLick(int position, TestData data) {
        Toast.makeText(getActivity(), "长按了第" + position + "条", Toast.LENGTH_SHORT).show();
        Intent it = new Intent(getActivity(), navigate_page.class);
        it.putExtra("position",position);
        startActivity(it);
    }
}
