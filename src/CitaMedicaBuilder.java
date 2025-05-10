public class CitaMedicaBuilder {
    private String nombrePaciente;
    private String nombreDoctor;
    private String especialidad;
    private String fecha;
    private String horario;
    private String motivoConsulta;

    public CitaMedicaBuilder setnombrePaciente(String nombrePaciente){
        this.nombrePaciente = nombrePaciente;
        return this;
    }
    public CitaMedicaBuilder setNombreDoctor (String nombreDoctor){
        this.nombreDoctor = nombreDoctor;
        return this;
    }
    public CitaMedicaBuilder setEspecialidad (String especialidad){
        this.especialidad = especialidad;
        return this;
    }
    public CitaMedicaBuilder setFecha (String fecha){
        this.fecha = fecha;
        return this;
    }
    public  CitaMedicaBuilder setHorario (String horario){
        this.horario = horario;
        return this;
    }
    public CitaMedicaBuilder setMotivoConsulta(String motivoConsulta){
        this.motivoConsulta = motivoConsulta;
        return this;
    }
    //patron creacional - builder
    public CitaMedica build(){
        CitaMedica cita = new CitaMedica();
        cita.setNombrePaciente(nombrePaciente);
        cita.setNombreDoctor(nombreDoctor);
        cita.setEspecialidad(especialidad);
        cita.setFecha(fecha);
        cita.setHorario(horario);
        cita.setMotivoConsulta(motivoConsulta);
        return cita;
    }
}
