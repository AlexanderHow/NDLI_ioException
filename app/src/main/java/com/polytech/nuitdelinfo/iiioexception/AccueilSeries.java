package com.polytech.nuitdelinfo.iiioexception;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

/**
 * Created by Howard Alexandre and Tua Mathieu and Munier Rémy on 16/03/2017.
 */

public class AccueilSeries extends AppCompatActivity {
    private Button serie1;
    private Button serie2;
    private Button serie3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accueil_series);

        final String competence = this.getIntent().getStringExtra("competence");
        final Intent intent=new Intent(AccueilSeries.this,Exercice.class);
        final Bundle extras = new Bundle();
        extras.putString("competence",competence);

        serie1=(Button)findViewById(R.id.serie1);
        serie2=(Button)findViewById(R.id.serie2);
        serie3=(Button)findViewById(R.id.serie3);

        goodLibelleForButton(competence);


        serie1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                extras.putString("serie", "serie1");
                intent.putExtras(extras);
                startActivity(intent);
                finish();
            }
        });


        serie2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                extras.putString("serie", "serie2");
                intent.putExtras(extras);
                startActivity(intent);
                finish();
            }
        });


        serie3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                extras.putString("serie", "serie3");
                intent.putExtras(extras);
                startActivity(intent);
                finish();
            }
        });

        ImageView bouttonRetourTemp=(ImageView)findViewById(R.id.imageView2);
        bouttonRetourTemp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(AccueilSeries.this,Accueil.class);
                startActivity(intent);
                finish();
            }
        });
    }

    public void goodLibelleForButton(String cmpt){

        if(cmpt.equals("competence1")){
            serie1.setText("Présentes toi");
            serie2.setText("Réponds aux questions");
            serie3.setText("Poses des questions");
        }
        else if(cmpt.equals("competence2")){
            serie1.setText("Comprendre des consignes");
            serie2.setText("Comprendre des mots");
            serie3.setText("Comprendre des expressions");
        }
    }
}
