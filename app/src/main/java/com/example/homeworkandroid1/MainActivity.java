package com.example.homeworkandroid1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tvWelcome,tvGeekTech, tvException;
    private EditText etLogin,etPassword;
    private Button btnEnter;
    private ImageView logo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }
    private void init(){
        tvWelcome = findViewById(R.id.text);
        tvGeekTech = findViewById(R.id.text2);
        btnEnter = findViewById(R.id.btnEnter);
        logo = findViewById(R.id.imageView);
        etLogin = findViewById(R.id.login);
        etPassword = findViewById(R.id.password);
        tvException = findViewById(R.id.exception);
        btnEnter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(etLogin.getText().toString().isEmpty() || etPassword.getText().toString().isEmpty()){
                    tvException.setText(R.string.txt_exception);
                }if(etLogin.getText().length() > 8 || etPassword.getText().length() > 8){
                    tvException.setText(R.string.txt_exception2);
                }
                else{
                    tvException.setText(R.string.txt_succes);
                }
            }
        });
    }
}