package com.example.mislugares;

import android.app.Application;

public class Aplicacion extends Application {

    public RepositorioLugares lugares = new LugaresLista();
    public AdaptadorLugares adaptador = new AdaptadorLugares(lugares);

    @Override public void onCreate() {
        super.onCreate();
    }
    public RepositorioLugares getLugares() { //Quitar
        return lugares;
    }
}
