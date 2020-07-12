package com.example.hw2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.hw2.allfragments.guanzhuFragment;
import com.example.hw2.allfragments.shouyeFragment;
import com.example.hw2.allfragments.wodeFragment;
import com.example.hw2.allfragments.xiaoxiFragment;
import com.example.hw2.recycler.TestData;
import com.example.hw2.recycler.TestDataSet;

public class MainActivity extends AppCompatActivity{

    private RadioGroup mTabRadioGroup;
    private SparseArray<Fragment> mFragmentSparseArray;

    private static final String TAG = "TAG";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //初始化ratioGroup
        initRatioGroup();
    }

    private void initRatioGroup(){
        mTabRadioGroup = findViewById(R.id.rg);
        mFragmentSparseArray = new SparseArray<>();
        mFragmentSparseArray.append(R.id.shouye_tab, shouyeFragment.newInstance("首页"));
        mFragmentSparseArray.append(R.id.guanzhu_tab, guanzhuFragment.newInstance("关注"));
        mFragmentSparseArray.append(R.id.xiaoxi_tab, xiaoxiFragment.newInstance("消息"));
        mFragmentSparseArray.append(R.id.wode_tab, wodeFragment.newInstance("我的"));
        mTabRadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,mFragmentSparseArray.get(checkedId)).commit();
            }
        });
        //默认显示第一个
        getSupportFragmentManager().beginTransaction().add(R.id.fragment_container, mFragmentSparseArray.get(R.id.shouye_tab)).commit();
    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "MainActivity onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "MainActivity onResume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "MainActivity onRestart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "MainActivity onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "MainActivity onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "MainActivity onDestroy");
    }
}
