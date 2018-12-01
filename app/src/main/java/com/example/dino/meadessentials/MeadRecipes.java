package com.example.dino.meadessentials;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MeadRecipes extends AppCompatActivity {

    android.support.v7.widget.Toolbar toolbar;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mead_recipes);
        this.toolbar = findViewById(R.id.customToolbar);
        this.toolbar.setTitle(getResources().getString(R.string.app_name));
        this.listView = findViewById(R.id.customListView);

        ArrayAdapter<String> mAdapter = new ArrayAdapter<>(MeadRecipes.this,
                android.R.layout.simple_list_item_1,
                getResources().getStringArray(R.array.MeadRecipes));

        this.listView.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l)
            {
                Intent intent = new Intent(MeadRecipes.this, SeccondActivity.class);
                intent.putExtra("MeadRecipes", listView.getItemAtPosition(i).toString());
                startActivity(intent);
            }
        });
        this.listView.setAdapter(mAdapter);
     }
}
