import java.util.List;

public interface CocheCRUD {

    //save() findAll() delete()
    void save(Coche coche);
    List<Coche> buscarCoches();
    void delete(Coche coche);

    //Como métodos de CocheCRUD podemos poner:
    //
    //save() findAll() delete() que simplemente impriman por consola el nombre del propio método.
    void save2();
    void findAll();
    void delete2();
}
