package com.example.conectarmovil;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class EditProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_profile);

        // Obtener datos del perfil para prellenar los campos de edición
        String username = "Nombre de Usuario";  // Reemplaza con datos reales
        String bio = "Esta es mi biografía";  // Reemplaza con datos reales

        // Mostrar datos en los campos de edición
        EditText usernameEditText = findViewById(R.id.usernameEditText);
        EditText bioEditText = findViewById(R.id.bioEditText);

        usernameEditText.setText(username);
        bioEditText.setText(bio);

        Button saveProfileButton = findViewById(R.id.saveProfileButton);
        saveProfileButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Guardar los cambios en el perfil (actualizar en la base de datos, etc.)
                finish();  // Cerrar la actividad después de guardar
            }
        });
    }
}