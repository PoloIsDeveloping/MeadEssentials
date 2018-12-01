package com.example.dino.meadessentials;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toolbar;

public class MeadRecipes extends AppCompatActivity {

    Toolbar toolbar;
    ListView listview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mead_recipes);

        this.toolbar = (Toolbar) findViewById(R.id.toolbar);
        this.toolbar.setTitle(getResources().getString(R.string.app_name));
        this.listview = (ListView) findViewById(R.id.listview);

        ArrayAdapter<String> mAdapter = new ArrayAdapter<>(MeadRecipes.this,
                android.R.layout.simple_list_item_1,
                getResources().getStringArray(R.array.MeadRecipes));

        this.listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(MeadRecipes.this, SeccondActivity.class);
                intent.putExtra("MeadRecipes", listview.getItemAtPosition(i).toString());
                startActivity(intent);
            }
        });
        this.listview.setAdapter(mAdapter);
     }
}
