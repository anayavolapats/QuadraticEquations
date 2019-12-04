package com.example.quadraticequations;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv = findViewById(R.id.textView2);
        Button bt = findViewById(R.id.button);
        EditText e1 = findViewById(R.id.editText);
        EditText e2 = findViewById(R.id.editText2);
        EditText e3 = findViewById(R.id.editText3);
        ActivityListener listener = new ActivityListener(e1, e2, e3, tv);
        bt.setOnClickListener(listener);
    }
}
