package com.example.a005numerosprimos;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    // Declaración de variables
    EditText Numero;
    Button Boton;
    TextView Resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });


        // Inicialización de las vistas
        Resultado = findViewById(R.id.textView2);
        Numero = findViewById(R.id.editText);
        Boton = findViewById(R.id.button);

        // Establecemos la funcionalidad del botón
        Boton.setOnClickListener(v -> {
            // Código que se ejecuta cuando el usuario hace clic en el botón.
            String input = Numero.getText().toString();
            // Obtiene el texto del campo de entrada y lo convierte a String.
            if (!input.isEmpty()) {
                // Comprueba que el usuario haya ingresado algo.
                int number = Integer.parseInt(input);
                // Convierte la entrada de texto en un número entero.
                int primo = siguientePrimo(number);
                // Llama al metodo para calcular el siguiente número primo.
                Resultado.setText("El siguiente número primo es: " + primo);
                // Muestra el resultado en el TextView.
            }
        });


    }

    // Función que verifica si un número es primo
    public boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Función que encuentra el siguiente número primo después del número dado
    public int siguientePrimo(int numero) {
        // Devuelve el siguiente número primo después del número proporcionado.
        int siguiente = numero + 1;
        // Empieza a comprobar desde el número siguiente.
        while (!esPrimo(siguiente)) {
            // Busca hasta encontrar un número primo.
            siguiente++;
        }
        return siguiente;
        // Devuelve el número primo encontrado.
    }

}