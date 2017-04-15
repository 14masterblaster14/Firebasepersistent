package com.example.com.firebasepersistent;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class MainActivity extends AppCompatActivity {

    private DatabaseReference mDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mDatabase = FirebaseDatabase.getInstance().getReference();

        setContentView(R.layout.activity_main);
    }

    public void insert(View view) {

        Mobile mob = new Mobile();
        mob.values(12l, "Android", "6546465");
        mDatabase.child("mobiles").child("" + mob.getMobId()).setValue(mob);
    }

    public void display(View view) {
        mDatabase.child("mobiles").child("12").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                Mobile mobile = dataSnapshot.getValue(Mobile.class);
                Log.i("@codekul", "" + mobile);

                ((TextView) findViewById(R.id.TextView)).setText(mobile.toString());
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
    }
}