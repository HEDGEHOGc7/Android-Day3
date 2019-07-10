package com.example.hello;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class hotsearch extends AppCompatActivity {
    private List<item> List = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotsearch);
        Init();
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        MyRecyclerView adapter = new MyRecyclerView( List );
        recyclerView.setAdapter(adapter);
    }
    private void Init() {
        item phone1 = new item("富豪拖冰山回国", R.drawable.back, "1");
     //   TextView tv = (TextView)this.findViewById(R.id.num);
     //   tv.setTextColor(Color.parseColor("#F20c00"));
        List.add(phone1);
        item phone2 = new item("曾经很火的品牌", R.drawable.back, "2");
        List.add(phone2);
        item phone3 = new item("迪士尼公主戒指", R.drawable.back ,"3");
        List.add(phone3);
        item phone4 = new item("橘子洲被淹", R.drawable.back, "4");
        List.add(phone4);
        item phone5 = new item("上海阿姨的战斗力", R.drawable.back, "5");
        List.add(phone5);
        item phone6 = new item("陈情令预告", R.drawable.back, "6");
        List.add(phone6);
        item phone7 = new item("王菲迷弟马天宇", R.drawable.back, "7");

        item phone8 = new item("蜡笔小新垃圾分类",R.drawable.back,"8");
        List.add(phone8);
        item phone9 = new item("武夷山景区关闭",R.drawable.back,"9");
        List.add(phone9);
        item phone10 = new item("不要随便戳兔子头",R.drawable.back,"10");
        List.add(phone10);
    }
}
