package com.polytech.nuitdelinfo.iiioexception;

import android.appwidget.AppWidgetManager;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

/**
 Created by Howard Alexandre and Tua Mathieu and Munier Rémy on 16/03/2017.
 */

public class Accueil extends AppCompatActivity
{
    
    @Override
    protected void onCreate (Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accueil);
        
        Button cmpt1 = (Button) findViewById(R.id.competence1);
        cmpt1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick (View v)
            {
                Intent intent = new Intent(Accueil.this, AccueilSeries.class);
                intent.putExtra("competence", "competence1");
                startActivity(intent);
                finish();
            }
        });
        
        Button cmpt2 = (Button) findViewById(R.id.competence2);
        cmpt2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick (View v)
            {
                Intent intent = new Intent(Accueil.this, AccueilSeries.class);
                intent.putExtra("competence", "competence2");
                startActivity(intent);
                finish();
            }
        });
        
        ImageButton btnNews = (ImageButton) findViewById(R.id.btnNews);
        btnNews.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick (View v)
            {
                Intent intent = new Intent(Accueil.this, NewsActivity.class);
                startActivity(intent);
                finish();
            }
        });
        
        Button wiwi = (Button) findViewById(R.id.widgetCustom);
        wiwi.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick (View v)
            {
                Intent intent = new Intent(Accueil.this, WidgetConfigure.class);
                intent.putExtra(AppWidgetManager.EXTRA_APPWIDGET_ID, 1);
                startActivity(intent);
                finish();
            }
        });
        
        
        //Failed fragment
        /*Fragment newFrag = new BaseFragment();
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.add(R.id.frag_layout, newFrag);
        transaction.commit();

        Button credits =(Button)findViewById(R.id.credits);
        credits.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment frag = new CreditFragment();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frag_layout, frag);
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });*/
        
        
    }
    
    
}
