package com.example.experiment2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;


public class Main2Activity extends AppCompatActivity {
private Button back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        back=findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //取chu启动activityd的intent 对象
                Intent intent = getIntent();
                //取出intent中的数据
                String et1=intent.getStringExtra("et11");
                Integer number=intent.getIntExtra("number",2017);

                intent.putExtra("result","et1： "+et1+" number: "+number);
                setResult(0,intent);
                finish();
            }
        });
    }
}
