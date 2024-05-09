package com.example.restoorder.Activity;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.example.restoorder.R;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.FirebaseDatabase;

public class BaseActivity extends AppCompatActivity {

    FirebaseAuth mAuth;
    FirebaseDatabase database;
    public String TAG="GL";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mAuth = FirebaseAuth.getInstance();
        database = FirebaseDatabase.getInstance();

        getWindow().setStatusBarColor(getResources().getColor(R.color.white));
    }
}
