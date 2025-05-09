import java.util.ArrayList;
import java.util.List;

public class BusquedaDoctor implements BusquedaCitas{
    private String nombreDoctor;

    public BusquedaDoctor(String nombreDoctor){
        this.nombreDoctor = nombreDoctor;
    }

    @Override
    public List<CitaMedica> buscar(List<CitaMedica> cita) {
        List<CitaMedica> resultado = new ArrayList<>();
        for (CitaMedica c: cita){
            if(c.getNombreDoctor().equalsIgnoreCase(nombreDoctor)){
                resultado.add(c);
            }
        }
        return resultado;
    }
}
