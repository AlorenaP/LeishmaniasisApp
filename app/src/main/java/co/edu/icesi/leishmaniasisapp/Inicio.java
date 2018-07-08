package co.edu.icesi.leishmaniasisapp;

import android.Manifest;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.database.MergeCursor;
import android.net.Uri;
import android.os.AsyncTask;
import android.provider.MediaStore;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Inicio extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);
    }


    public void onClick_Instrucciones(View v){
        Intent intent= new Intent(Inicio.this,Instrucciones.class);
        startActivity(intent);
    }

    public void onClick_TomarFoto(View v){
        Intent intent= new Intent(Inicio.this,TomarFoto.class);
        startActivity(intent);


    }

    public void onClick_SeleccionarFoto(View v){
        Intent intent= new Intent(Inicio.this,SeleccionarFoto.class);
        startActivity(intent);


    }



}





