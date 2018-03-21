package com.example.usuario.miercolesmaldito;

import android.content.Intent;

import android.os.Bundle;
import android.view.View;

public class X_Activity extends A_Activity {
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
    }
    @Override
    public void onClick(View view){
        intent = new Intent();
        switch (view.getId()){
            case R.id.buttonVolverB:
                getIntent().putExtra("nombre", "Este es mi nombre, guapo");
                setResult(RESULT_OK,intent);
                break;
            case R.id.buttonCancelarB:
                getIntent().putExtra("nombre", "no te digo mi nombre");
                setResult(RESULT_CANCELED,intent);
                break;
        }
        finish();
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data){
        super.onActivityResult(requestCode,resultCode,data);
    }
}
