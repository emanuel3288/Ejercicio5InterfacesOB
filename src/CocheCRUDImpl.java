import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CocheCRUDImpl implements CocheCRUD {
    List<Coche>listaDeCoches = new ArrayList<>();

    //1-Guardar coches
    @Override
    public void save(Coche coche) {
        listaDeCoches.add(coche);
    }
    //2-Leer lista de coches
    @Override
    public List<Coche> buscarCoches() {
        return listaDeCoches;
    }
    //3-

    //4-Eliminar un coche de la lista de coches.
    @Override
    public void delete(Coche cocheAEliminar) {

        //Necesito pasarle un iterador a la lista que reciba
        Iterator<Coche> it = listaDeCoches.iterator();
        while (it.hasNext()) {
            if(it.next()==cocheAEliminar) {
                it.remove();
            }
        }
    }

    //Metodos pedidos en el ejercicio
    @Override
    public void save2() {
        System.out.println("Save2");
    }
    @Override
    public void findAll() {
        System.out.println("findAll");
    }
    @Override
    public void delete2() {
        System.out.println("delete2");
    }
}
