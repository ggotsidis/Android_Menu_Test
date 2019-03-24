package com.example.menu_example_4screens;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class Help extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_help, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        switch(id) {
            case R.id.action_mainActivity:
                Intent intent_main = new Intent(Help.this, MainActivity.class);
                startActivity(intent_main);
                break;
            case R.id.action_about:
                Intent intent_about = new Intent(Help.this, About.class);
                startActivity(intent_about);
                break;
            case R.id.action_settings:
                Intent intent_settings = new Intent(Help.this, Settings.class);
                startActivity(intent_settings);
                break;

            default:

        }
        return super.onOptionsItemSelected(item);
    }
}
