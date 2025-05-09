public class CitaMedica{

    private String nombrePaciente;
    private String nombreDoctor;
    private String especialidad;
    private String fecha;
    private String horario;

    //Patron creacional -builder

    public CitaMedica(){
    }

    void setNombrePaciente (String nombrePaciente){
        this.nombrePaciente = nombrePaciente;
    }

    void setNombreDoctor (String nombreDoctor){
        this.nombreDoctor = nombreDoctor;
    }
    void setEspecialidad (String especialidad){
        this.especialidad = especialidad;
    }
    void setFecha (String fecha){
        this.fecha = fecha;
    }
    void setHorario (String horario){
        this.horario = horario;
    }

    //getters
    public String getNombrePaciente(){
        return nombrePaciente;
    }
    public String getNombreDoctor(){
        return nombreDoctor;
    }
    public String getEspecialidad(){
        return especialidad;
    }
    public String getFecha(){
        return fecha;
    }
    public String getHorario(){
        return horario;
    }

    public void mostrar(){
        System.out.println("Paciente: "+nombrePaciente);
        System.out.println("Doctor: "+nombreDoctor);
        System.out.println("Especialidad: "+especialidad);
        System.out.println("Fecha: "+fecha);
        System.out.println("Horario: " +horario);
    }



}
