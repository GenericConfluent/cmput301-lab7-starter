package com.example.androiduitesting;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.androiduitesting.databinding.ActivityShowBinding;

public class ShowActivity extends AppCompatActivity {
    ActivityShowBinding binding;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityShowBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Intent showActivity = getIntent();
        binding.textView.setText(showActivity.getStringExtra("name"));

        binding.button.setOnClickListener(button -> {
            Intent mainActivity = new Intent(ShowActivity.this, MainActivity.class);
            startActivity(mainActivity);
        });
    }
}
