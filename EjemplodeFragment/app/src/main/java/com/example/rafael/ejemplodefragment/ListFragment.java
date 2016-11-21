package com.example.rafael.ejemplodefragment;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;



public class ListFragment extends Fragment {


    public ListFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    //Definimos el Array de string y la convertimos en una lista ( ArrayList )


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        return inflater.inflate(R.layout.fragment_list , container, false);

    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);

    }

    public void onActivityCreated (Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);
        String[] sistemasOperativos = new String[]{"Android", "iPhone", "WindowsMobile",
                "Linux", "Os/2", "Ubuntu", "Windows7", "Windows8", "Windows10", "Fedora", "MAC OS X",
                "WindowsXP", "Ubuntu", "Linux", "Os/2", "Ubuntu", "Windows7", "Windows8", "Windows10",
                "WindowsXP", "Ubuntu", "Linux", "Os/2", "Ubuntu", "Windows7", "Windows8",
                "Windows10", "WindowsXP", "Ubuntu", "Linux", "Os/2", "Ubuntu"};

        ArrayList<String> listaSO = new ArrayList<String>(Arrays.asList(sistemasOperativos));

        //Enchufamos la lista al adaptador
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, listaSO);

        // utilizamos nuestro adapter customizado
        //MenuAdapter adapter = new MenuAdapter(this,listaSO);

        //Enchufamos el adaptador a la lista ( listview )
        final ListView listview = (ListView) getActivity().findViewById(R.id.lisview);
        listview.setAdapter(adapter);

        //INTERACTUANDO
        //listview.setOnItemClickListener(new nuestroListener());


    //Implementamos el listener para nuestro ListView
//INER CLASS
    //private class nuestroListener implements AdapterView.OnItemClickListener{
    //  public void onItemClick (AdapterView<?> parent, View view, int position, long id){
    //String de la posicion Clickada
    //       String item = (String) parent.getItemAtPosition(position);

    // Toast.makeText(MainActivity.this,item,Toast.LENGTH_LONG).show();
    //Paso de informacion
    //   Intent intent = new Intent(MainActivity.this, Main2Activity.class);
    // intent.putExtra("so", item);
    //   startActivity(intent);
    //  }
    //  }


    // Inflate the layout for this fragment


    }
    @Override
    public void onDetach() {
        super.onDetach();
    }



}
