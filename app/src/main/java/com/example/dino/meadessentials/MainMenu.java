package com.example.dino.meadessentials;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainMenu extends AppCompatActivity {

   private final Context CURRENT_CONTEXT = this;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        final Button btnTerstInstance = findViewById(R.id.btnTest);

        btnTerstInstance.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                startNewActivity(TestScreen.class);            }
        });
    }

    private void startNewActivity(Class classToStart)
    {
        try {
            Intent newActivity = new Intent(this.CURRENT_CONTEXT,classToStart);
            startActivity(newActivity);
        } catch (Exception e){
            Log.i(classToStart.getName(),"Failed to launch new Activity: " + e.getMessage());
        }
    }
}
