package com.thannasorn.eventmanagementapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnType1 = (Button) findViewById(R.id.btnType1);

        //แบบที่ 1 Inner Class
        btnType1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Event Type 1",
                        Toast.LENGTH_LONG).show();
            }
        });

        //แบบที่ 3 ใช้การ implements
        Button btnType3 = (Button) findViewById(R.id.btnType3);
        btnType3.setOnClickListener(this);
    }

    //event type 2 ใช้ attribute onClick ของปุ่ม
    public void buttonClick2(View view){
        Toast.makeText(this, "Event Type 2", Toast.LENGTH_LONG).show();
    }

    // event type 3 ใช้การ implements
    @Override
    public void onClick(View view){
        Toast.makeText(this, "Event Type 3", Toast.LENGTH_LONG).show();
    }
}