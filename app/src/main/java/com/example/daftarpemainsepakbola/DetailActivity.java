package com.example.daftarpemainsepakbola;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.Objects;

public class DetailActivity extends AppCompatActivity {
    ImageView img_player_photo;
    TextView tv_player_name, tv_player_detail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        img_player_photo = findViewById(R.id.img_player_photo);
        tv_player_name = findViewById(R.id.tv_player_name);
        tv_player_detail = findViewById(R.id.tv_player_detail);

        showDataPlayer();
    }

    protected void showDataPlayer(){
        Intent intent = getIntent();

        String name = intent.getStringExtra("Name");
        String detail = intent.getStringExtra("Detail");
        int photo = intent.getIntExtra("Photo", 0);

//        Objects.requireNonNull(getSupportActionBar()).setTitle(name);
//        getSupportActionBar().show();
//        Glide.with(this)
//                .load(photo)
//                .apply(new RequestOptions())
//                .into(img_player_photo);
        img_player_photo.setImageResource(photo);
        tv_player_name.setText(name);
        tv_player_detail.setText(detail);
    }
}
