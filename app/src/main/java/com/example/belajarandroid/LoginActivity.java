package com.example.belajarandroid;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;


public class LoginActivity extends AppCompatActivity {

    private final String TAG = LoginActivity.class.getSimpleName();

    private EditText etUser;
    private EditText etPassword;
    private ImageView ivLogo;
    private Button btnLogin;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getSupportActionBar().hide();

        etUser = findViewById(R.id.et_user);
        etPassword = findViewById(R.id.et_password);
        ivLogo = findViewById(R.id.iv_logo);
        btnLogin = findViewById(R.id.btn_login);

/*        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });*/

    }

    public void doLogin(View view) {
        String user = etUser.getText().toString();
        String password = etPassword.getText().toString();

        if (user.isEmpty()) {
            etUser.setError("Email atau handphone harus di isi !");
            etUser.requestFocus();
            return;
        }

        if (password.isEmpty()) {
            etPassword.setError("Password tidak boleh kosong !");
            etPassword.requestFocus();
            return;
        }

        Log.d(TAG, "onClick: input dari id et_user: " + user);
        Log.d(TAG, "onClick: input dari id et_password: " + password);

        Intent intent = new Intent(LoginActivity.this, HomeActivity.class);
        intent.putExtra("user", user);
        intent.putExtra("password", password);
        startActivity(intent);
    }

}
