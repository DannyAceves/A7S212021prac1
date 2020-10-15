package mx.edu.tesoem.isc.aed.a7s212021prac1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText txtnom;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtnom = findViewById(R.id.nombre);
    }
    public void llamarpantalla(View v){
        String nombre = txtnom.getText().toString();
        Intent intent = new Intent(this, SegundaActivity.class);
        intent.putExtra( "Nombre", nombre);
        startActivity(intent);

    }
}