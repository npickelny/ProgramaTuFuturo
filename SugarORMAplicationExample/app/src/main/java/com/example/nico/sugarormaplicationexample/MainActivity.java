package com.example.nico.sugarormaplicationexample;

import android.support.annotation.NonNull;
import android.support.v4.app.TaskStackBuilder;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.nico.sugarormaplicationexample.Clases.Persona;
import com.orm.SugarApp;
import com.orm.SugarContext;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Button actualizarCont;
    private Button guardar;
    private TextView contador;

    private EditText dni;
    private EditText nombre;
    private EditText telefono;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //SugarContext.init(getApplicationContext());


        dni = (EditText) findViewById(R.id.editTextDni);
        telefono = (EditText) findViewById(R.id.editTextTel);
        nombre = (EditText) findViewById(R.id.editTextNom);

        contador = (TextView) findViewById(R.id.contador);
        //contador.setText("0");

        actualizarCont = (Button) findViewById(R.id.button2);
        actualizarCont.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                List<Persona> personas  = Persona.listAll(Persona.class);
                contador.setText(String.valueOf(personas.size()));
            }
        });


        guardar = (Button) findViewById(R.id.button);
        guardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(dni.getText().toString() == "" || nombre.getText().toString().equals("") || telefono.getText().toString().equalsIgnoreCase("")){
                    Toast.makeText(v.getContext(), "Hay Campos Vacios", Toast.LENGTH_SHORT).show();
                }
                else {
                    Persona p = new Persona(nombre.getText().toString(), Integer.parseInt(telefono.getText().toString()), Integer.parseInt(dni.getText().toString()));
                    p.save();
                }

            }
        });
    }
}
