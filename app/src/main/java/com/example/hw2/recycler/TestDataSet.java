package com.example.hw2.recycler;

import com.example.hw2.R;

import java.util.ArrayList;
import java.util.List;

public class TestDataSet {
    public static List<TestData> getData(){
        List<TestData> result = new ArrayList();
        result.add(new TestData("大娃","力大无穷、身体变大","2020-07-07","22:27:22", R.drawable.p1,0));
        result.add(new TestData("二娃","慧眼千里、耳闻八方","2020-07-06","07:27:22",R.drawable.p2,1));
        result.add(new TestData("三娃","铜头铁臂、刀枪不入","2020-07-05","05:27:22",R.drawable.p3,0));
        result.add(new TestData("四娃","炉火纯青，刚阳烈焰","2020-07-04","22:27:22",R.drawable.p4,4));
        result.add(new TestData("五娃","惊涛骇浪、气吞山河","2020-07-03","04:27:22",R.drawable.p5,0));
        result.add(new TestData("六娃","来无影、去无踪、隐身、飞行","2020-07-02","05:27:22",R.drawable.p6,2));
        result.add(new TestData("七娃","镇妖之宝、本领无穷","2020-07-01","03:27:22",R.drawable.p7,0));
        return result;
    }
}
