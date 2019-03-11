package com.example.pljc_pc.uas_risman;

import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.design.widget.CoordinatorLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    public boolean onCreateOptionsMenu(Menu menu)
    {

        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_main,menu);
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        final Button reset = (Button)findViewById(R.id.Clear);
        final TextView Namadepan = (TextView) findViewById(R.id.Namadepan);
        final TextView Email = (TextView) findViewById(R.id.Email);
        final Button Simpan = (Button) findViewById(R.id.Simpan);




        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Namadepan.setText("");
                Email.setText("");
            }
        });
 Simpan.setOnClickListener(new View.OnClickListener() {
     @Override
     public void onClick(View v) {
         View parentView = findViewById(R.id.parentView);
         String pesan = "Data Tersimpan";
         Snackbar snackbar = Snackbar.make(parentView,pesan, Snackbar.LENGTH_LONG);
         snackbar.show();
     }
 });

    }







}
