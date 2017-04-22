package com.example.fran.aplicacioncliente;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void onClickMenu(View btn) {
        Intent intent;
        switch (btn.getId()) {
            case R.id.buttonRestaurante:

                intent = new Intent(this,RestauranteActivity.class);
             /*   intent.putExtra(CLAVE, usuario);
                intent.putExtra(CLAVE2, nivel);
                intent.putExtra(CLAVE3, "logica");
                intent.putExtra(CLAVE6, repetido);
                intent.putExtra(CLAVE7,posicionesRepetidas);*/
                startActivity(intent);
                finish();
                break;

            case R.id.buttonCarta:

                //intent = new Intent(this,CartaActivity.class);
                intent = new Intent(this,Test.class);
                startActivity(intent);
                finish();
                break;

            case R.id.buttonReservas:

                intent = new Intent(this,ReservasActivity.class);
                startActivity(intent);
                finish();
                break;
        }
    }
}
