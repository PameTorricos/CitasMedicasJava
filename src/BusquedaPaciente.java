import java.util.ArrayList;
import java.util.List;
// Patrón de comportamiento - Strategy
public class BusquedaPaciente implements BusquedaCitas{
    private String nombrePaciente;

    public BusquedaPaciente (String nombrePaciente){
        this.nombrePaciente = nombrePaciente;
    }

    @Override
    public List<CitaMedica> buscar(List<CitaMedica> cita) {
        List<CitaMedica> resultado = new ArrayList<>();
        for (CitaMedica c: cita){
            if (c.getNombrePaciente().equalsIgnoreCase(nombrePaciente)){
                resultado.add(c);
            }
        }
        return resultado;
    }
}
