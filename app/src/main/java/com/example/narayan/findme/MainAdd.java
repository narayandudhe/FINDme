package com.example.narayan.findme;

import android.app.Dialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainAdd extends AppCompatActivity {

    TextView m;
    ImageView add;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_add);
        m=findViewById(R.id.manual);
        add=findViewById(R.id.addlocation);

        m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),AddAuto.class));
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDialog();
            }
        });
    }

    private void showDialog() {
        Dialog d=new Dialog(this);
        //for dynamic changes below line are used
        //View v= LayoutInflater.from(this).inflate(R.layout.custom_dialog);
       // TextView t1=v.findViewById(R.id.yes);
        //t1.setText("hello");
        d.setContentView(R.layout.custom_dialog);
        d.show();
    }
}
