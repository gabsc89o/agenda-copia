package com.example.usuari.agenda;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ActivityShow extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);
        Intent intent = this.getIntent();
        TextView todos= (TextView) this.findViewById(R.id.tvTodos);
        for(contactos p : MainActivity.l){
            todos.setText(p.getName());
        }
    }
    public void cerrar(View v){
        this.finish();
    }
}
