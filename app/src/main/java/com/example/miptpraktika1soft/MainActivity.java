package com.example.miptpraktika1soft;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

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
    }
}