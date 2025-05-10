import java.util.ArrayList;
import java.util.List;
//Implementacion patron estructural - Data Access Object
public class CitaMedicaDaoMemoria implements CitaMedicaDao {
    private List<CitaMedica> citas = new ArrayList<>();

    public void guardar (CitaMedica cita){
        citas.add(cita);
    }

    public void borrar(CitaMedica cita){
        citas.remove(cita);
    }
    public List<CitaMedica> listar(){
        return citas;
    }
}
