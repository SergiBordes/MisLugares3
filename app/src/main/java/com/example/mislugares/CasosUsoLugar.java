package com.example.mislugares;

import android.app.Activity;
import android.content.Intent;

public class CasosUsoLugar {

    private Activity actividad;
    private RepositorioLugares lugares;

    public CasosUsoLugar(Activity actividad, RepositorioLugares lugares) {
        this.actividad = actividad;
        this.lugares = lugares;
    }

    // OPERACIONES BÁSICAS
    public void mostrar(int pos) {
        Intent i = new Intent(actividad, VistaLugarActivity.class);
        i.putExtra("pos", pos);
        actividad.startActivity(i);
    }


    public void borrar(int id) {
        lugares.borrar(id);
        actividad.finish();
    }

    public void editar(int pos, int codidoSolicitud) {
        Intent i = new Intent(actividad, EdicionLugarActivity.class);
        i.putExtra("pos", pos);
        actividad.startActivityForResult(i, codidoSolicitud);
    }

    public void guardar(int id, Lugar nuevoLugar) {
        lugares.actualiza(id, nuevoLugar);
    }


}
