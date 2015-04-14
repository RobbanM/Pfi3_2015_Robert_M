package com.robert.assignment_1;

import android.content.res.Resources;
import android.support.v7.app.ActionBarActivity;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.RelativeLayout;

import java.util.Random;



import java.util.Random;

public class MainActivity extends ActionBarActivity {


    public void buttonClick(View v){

        Random rand = new Random();

        TextView txtView = (TextView) findViewById(R.id.quote_field);
        txtView.setText(null);

        String[] quoteList= getResources().getStringArray(R.array.quote);

        int nextQuote = rand.nextInt(quoteList.length);
        txtView.setText(quoteList[nextQuote]);
        Log.i("MyAPP","Button pressed");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);}



    @Override
    protected void onStart() {
        super.onStart();
        Log.i("onStart", "Started");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("onResume", "Resumed");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("onPause", "Paused");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("onDestroy", "Destroyed");
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
}
