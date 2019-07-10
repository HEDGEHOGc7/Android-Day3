package com.example.hello;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.content.Context;
import java.util.List;
import android.content.Intent;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = (Button) this.findViewById(R.id.button1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO Auto-generated method stub
                setTitle("Submission succeeded");
                Intent intent = new Intent(MainActivity.this,animation.class);
                startActivity(intent);
                Log.i("widgetDemo", "button1 is clicked");
            }
        });
        Button btn2 = (Button) this.findViewById(R.id.button2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,hotsearch.class);
                startActivity(intent);
            }
        });
        Button btn3 = (Button) this.findViewById(R.id.button3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Tablayout.class);
                startActivity(intent);
            }
        });
        TextView lblTitle=(TextView)findViewById(R.id.text1);
      //  lblTitle.setAutoLinkMask(Linkify.ALL);
       // lblTitle.setText("<a href=\"http://www.baidu.com\">百度</>");
        TextView t = (TextView) this.findViewById(R.id.text1);
        t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setTitle("Tab the button below");
            }
        });

    }
}
