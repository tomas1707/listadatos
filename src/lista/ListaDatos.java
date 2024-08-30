package lista;
import datos.DatosEmpresariales;


public class ListaDatos {
    private DatosEmpresariales[] miLista= new DatosEmpresariales[20];
    private int i;

    public ListaDatos(){
        i=0;
    }

    public void add(String nombre, String apellidos, String correo, String telefono){
        miLista[i]= new DatosEmpresariales(nombre,apellidos, telefono);
        i++;
    }

    public void addEmpresariales(int id, String curp, String rfc, boolean titulo, boolean cedula){
        miLista[id].setCurp(curp);
        miLista[id].setRfc(curp);
        miLista[id].setTitulo(titulo);
        miLista[id].setCedula(cedula);
    }

    public String getdatos(int id){
        return miLista[id].toString();
    }

}
