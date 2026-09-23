package com.example.miptpraktika1soft;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
// Susiejame Java kintamuosius su XML dizaino elementais pagal jų ID
        TextView manoTekstas = findViewById(R.id.textView1);
        Button mygtukas1 = findViewById(R.id.button1);

        // Nustatome, kas įvyks paspaudus mygtuką
        mygtukas1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                manoTekstas.setText("ISSOKANTIS TEKSTAS!");
            }
        });
// Antro mygtuko susiejimas
        Button mygtukas2 = findViewById(R.id.button2);

        // Kas įvyks paspaudus antrą mygtuką
        mygtukas2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Keičiame teksto spalvą į raudoną
                manoTekstas.setTextColor(android.graphics.Color.RED);
            }
        });
// Trečio mygtuko susiejimas
        Button mygtukas3 = findViewById(R.id.button3);

        // Kas įvyks paspaudus trečią mygtuką
        mygtukas3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Keičiame paties teksto fono spalvą į geltoną
                manoTekstas.setBackgroundColor(android.graphics.Color.YELLOW);
            }
        });


    }
}