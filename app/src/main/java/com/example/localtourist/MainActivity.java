package com.example.localtourist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;
import com.example.localtourist.R;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.my_menu, menu
        );
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        //set onclick listener for menu items
        int itemId = item.getItemId();
        if (itemId == R.id.setp) {
            Intent i = new Intent(this, Preference.class);
            startActivity(i);
        } else if (itemId == R.id.offlinem) {
            Intent k = new Intent(this, MapsActivity2.class);
            startActivity(k);
        }
        return super.onOptionsItemSelected(item);
    }
}