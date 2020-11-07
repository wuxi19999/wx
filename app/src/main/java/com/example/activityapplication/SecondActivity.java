package com.example.activityapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_layout);

        Button button = findViewById(R.id.Button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.putExtra("msg","data from SecondActivity");
                setResult(RESULT_OK, intent);

                finish();


            }
        });
           Intent i = getIntent();
           Bundle bundle = i.getBundleExtra("message");
           if(bundle! = null){
               Message msg = (Message)bundle.get("msg");
            Log.d(TAG,"msg="+msg);
           }


        /*Intent intent = getIntent();
        Bundle bundle = intent.getBundleExtra("Message");
        if (bundle != null ) {
            *//*String name = bundle*//*
        }*/
    }
}

