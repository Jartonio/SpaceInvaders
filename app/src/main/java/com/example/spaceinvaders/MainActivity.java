package com.example.spaceinvaders;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import javax.security.auth.login.LoginException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final String TAG="SpaceInvaders";

        NaveEspacial alfa= new NaveEspacial();
        alfa.nombre="Alfa";
        Log.i(TAG, "Se ha creado la nave: "+alfa.nombre);

        NaveEspacial beta=new NaveEspacial();
        beta.nombre="Beta";
        Log.i(TAG,"Se ha creado la nave: "+ beta.nombre);

        Log.i(TAG,"Hay un total de "+NaveEspacial.getTotalNaves()+ " naves espaciales.");

        alfa.recibirImpacto();;
        beta.recibirImpacto();

        alfa.recibirImpacto();
        beta.recibirImpacto();
        beta.recibirImpacto();
        alfa.recibirImpacto();
        beta.recibirImpacto();
        beta.recibirImpacto();
        alfa.recibirImpacto();


    }
}