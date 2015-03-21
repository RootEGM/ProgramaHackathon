package com.hackathon.medicaleasy.medicaleasy;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.app.Activity;
import android.os.Build;
import android.os.Handler;
import android.view.MotionEvent;
import android.widget.Toast;

public class MedicalEasy extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medical_easy);

        Button buttonDiabetes = (Button)findViewById(R.id.boton_diabetes);
        buttonDiabetes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Se crea un letrero para comprobar que se recibe la pulsacion del boton
                Toast.makeText(getApplicationContext(), "Hola mundo", Toast.LENGTH_LONG).show());
                //Se llama a otra activity
                Intent intentDiabetes;
                intentDiabetes = new Intent(this,Diabetes);
                startActivity(intentDiabetes);
            }
        });
    }
    /*@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_medical_easy, menu);
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
    }*/
}
