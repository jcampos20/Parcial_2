package sv.edu.utec.eva2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listadinamica;
    private ArrayList <empleado> listad;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listad = new ArrayList<empleado>();
        listad.add(new empleado("Alexander Pierrot", "CEO", "Insures S.O", R.drawable.lead_photo_1));
        listad.add(new empleado("Carlos Lopez", "Asistente", "hospitl Blue", R.drawable.lead_photo_2));
        listad.add(new empleado("Sara Bonz", "Directora de Marketing", "Electrical Parts ltd ", R.drawable.lead_photo_3));
        listad.add(new empleado("liliana Clarence", "Diseñadora de Producto", "Creativa App", R.drawable.lead_photo_4));
        listad.add(new empleado("Benito Peralta", "Supervisor de Ventas", "Neumáticos Press", R.drawable.lead_photo_5));
        listad.add(new empleado("Juan Jaramillo", "CEO", "Banco Nacional", R.drawable.lead_photo_6));
        listad.add(new empleado("Christian Steps", "CTO", "Cooperativa Verde", R.drawable.lead_photo_7));
        listad.add(new empleado("Alexa Giraldo", "Lead Programmer", "Frutisofy", R.drawable.lead_photo_8));
        listad.add(new empleado("Linda Murillo", "Directora de Marketing", "Seguros Boliver", R.drawable.lead_photo_9));
        listad.add(new empleado("Lizeth Astrada", "CEO", "Concesionario Motolox", R.drawable.lead_photo_10));

    adapter_empleado adaptador = new adapter_empleado(this, listad);
    listadinamica = findViewById(R.id.listadinamica);
    listadinamica.setAdapter(adaptador);
        listadinamica.setOnItemClickListener(new AdapterView.OnItemClickListener()   {
            @Override    public void onItemClick(AdapterView<?> parent, View view, int position, long id)
        {
            empleado info = listad.get(position);
            Intent intent = new Intent(MainActivity.this, mostrarempleado.class);
            intent.putExtra("Empleado", info.getEmpleado());
            intent.putExtra("Cargo", info.getCargo());
            intent.putExtra("Compañia", info.getCompany());
            intent.putExtra("imagen", info.getImagen());
            startActivity(intent);
        }
        }
        );

    }
}