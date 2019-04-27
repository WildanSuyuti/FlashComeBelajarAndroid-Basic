package com.example.belajarandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        String user = getIntent().getStringExtra("user");
        String password = getIntent().getStringExtra("password");

        TextView tvContent = findViewById(R.id.tv_content);
        tvContent.append(" User : " + user + " \n" + "password : " + password);
    }


    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return super.onSupportNavigateUp();
    }
}
