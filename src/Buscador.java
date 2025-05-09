import java.util.List;

public class Buscador {
    private BusquedaCitas estrategia;

    public void setEstrategia(BusquedaCitas estrategia){
        this.estrategia = estrategia;
    }
    public List<CitaMedica> buscar (List<CitaMedica> citas){
        if(estrategia == null){
            throw new IllegalStateException("No se ha definido una estrategia de búsqueda");
        }
        return estrategia.buscar(citas);
    }
}
