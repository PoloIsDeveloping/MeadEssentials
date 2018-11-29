package com.example.dino.meadessentials;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ListMenuMead extends AppCompatActivity {

    private ArrayList<String> data = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_items_mead_recipes);
        ListView lv = (ListView) findViewById(R.id.listview);
        generateListContent();
    }

    private void generateListContent() {
        for(int i = 0; i < 55; i++){
            data.add("This is row number " + i);
        }
    }

    @Override
    public boolean onCreateOptionMenu(Menu menu) {
        // inflate the menu this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.memu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        // Handle action bar item clicks here the action bar will
        // automatically handle clicks on the hom,e/up button so long as
        //you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection Simplifablestatment
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
        }
    }

    private class MyListAdapter extends ArrayAdapter<String>{

    }