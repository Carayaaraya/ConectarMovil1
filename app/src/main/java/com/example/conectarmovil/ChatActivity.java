package com.example.conectarmovil;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class ChatActivity extends AppCompatActivity {

    private List<MessageModel> messageList;
    private MessageAdapter messageAdapter;
    private EditText messageInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);

        messageList = new ArrayList<>();
        messageInput = findViewById(R.id.messageInput);

        RecyclerView messagesRecyclerView = findViewById(R.id.messagesRecyclerView);
        messagesRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        messageAdapter = new MessageAdapter(messageList);
        messagesRecyclerView.setAdapter(messageAdapter);

        Button sendButton = findViewById(R.id.sendButton);
        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendMessage();
            }
        });
    }

    private void sendMessage() {
        String messageText = messageInput.getText().toString().trim();
        if (!messageText.isEmpty()) {
            // Agregar el mensaje a la lista
            messageList.add(new MessageModel(messageText, true));
            messageAdapter.notifyItemInserted(messageList.size() - 1);

            // Simular respuesta del destinatario (puedes remplazar esto con la lógica real)
            simulateResponseFromRecipient();

            // Limpiar el cuadro de texto después de enviar el mensaje
            messageInput.getText().clear();
        }
    }

    private void simulateResponseFromRecipient() {
        // Simular una respuesta del destinatario después de un breve retraso
        new android.os.Handler().postDelayed(
                new Runnable() {
                    public void run() {
                        messageList.add(new MessageModel("Respuesta del destinatario", false));
                        messageAdapter.notifyItemInserted(messageList.size() - 1);
                    }
                },
                1000 // Simula un retraso de 1 segundo
        );
    }
}