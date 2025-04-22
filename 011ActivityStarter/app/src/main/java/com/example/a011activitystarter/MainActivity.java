package com.example.a011activitystarter;

import android.content.Intent;
import android.widget.EditText;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Button boton;
    WebView webView;
    EditText urlInput;

    ImageButton botonGoogle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        // Manejar los insets de la pantalla
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Inicializar vistas
        boton = findViewById(R.id.boton);
        webView = findViewById(R.id.vista);
        urlInput = findViewById(R.id.urlInput);// Asegúrate de tener un EditText en el layout con este ID
        botonGoogle = findViewById(R.id.botonGoogle);

        // Configurar la WebView
        webView.setWebViewClient(new WebViewClient());
        webView.getSettings().setJavaScriptEnabled(true);

        // Cargar la página inicial
        webView.loadUrl("https://www.youtube.com/");

        // Establecer acción para el botón
        // Llama al metodo que carga la URL desde el EditText
        boton.setOnClickListener(this::cargarPagina);

        botonGoogle.setOnClickListener(view -> {
            webView.loadUrl("https://www.google.com");
        });

    }

    // Metodo para cargar la URL desde el EditText en la WebView
    public void cargarPagina(View view) {
        String url = urlInput.getText().toString();  // Obtener la URL ingresada por el usuario

        // Comprobar si la URL tiene "http://" o "https://"
        if (!url.startsWith("http://") && !url.startsWith("https://")) {
            url = "http://" + url;  // Añadir "http://" si no está presente
        }

        webView.loadUrl(url);  // Cargar la URL en la WebView
    }


}

