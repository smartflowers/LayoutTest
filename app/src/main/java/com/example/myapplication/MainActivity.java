package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;



public class MainActivity extends AppCompatActivity{
    private Button bu_one;
    private Button bu_two;
    private Button bu_three;
    private Intent i=new Intent();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bu_one=(Button)findViewById(R.id.bt1);
        bu_two=(Button)findViewById(R.id.bt2);
        bu_three=(Button)findViewById(R.id.bt3);
        bu_one.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                i.setClass(com.example.myapplication.MainActivity.this,LineLayout.class);
                startActivity(i); }
        });
        bu_two.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                i.setClass(com.example.myapplication.MainActivity.this,ConstraintLayout.class);
                startActivity(i); }
        });
        bu_three.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                i.setClass(com.example.myapplication.MainActivity.this,TableLayout.class);
                startActivity(i); }
        });
    }
}
