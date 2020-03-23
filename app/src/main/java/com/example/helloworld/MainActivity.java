package com.example.helloworld;

import android.os.Bundle;
import android.view.View;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button bt1=findViewById(R.id.button4);
        Button bt2=findViewById(R.id.button5);
        Button bt3=findViewById(R.id.button);
        RadioButton rb1=findViewById(R.id.radioButton);
        RadioButton rb2=findViewById(R.id.radioButton2);
        RadioButton rb3=findViewById(R.id.radioButton3);
        CheckBox cb1=findViewById(R.id.checkBox);
        AutoCompleteTextView actv1=findViewById(R.id.autoCompleteTextView);
        String[] strName=new String[]{"hello","hi","hemmmm","hahaha"};
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "按钮1被单击了！", Toast.LENGTH_SHORT).show();
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "按钮2被单击了！", Toast.LENGTH_SHORT).show();
            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "按钮3被单击了！", Toast.LENGTH_SHORT).show();
            }
        });
        rb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Apple被单击了！", Toast.LENGTH_SHORT).show();
            }
        });
        rb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Banana被单击了！", Toast.LENGTH_SHORT).show();
            }
        });
        rb3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Orange被单击了！", Toast.LENGTH_SHORT).show();
            }
        });
        cb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "CheckBox被单击了！", Toast.LENGTH_SHORT).show();
            }
        });
        ArrayAdapter<String> name=new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item,strName);
        actv1.setAdapter(name);

    }
}
