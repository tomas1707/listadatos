import lista.ListaDatos;

public class Main {
    public static void main(String[] args) {
        ListaDatos obj = new ListaDatos();

        obj.add("Ruben", "Contreras Flores","ruben.contreras@gmail.com","2481226596");
        obj.addEmpresariales(0,"GOAT800717DSHFSJSK","GOTKS456545FF", true,true);

        obj.add("Jimena", "Gasca Torres","jimena.gasca@gmail.com","248125666");
        obj.addEmpresariales(0,"JIGA800717DSHFSJSK","JIGAKS456545FF", true,false);

        System.out.println(obj.getdatos(0));
        System.out.println(obj.getdatos(1));

    }
}
