package com.example.narayan.findme;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class AddManual extends AppCompatActivity {

    EditText ti,lo;
    FirebaseDatabase firebaseDatabase;
    DatabaseReference databaseReference;
    Button sa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_manual);
        ti=findViewById(R.id.titlea);
        lo=findViewById(R.id.location);
        sa=findViewById(R.id.save);
        firebaseDatabase=FirebaseDatabase.getInstance();
        databaseReference=firebaseDatabase.getReference().child("location");
        sa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String t=ti.getText().toString();
                String l=lo.getText().toString();
                locationadd loc=new locationadd(t,l);

                databaseReference.push().setValue(loc);
                Toast.makeText(getApplicationContext(),"data Inserted",Toast.LENGTH_SHORT).show();
            }
        });

    }
}
