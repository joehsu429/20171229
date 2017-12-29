package com.example.student.a20171229;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView tv;//m1
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tv=findViewById(R.id.textView);//m1
        Intent it=getIntent();
        String data=it.getStringExtra(Intent.EXTRA_TEXT);//這裡接收
        tv.setText(data);
    }

}
