package sv.edu.utec.eva2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


public class mostrarempleado extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrarempleado);
       TextView tvNombre = findViewById(R.id.tvnombre2);
       TextView tvCargo = findViewById(R.id.tvcargo2);
       TextView tvEmpresa = findViewById(R.id.tvcompa2);
       ImageView imempleado = findViewById(R.id.imempleado2);
        Bundle bundle = getIntent().getExtras();
        String Nombre = bundle.getString("Empleado");
        String Empresa = bundle.getString("Compañia");
        String Cargo = bundle.getString("Cargo");
        int Imagen = bundle.getInt("imagen");
        tvNombre.setText(Nombre);
        tvCargo.setText(Cargo);
        tvEmpresa.setText(Empresa);
        imempleado.setImageResource(Imagen);

    }
    public void back(View view) {    finish();}
}