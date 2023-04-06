package com.h071211059.recyclerviewapp;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.h071211059.recyclerviewapp.databinding.ItemChatLayoutBinding;

import java.util.ArrayList;

public class ChatAdapter extends RecyclerView.Adapter<ChatAdapter.ChatViewHolder> {

    private final ArrayList<Chat> chats;

    public ChatAdapter(ArrayList<Chat> chats) {
        this.chats = chats;
    }

    @NonNull
    @Override
    public ChatAdapter.ChatViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemChatLayoutBinding binding = ItemChatLayoutBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new ChatViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ChatAdapter.ChatViewHolder holder, int position) {
        holder.onBind(chats.get(position));
    }

    @Override
    public int getItemCount() {
        return chats.size();
    }

    public static class ChatViewHolder extends RecyclerView.ViewHolder {
        private final ItemChatLayoutBinding binding;

        public ChatViewHolder(@NonNull ItemChatLayoutBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        public void onBind(Chat chat) {
            binding.tvName.setText(chat.getName());
            binding.tvChat.setText(chat.getMessages());
            binding.tvTime.setText(chat.getTime());
            binding.ivProfile.setImageResource(chat.getImage());
        }
    }
}
