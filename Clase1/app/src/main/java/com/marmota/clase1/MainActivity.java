package com.marmota.clase1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button boton1;
    EditText nombre;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        boton1 = (Button) findViewById(R.id.button);
        nombre = (EditText)findViewById(R.id.nombre);
        boton1.setText("Marmota Bebe");
    }

    public void Saluda(View view){
        String n = nombre.getText().toString();
        Toast.makeText(this, "hola"+n, Toast.LENGTH_SHORT).show();
    }
}
