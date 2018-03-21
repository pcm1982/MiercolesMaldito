package com.example.usuario.miercolesmaldito;

import android.content.Intent;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    public static final int REQUEST_CODE_A = 10;
    public static final int REQUEST_CODE_B = 20;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.buttonA).setOnClickListener(this);
        findViewById(R.id.buttonB).setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        Intent intent = null;
        int requestCode = 0;

        switch (v.getId()) {
            case R.id.buttonA:
                intent = new Intent(MainActivity.this, A_Activity.class);
                requestCode = MainActivity.REQUEST_CODE_A;
                break;
            case R.id.buttonB:
                intent = new Intent(MainActivity.this, B_Activity.class);
                requestCode = MainActivity.REQUEST_CODE_B;
                break;
        }

        startActivityForResult(intent, requestCode);
    }
    @Override
    protected void onActivityResult( int requestCode, int resultCode, Intent data){
        super.onActivityResult(requestCode,resultCode,data);
        Toast toast = null;
        switch (requestCode){
            case MainActivity.REQUEST_CODE_A:
                if(resultCode==RESULT_OK) {
                    toast = Toast.makeText(this, "respuesta OK de A", Toast.LENGTH_LONG);
                }else if (resultCode==RESULT_CANCELED){
                    toast = Toast.makeText(this, "respuesta cancel de A", Toast.LENGTH_LONG);
                }
                break;
            case MainActivity.REQUEST_CODE_B:

                if(resultCode==RESULT_OK) {
                    toast = Toast.makeText(this, "respuesta OK de B" +data, Toast.LENGTH_LONG);
                }else if (resultCode==RESULT_CANCELED){
                    toast = Toast.makeText(this, "respuesta cancel de B"+data, Toast.LENGTH_LONG);
                }
                break;
        }
        if(toast != null){
            toast.show();
        }
    }

    }

