package com.h071211059.recyclerviewapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.h071211059.recyclerviewapp.databinding.ActivityMessageBinding;

public class MessageActivity extends AppCompatActivity {
    public static final String EXTRA_CHAT = "chat";

    private ActivityMessageBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMessageBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Chat chat = (Chat) getIntent().getParcelableExtra(EXTRA_CHAT);
        setProfile(chat);

        binding.topNavbar.ivBack.setOnClickListener(v -> finish());
    }

    private void setProfile(Chat chat) {
        binding.topNavbar.tvName.setText(chat.getName());
        binding.topNavbar.ivProfile.setImageResource(chat.getImage());
    }
}