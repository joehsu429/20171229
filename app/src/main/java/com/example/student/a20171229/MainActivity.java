package com.example.student.a20171229;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("Log","This is onCreate");//af1
    }

    public void click1(View v)//m1
    {
        Intent it=new Intent();
        it.setAction(Intent.ACTION_SEND);
        it.setType("text/plain");
        it.putExtra(Intent.EXTRA_TEXT,"whynot");//這裡送出
        startActivity(it);
    }
    public void click2(View v)//m2
    {
        Intent it=new Intent();
        it.setAction(Intent.ACTION_SEND);
        it.setType("image/jpeg");
        Uri uri = Uri.parse("android.resource://" +
                getApplicationContext().getPackageName() + "/" + R.drawable.black1);
        it.putExtra(Intent.EXTRA_STREAM,uri);
        startActivity(it);
    }

    @Override//af1
    protected void onResume() {
        super.onResume();
        Log.d("Log","This is onResume");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Log","This is onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Log","This is onDestroy");
    }
}
