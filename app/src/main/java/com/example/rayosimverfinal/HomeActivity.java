package com.example.rayosimverfinal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.rayosimverfinal.Model.User;

public class HomeActivity extends AppCompatActivity {
    private TextView tvUser;
    private User user;
    Button btnadisclaimer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        btnadisclaimer=(Button)findViewById(R.id.btnadisclaimer);

        user = (User) getIntent().getSerializableExtra("User");

        tvUser = findViewById(R.id.tvUser);

        if (user != null) {
            tvUser.setText("WELCOME " + user.getUserName());
        }

        btnadisclaimer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(HomeActivity.this, Disclaimer.class);
                startActivity(i);
            }
        });
    }
}
