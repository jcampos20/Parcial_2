package sv.edu.utec.eva2;

public class empleado {
    private String empleado;
    private String cargo;
    private String company;
    private int imagen;

    public empleado(String empleado, String cargo, String company, int imagen) {
        this.empleado = empleado;
        this.cargo = cargo;
        this.company = company;
        this.imagen = imagen;
    }

    public String getEmpleado() {
        return empleado;
    }



    public String getCargo() {
        return cargo;
    }



    public String getCompany() {
        return company;
    }



    public int getImagen() {
        return imagen;
    }


}
