package com.example.dino.meadessentials;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toolbar;

public class SeccondActivity extends AppCompatActivity {

    android.support.v7.widget.Toolbar mToolbar;
   ImageView meadRecipe;   // i will be using a mead image for each recipe in list view*/


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seccond);

       this.mToolbar = findViewById(R.id.toolbar1);
       this.meadRecipe = findViewById(R.id.imageView);

        Bundle bundle = getIntent().getExtras();
        if(bundle != null){
            mToolbar.setTitle(bundle.getString("MeadRecipes"));
        }
    }
}
