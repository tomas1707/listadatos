package datos;

public class DatosEmpresariales extends DatosPersonales{
    private String curp;
    private String rfc;
    private  boolean titulo;
    private  boolean cedula;

    public DatosEmpresariales(String nombre, String apellidos, String telefono){
        super(nombre,apellidos, telefono);
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public boolean isTitulo() {
        return titulo;
    }

    public void setTitulo(boolean titulo) {
        this.titulo = titulo;
    }

    public boolean isCedula() {
        return cedula;
    }

    public void setCedula(boolean cedula) {
        this.cedula = cedula;
    }

    @Override
    public String toString(){
        return "Nombre: " + super.getNombre() + "\n" +
                "Apellidos: " + super.getApellidos() + "\n" +
                "Correo: " + super.getCorreo() + "\n" +
                "Telefono: " + super.getTelefono() + "\n" +
                "Curp: " + this.curp + "\n" +
                "RFC: " + this.rfc + "\n" +
                "Titulo: " + this.titulo + "\n" +
                "Cedula:" + this.cedula + "\n";
    }
}
