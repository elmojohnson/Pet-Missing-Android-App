package com.silentdev.petmissingapp.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;
import com.silentdev.petmissingapp.R;

public class Login extends AppCompatActivity {

    EditText editEmail, editPassword;
    Button btnLogin;
    TextView txtRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);

        // Layouts
        editEmail = findViewById(R.id.emailEdit);
        editPassword = findViewById(R.id.passwordEdit);
        btnLogin = findViewById(R.id.loginBtn);
        txtRegister = findViewById(R.id.registerTxt);

        // Button on click
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = editEmail.getText().toString();
                String password = editPassword.getText().toString();

                if (email.isEmpty()) {
                    editEmail.setError("Please enter your email");
                } else if (password.isEmpty()) {
                    editPassword.setError("Please enter your password");
                } else {
                    login(email, password);
                }

            }
        });

    }

    private void login(String email, String password) {

    }
}