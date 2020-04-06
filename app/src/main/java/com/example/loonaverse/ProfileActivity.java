package com.example.loonaverse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        Button btnToWeb = findViewById(R.id.btn_data);
        btnToWeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intentToWeb();
            }
        });

        ImageView icBackToHome = findViewById(R.id.ic_back_profile);
        icBackToHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    private void intentToWeb() {
        String url = "https://loonatheworld.fandom.com/wiki/LOONA_Wiki";
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }
}
