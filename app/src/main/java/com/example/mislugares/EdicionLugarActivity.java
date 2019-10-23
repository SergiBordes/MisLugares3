package com.example.mislugares;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.DateFormat;
import java.util.Date;

public class EdicionLugarActivity extends AppCompatActivity {

    private EditText nombre;
    private Spinner tipo;
    private EditText direccion;
    private EditText telefono;
    private EditText url;
    private EditText comentario;
    private Lugar lugar;
    private int pos;
    private RepositorioLugares lugares;
    private CasosUsoLugar usoLugar;

    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.edicion_lugar);
        Bundle extras = getIntent().getExtras();
        pos = extras.getInt("pos", 0);
        lugares = ((Aplicacion) getApplication()).lugares;
        usoLugar = new CasosUsoLugar(this, lugares);
        lugar = lugares.elemento(pos);
        actualizaVistas();
    }

    public void actualizaVistas() {
        TextView nombre = findViewById(R.id.nombre);
        nombre.setText(lugar.getNombre());
        TextView direccion = findViewById(R.id.direccion);
        direccion.setText(lugar.getDireccion());
        TextView telefono = findViewById(R.id.telefono);
        telefono.setText(Integer.toString(lugar.getTelefono()));
        TextView url = findViewById(R.id.url);
        url.setText(lugar.getUrl());
        TextView comentario = findViewById(R.id.comentario);
        comentario.setText(lugar.getComentario());
    }

}
