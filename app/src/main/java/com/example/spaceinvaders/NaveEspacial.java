package com.example.spaceinvaders;

import android.util.Log;

public class NaveEspacial {

    private int vida;
    private static int numeroNaves=0;
    public String nombre;
    private final int VIDAMAX=100;
    private final int VIDAMIN=0;
    private final int DAMAGE=25;

    public NaveEspacial() {
        this.vida = VIDAMAX;
        numeroNaves ++;
    }

    public static int getTotalNaves() {
        return numeroNaves;
    }

    public void recibirImpacto(){
        this.vida-=DAMAGE;
        Log.i("SpaceInvaders", "La nave "+this.nombre+" ha recibido un impacto, le queda "+this.vida+" de vida.");

        if (this.vida<=VIDAMIN){
            destruirNave();
        }
    }

    private void destruirNave(){
        numeroNaves--;
        Log.i("SpaceInvaders", "La nave "+this.nombre+" ha sido destruida.");

        if (numeroNaves<=0){
            partidaPerdida();
        }
    }
    private void partidaPerdida(){
        Log.i("SpaceInvaders", "Partida perdida, no te quedan naves.");
    }
}
