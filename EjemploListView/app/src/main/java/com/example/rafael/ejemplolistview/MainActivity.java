package com.example.rafael.ejemplolistview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.menu.*;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Definimos el Array de string y la convertimos en una lista ( ArrayList )

        String[] sistemasOperativos = new String[] { "Android", "iPhone","WindowsMobile",
        "Linux", "Os/2", "Ubuntu", "Windows7", "Windows8", "Windows10", "Fedora", "MAC OS X",
        "WindowsXP", "Ubuntu", "Linux", "Os/2", "Ubuntu", "Windows7", "Windows8", "Windows10",
                "WindowsXP", "Ubuntu", "Linux", "Os/2", "Ubuntu", "Windows7", "Windows8",
                "Windows10","WindowsXP", "Ubuntu", "Linux", "Os/2", "Ubuntu"};

        ArrayList<String> listaSO = new ArrayList<String>(Arrays.asList(sistemasOperativos));

        //Enchufamos la lista al adaptador
        //ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,listaSO);

        // utilizamos nuestro adapter customizado
        MenuAdapter adapter = new MenuAdapter(this,listaSO);

        //Enchufamos el adaptador a la lista ( listview )
        final ListView listview =(ListView) findViewById(R.id.lisview);
        listview.setAdapter(adapter);

        //INTERACTUANDO
        listview.setOnItemClickListener(new nuestroListener());
    }

    //Implementamos el listener para nuestro ListView
    //INER CLASS
    private class nuestroListener implements AdapterView.OnItemClickListener{
        public void onItemClick (AdapterView<?> parent, View view, int position, long id){
           //String de la posicion Clickada
            String item = (String) parent.getItemAtPosition(position);

           // Toast.makeText(MainActivity.this,item,Toast.LENGTH_LONG).show();
            //Paso de informacion
            Intent intent = new Intent(MainActivity.this, Main2Activity.class);
            intent.putExtra("so", item);
            startActivity(intent);
        }
    }

}
