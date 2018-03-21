package com.example.usuario.miercolesmaldito;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class B_Activity extends AppCompatActivity implements View.OnClickListener{



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);
        findViewById(R.id.buttonCancelarB).setOnClickListener(this);
        findViewById(R.id.buttonVolverB).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = null;

        switch (v.getId()){
            case R.id.buttonCancelarA :
                intent= new Intent(B_Activity.this,MainActivity.class);
                intent.putExtra("No te digo mi nombre, feo",MainActivity.class);
                setResult(RESULT_CANCELED,intent);

                break;
            case R.id.buttonVolverA :
                intent = new Intent(B_Activity.this,MainActivity.class);
                intent.putExtra("Este es mi nombre guapo",MainActivity.class);
                setResult(RESULT_OK,intent);
                break;
        }
        finish();
    }
}
