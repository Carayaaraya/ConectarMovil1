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

public class ContactsActivity extends AppCompatActivity {

    private List<ContactModel> contactList;
    private ContactAdapter contactAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contatcts);

        contactList = new ArrayList<>();
        initDummyContacts(); // Agrega algunos contactos de ejemplo

        RecyclerView contactsRecyclerView = findViewById(R.id.contactsRecyclerView);
        contactsRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        contactAdapter = new ContactAdapter(contactList);
        contactsRecyclerView.setAdapter(contactAdapter);

        EditText searchEditText = findViewById(R.id.searchEditText);
        Button addContactButton = findViewById(R.id.addContactButton);

        addContactButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Implementa la lógica para agregar nuevos contactos aquí
            }
        });
    }

    private void initDummyContacts() {
        contactList.add(new ContactModel("John Doe", "123-456-7890"));
        contactList.add(new ContactModel("Jane Smith", "987-654-3210"));
        // Agrega más contactos según sea necesario
    }
}
