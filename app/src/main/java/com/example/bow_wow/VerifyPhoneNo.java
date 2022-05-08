package com.example.bow_wow;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;

import androidx.appcompat.app.AppCompatActivity;

import java.util.concurrent.TimeUnit;

public class VerifyPhoneNo extends AppCompatActivity {

    String verificationCodeBySystem;
    Button verify_btn;
    EditText phoneNoEnteredBytheUser;
    ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_verify_phone_no);

       // verify_btn =findViewById(R.id.verify_btn);
        //phoneNoEnteredBytheUser =findViewById(R.id.verification_code_entered_by_user);
        //progressBar =findViewById(R.id.progress_bar);

        String phoneNo = getIntent().getStringExtra("phoneNo");

        //sendVerificationCodeToUser(phoneNo);
    }

    private void sendVerificationCodeToUser(String phoneNo) {
       /* PhoneAuthProvider.getInstance().verifyPhoneNumber(
                "+94" + phoneNo,
                60,
                TimeUnit.SECONDS,
                (Activity) TaskExecutors.MAIN_THREAD,
                mCallbacks); */
    }
}
