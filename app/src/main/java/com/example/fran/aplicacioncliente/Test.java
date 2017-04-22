package com.example.fran.aplicacioncliente;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

import com.example.fran.aplicacioncliente.objetos.Hamburguesas;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Test extends AppCompatActivity {

    TextView valorBase;
    String nombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);



        valorBase = (TextView) findViewById(R.id.valorText);

        FirebaseDatabase database = FirebaseDatabase.getInstance();
        //se linkea con la carpeta objetos ReferenciasFireBase.REFERENCIAFIRE)
       // DatabaseReference referencia = database.getReference(ReferenciasFireBase.REFERENCIAFIRE);
        DatabaseReference referencia = database.getReference("hamburguesas");

        //Log.i("KEY",referencia.getKey()); comprobamos si se conecta mediante el monitor

        referencia.child("simples").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                Hamburguesas hamburguesa = dataSnapshot.getValue(Hamburguesas.class);
                //int valor = dataSnapshot.getValue(Integer.class);
                //Log.i("Hamburguesa", hamburguesa.getNombre());
                nombre = hamburguesa.getNombre();
                valorBase.setText(nombre);
                //valorBase.setText(valor);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
                //comprobamos hay errores mediante el monitor
                Log.e("Error",databaseError.getMessage());
            }
        });

    }
}
