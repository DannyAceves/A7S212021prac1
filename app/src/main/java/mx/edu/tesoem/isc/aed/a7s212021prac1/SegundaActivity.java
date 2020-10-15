package mx.edu.tesoem.isc.aed.a7s212021prac1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SegundaActivity extends AppCompatActivity {

    TextView lblsaludar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        lblsaludar = findViewById(R.id.lblsaludo);
        Bundle parametros = getIntent().getExtras();
        String nombre = parametros.getString("Nombre");
        lblsaludar.setText("Bienvenido "+nombre);
    }

}