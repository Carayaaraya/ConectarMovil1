package com.example.conectarmovil;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

    public class MessageAdapter extends RecyclerView.Adapter<MessageAdapter.MessageViewHolder> {

        private List<MessageModel> messageList;

        public MessageAdapter(List<MessageModel> messageList) {
            this.messageList = messageList;
        }

        @NonNull
        @Override
        public MessageViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext()).inflate(viewType, parent, false);
            return new MessageViewHolder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull MessageViewHolder holder, int position) {
            MessageModel message = messageList.get(position);
            holder.messageTextView.setText(message.getMessageText());

            // Si el mensaje fue enviado por el usuario, puedes personalizar la apariencia aquí
        }

        @Override
        public int getItemViewType(int position) {
            return messageList.get(position).isSentByUser() ? R.layout.item_message_sent : R.layout.item_message_received;
        }

        @Override
        public int getItemCount() {
            return messageList.size();
        }

        public static class MessageViewHolder extends RecyclerView.ViewHolder {
            TextView messageTextView;

            public MessageViewHolder(@NonNull View itemView) {
                super(itemView);
                messageTextView = itemView.findViewById(R.id.messageTextView);
            }
        }
    }

