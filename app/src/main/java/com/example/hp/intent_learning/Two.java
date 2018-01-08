package com.example.hp.intent_learning;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.EditText;
import android.widget.TextView;
import android.*;
public class Two extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
        Bundle a = getIntent().getExtras();
        String takeInfo = a.getString("takeInfo");
        TextView dis = (TextView)findViewById(R.id.textView3);
        dis.setText(takeInfo);
    }

    public void onclick(View view){


        EditText t1 = (EditText) findViewById(R.id.send);
        String stor = t1.getText().toString();
        Intent i = new Intent(this,One.class);
        i.putExtra("sendInfo",stor);
        setResult(Activity.RESULT_OK,i);
        finish();
    }
}
