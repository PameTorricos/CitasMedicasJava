import java.util.List;
//Interfaz patron estructural - Data Access Object
public interface CitaMedicaDao {
    void guardar (CitaMedica cita);
    void borrar (CitaMedica cita);
    List<CitaMedica> listar();
    /*List<CitaMedica> buscarPaciente(String nombrePaciente);
    List<CitaMedica> buscarDoctor(String nombreDoctor);*/
}
