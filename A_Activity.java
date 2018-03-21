package com.example.usuario.miercolesmaldito;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class A_Activity extends AppCompatActivity implements View.OnClickListener{



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);
        findViewById(R.id.buttonCancelarA).setOnClickListener(this);
        findViewById(R.id.buttonVolverA).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.buttonCancelarA :
                setResult(RESULT_CANCELED);
                break;
            case R.id.buttonVolverA :
                setResult(RESULT_OK);
                break;
        }
        finish();

    }
}
