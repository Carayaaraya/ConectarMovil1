package com.example.conectarmovil;


import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ViewProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_profile);

        // Obtener datos del perfil (puedes obtenerlos desde tu base de datos o SharedPreferences)
        String username = "Nombre de Usuario";  // Reemplaza con datos reales
        String bio = "Esta es mi biografía";  // Reemplaza con datos reales
        // Obtén la imagen del perfil (puedes cargarla desde la base de datos o almacenamiento local)

        // Mostrar datos en la interfaz de usuario
        TextView usernameTextView = findViewById(R.id.usernameTextView);
        TextView bioTextView = findViewById(R.id.bioTextView);
        ImageView profileImageView = findViewById(R.id.profileImageView);

        usernameTextView.setText(username);
        bioTextView.setText(bio);
        // Setea la imagen del perfil en el ImageView
        // profileImageView.setImageResource(R.drawable.default_profile_image);
    }
}