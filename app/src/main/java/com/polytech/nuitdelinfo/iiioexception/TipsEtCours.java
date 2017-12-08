package com.polytech.nuitdelinfo.iiioexception;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageButton;
import android.widget.ListView;

import com.polytech.nuitdelinfo.iiioexception.NF.Cours;
import com.polytech.nuitdelinfo.iiioexception.NF.CoursAdapter;
import com.polytech.nuitdelinfo.iiioexception.NF.ListCours;
import com.polytech.nuitdelinfo.iiioexception.NF.ListReponse;
import com.polytech.nuitdelinfo.iiioexception.NF.Reponse;
import com.polytech.nuitdelinfo.iiioexception.NF.ReponseAdapter;

public class TipsEtCours extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tips_et_cours);
        ListView listViewCours = (ListView)findViewById(R.id.cours);


        ListCours listC=new ListCours();
        CoursAdapter adapterC=new CoursAdapter(this, listC);
        listViewCours.setAdapter(adapterC);

        ImageButton ib = (ImageButton)findViewById(R.id.backTips);
        ib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TipsEtCours.this,Accueil.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
