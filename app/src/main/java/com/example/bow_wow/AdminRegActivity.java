package com.example.bow_wow;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputEditText;

public class AdminRegActivity extends AppCompatActivity {

    private TextInputEditText userNameEdt, pwdEdt;
    private Button loginBtn;
    private ProgressBar loadingPB;
    private TextView registerTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       //setContentView(R.layout.activity_admin_login);
    }
}
