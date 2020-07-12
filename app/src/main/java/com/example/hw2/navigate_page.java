package com.example.hw2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class navigate_page extends AppCompatActivity {

    Intent it;
    TextView theText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigate_page);
        it = getIntent();
        init();
    }

    private void init(){
        int position = it.getIntExtra("position",0);
        Log.i("page","跳转的页面是第 "+position+" 个item");
        theText = (TextView) findViewById(R.id.center_text);
        theText.setText("跳转的页面是第 "+position+" 个item");
    }
}
