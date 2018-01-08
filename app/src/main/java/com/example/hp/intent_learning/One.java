package com.example.hp.intent_learning;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.MenuItem;
import android.view.Menu;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;


public class One extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);

        Bundle aa = getIntent().getExtras();
        if(aa!=null){
            String takeInfo = aa.getString("sendInfo");
            TextView dis = (TextView)findViewById(R.id.one);
            dis.setText(takeInfo);

        }
        Button b = (Button)findViewById(R.id.button1);
        b.setOnClickListener(
                new Button.OnClickListener(){
                   public void onClick(View v){
                        EditText t1 = (EditText) findViewById(R.id.message);
                        String store = t1.getText().toString();
                        Intent i = new Intent(getApplicationContext(),Two.class);
                        i.putExtra("takeInfo",store);
                        startActivity(i);

                    }
                }
        );
    }
        public void launcher(View view){
            Uri adress = Uri.parse("geo:37.7749,-122.4194");
            Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("geo:37.7749,-122.4194"));
            startActivity(intent);
        }
}
