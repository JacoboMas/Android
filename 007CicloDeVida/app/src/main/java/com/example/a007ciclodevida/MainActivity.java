package com.example.a007ciclodevida;


import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;




import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();
    private TextView textViewState;
    private ConstraintLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Referencias a vistas
        textViewState = findViewById(R.id.textView2);
        layout = findViewById(R.id.main);

        // Configurar el estado inicial
        cambiarEstado("onCreate", android.R.color.holo_green_light);

        Log.d(TAG, "onCreate()");
        Toast.makeText(this, "onCreate()", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        cambiarEstado("onStart", android.R.color.holo_blue_light);
        Log.d(TAG, "onStart()");
        Toast.makeText(this, "onStart()", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        cambiarEstado("onResume", android.R.color.holo_orange_light);
        Log.d(TAG, "onResume()");
        Toast.makeText(this, "onResume()", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        cambiarEstado("onPause", android.R.color.holo_red_light);
        Log.d(TAG, "onPause()");
        Toast.makeText(this, "onPause()", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        cambiarEstado("onStop", android.R.color.holo_purple);
        Log.d(TAG, "onStop()");
        Toast.makeText(this, "onStop()", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        cambiarEstado("onRestart", android.R.color.holo_blue_dark);
        Log.d(TAG, "onRestart()");
        Toast.makeText(this, "onRestart()", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        cambiarEstado("onDestroy", android.R.color.black);
        Log.d(TAG, "onDestroy()");
        Toast.makeText(this, "onDestroy()", Toast.LENGTH_SHORT).show();
    }

    // Metodo para cambiar el texto y el fondo
    private void cambiarEstado(String estado, int colorResId) {
        textViewState.setText(estado);
        layout.setBackgroundColor(getResources().getColor(colorResId));
    }
}