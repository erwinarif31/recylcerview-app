package com.h071211059.recyclerviewapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.h071211059.recyclerviewapp.databinding.ActivityProfileBinding;

public class ProfileActivity extends AppCompatActivity {
    private ActivityProfileBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityProfileBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        User user = (User) getIntent().getParcelableExtra(MessageActivity.EXTRA_CHAT);
        binding.topNavbar.ivBack.setOnClickListener(v -> finish());
        binding.tvNameProfile.setText(user.getName());
        binding.tvPhoneNumber.setText(user.getPhoneNumber());
        binding.ivProfile.setImageResource(user.getImage());

        System.out.println(user.getPhoneNumber());
    }
}