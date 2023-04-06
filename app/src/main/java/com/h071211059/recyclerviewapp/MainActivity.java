package com.h071211059.recyclerviewapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

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
        binding.rvChat.setAdapter(adapter);
    }
}