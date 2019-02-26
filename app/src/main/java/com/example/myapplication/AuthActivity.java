package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AuthActivity extends AppCompatActivity {

       private EditText mPhoneText;
       private EditText mCodeText;
       private Button mSendBtn;
    @Override
    protected void onCreate(Bundle savedInstancState) {
    super.onCreate(savedInstancState);
    setContentView(R.layout.activity_main);

    mPhoneText = (EditText) findViewById(R.id.phoneEditText);
    mCodeText = (EditText) findViewById(R.id.codeEditText);
    mSendBtn = (Button) findViewById(R.id.sendBtn);

mSendBtn.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {

    }
});

    }
}
