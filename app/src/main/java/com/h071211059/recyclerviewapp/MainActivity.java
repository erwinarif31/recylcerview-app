package com.h071211059.recyclerviewapp;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.h071211059.recyclerviewapp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setChatRv();

    }

    private void setChatRv() {
        binding.rvChat.setLayoutManager(new LinearLayoutManager(this));
        binding.rvChat.addItemDecoration(new DividerItemDecoration(this,
                DividerItemDecoration.VERTICAL));
        ChatAdapter adapter = new ChatAdapter(ChatDataSource.chats);
        adapter.setClickListener(chat -> goToMessage(chat));
        binding.rvChat.setAdapter(adapter);
    }

    private void goToMessage(Chat chat) {
        Intent intent = new Intent(MainActivity.this, MessageActivity.class);
        intent.putExtra(MessageActivity.EXTRA_CHAT, chat);
        startActivity(intent);
    }
}