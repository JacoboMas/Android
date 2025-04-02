package com.example.a004setteartexto;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    // Declaración de variables
    Button boton;// Esto es una referencia a la vista del botón que se encuentra en el XML
    TextView cajita;// Esto es una referencia a la vista del TextView que se encuentra en el XML

    boolean buttonClicked = false; //Variable para rastrear el estado del boton

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);// Habilita configuraciones para el diseño a pantalla completa
        setContentView(R.layout.activity_main);// Asocia esta actividad con el diseño XML llamado "activity_main"

        // Ajustes para manejar insets de sistema como barras de estado y navegación
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });


        // Inicialización de las vistas
        boton = findViewById(R.id.boton);
        cajita = findViewById(R.id.cajita);

        // Configuración del listener para el botón
        boton.setOnClickListener(v -> {
            if (buttonClicked){
                // cierra el programa
                finish();
            }else{
                setearTexto();
                buttonClicked = true; // cambia el estado del boton
            }
        });
    }

    private void setearTexto(){
        cajita.setText("Pulsaste el boton");
        /* Modifica el texto que aparece en el TextView identificado como "cajita".
         * Gracias a la inicialización previa (cajita = findViewById(R.id.cajita)),
         * ahora puedes acceder a sus propiedades y métodos. */
    }
}