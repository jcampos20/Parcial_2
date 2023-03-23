package sv.edu.utec.eva2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class adapter_empleado extends ArrayAdapter<empleado> {

    AppCompatActivity context;
    ArrayList <empleado> listempleados;




    public adapter_empleado(AppCompatActivity context, ArrayList<empleado> listaempleados) {
        super(context, R.layout.empleados, listaempleados);
        this.context=context;
        listempleados=listaempleados;
    }
    public View getView(int position, View ConvertView, ViewGroup parent) {
        LayoutInflater inflamable = this.context.getLayoutInflater();
        View listaempleados = inflamable.inflate(R.layout.empleados, null);
        TextView tvcargo = listaempleados.findViewById(R.id.tvcargo);
        TextView tvnombre = listaempleados.findViewById(R.id.tvnombre);
        TextView tvcompa = listaempleados.findViewById(R.id.tvcompa);
        ImageView imempleado = listaempleados.findViewById(R.id.imempleado);
        tvcargo.setText(listempleados.get(position).getCargo());
        tvnombre.setText(listempleados.get(position).getEmpleado());
        tvcompa.setText(listempleados.get(position).getCompany());
        imempleado.setImageResource(listempleados.get(position).getImagen());
        return(listaempleados);
    }

}
