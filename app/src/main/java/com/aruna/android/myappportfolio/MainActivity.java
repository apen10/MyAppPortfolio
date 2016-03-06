package com.aruna.android.myappportfolio;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void clickSpotifyStreamer(View view){
        Toast.makeText(MainActivity.this, "This button will launch Spotify Streamer!", Toast.LENGTH_SHORT).show();
    }

    public void clickScoresApp(View view){
        Toast.makeText(MainActivity.this, "This button will launch Scores App!", Toast.LENGTH_SHORT).show();
    }

    public void clickLibraryApp(View view){
        Toast.makeText(MainActivity.this, "This button will launch Library App!", Toast.LENGTH_SHORT).show();
    }

    public void clickBuildIt(View view){
        Toast.makeText(MainActivity.this, "This button will launch Build It Bigger!", Toast.LENGTH_SHORT).show();
    }

    public void clickXYZReader(View view){
        Toast.makeText(MainActivity.this, "This button will launch XYZ Reader!", Toast.LENGTH_SHORT).show();
    }

    public void clickCapstone(View view){
        Toast.makeText(MainActivity.this, "This button will launch My Capstone App!", Toast.LENGTH_LONG).show();
    }
}
