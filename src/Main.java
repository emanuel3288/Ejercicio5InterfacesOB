import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Creo instancias de la clase coche para agregar a la base de datos(elementos)
        Coche giuliaAlfaRomeo  = new Coche("Giulia","Alfa Romeo","2.9 L V6","Rojo",4);
        Coche renault9         = new Coche("9","Renault","1.5 L V2","Azul",4);
        Coche renaultSandero  = new Coche("sandero","Renault","2.2 L V4","Gris",2);

        //Cree la base de datos
        CocheCRUDImpl baseDeCoches = new CocheCRUDImpl();

        //Guardé elementos en la base de datos.
        baseDeCoches.save(giuliaAlfaRomeo);
        baseDeCoches.save(renault9);
        baseDeCoches.save(renaultSandero);

        //busco elemento de la base de datos
        List<Coche>todosLosCoches=baseDeCoches.buscarCoches();
        System.out.println(todosLosCoches);

        //eliminar coches de la base de datos
        baseDeCoches.delete(giuliaAlfaRomeo);
        baseDeCoches.delete(renaultSandero);
        System.out.println(baseDeCoches.buscarCoches());

        //metodos pedidos en el ejercicio.
        baseDeCoches.findAll();
        baseDeCoches.save2();
        baseDeCoches.delete2();

    }
}
