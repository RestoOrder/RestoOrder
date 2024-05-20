package com.example.restoorder.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.restoorder.R;
import com.example.restoorder.databinding.ActivityLoginBinding;

public class LoginActivity extends BaseActivity {
    ActivityLoginBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityLoginBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email=binding.userEdt.getText().toString();
                String password=binding.PassEdt.getText().toString();
                if (!email.isEmpty()&& !password.isEmpty()){
                    mAuth.signInWithEmailAndPassword(email,password).addOnCompleteListener(LoginActivity.this,task->{
                        if (task.isSuccessful()){
                            startActivity(new Intent(LoginActivity.this,MainActivity.class));
                        }else{
                            Toast.makeText(LoginActivity.this, "Authentification failed", Toast.LENGTH_SHORT).show();
                        }
                    });
                }else{
                    Toast.makeText(LoginActivity.this, "Please fill username and password", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}