package com.leleonb.myappportfolio;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class PortfolioActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_portfolio);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_portfolio, menu);
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

    public void openSpotifyStreamer(View view) {
        showPreliminarToast(getString(R.string.app_spotifystreamer));
    }

    public void openScores(View view) {
        showPreliminarToast(getString(R.string.app_scores));
    }

    public void openLibrary(View view) {
        showPreliminarToast(getString(R.string.app_library));
    }

    public void openBuildItBigger(View view) {
        showPreliminarToast(getString(R.string.app_bigger));
    }

    public void openReader(View view) {
        showPreliminarToast(getString(R.string.app_reader));
    }

    public void openCapstone(View view) {
        showPreliminarToast(getString(R.string.app_capstone));
    }

    private void showPreliminarToast(CharSequence text) {
        Context context = getApplicationContext();

        int duration = Toast.LENGTH_SHORT;

        Toast.makeText(context, "This button will launch my " + text + " app!", duration).show();
    }
}
