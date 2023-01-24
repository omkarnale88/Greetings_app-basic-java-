package com.example.greetings_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.widget.TextViewCompat;

import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class MainActivity extends AppCompatActivity{
    TextView txt;
    EditText edttxt;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt=findViewById(R.id.textView1);
        edttxt=findViewById(R.id.nametext);
        btn=findViewById(R.id.btn1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name=edttxt.getText().toString();
                Toast.makeText(MainActivity.this, "Hello, "+name, Toast.LENGTH_SHORT).show();
            }
        });
    }

}