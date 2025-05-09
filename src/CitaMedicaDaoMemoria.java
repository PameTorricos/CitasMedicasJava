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
    /*public List<CitaMedica>buscarPaciente(String nombrePaciente){
        List<CitaMedica> resultado = new ArrayList<>();
        for (CitaMedica c: citas){
            if(c.getNombrePaciente().equalsIgnoreCase(nombrePaciente)){
                resultado.add(c);
            }
        }
        return resultado;
    }
    public List<CitaMedica> buscarDoctor(String nombreDoctor){
        List<CitaMedica> resultado = new ArrayList<>();
        for (CitaMedica c: citas){
            if(c.getNombreDoctor().equalsIgnoreCase(nombreDoctor)){
                resultado.add(c);
            }
        }
        return resultado;
    }*/
}
