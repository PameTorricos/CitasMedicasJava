import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        CitaMedicaDao medicaDao = new CitaMedicaDaoMemoria();
        Buscador buscador = new Buscador();

        Map<String, List<String>> especialidades = new HashMap<>();
        especialidades.put("1", Arrays.asList("Cardiología", "Dra. Olivares", "Dr. Perez"));
        especialidades.put("2", Arrays.asList("Ginecología", "Dra. Mamani", "Dra. Campos"));
        especialidades.put("3", Arrays.asList("Neurología", "Dr. Sheperd", "Dr. Koracick"));

        boolean salir = false;

        while (!salir){
            System.out.println("--Menú Principal--");
            System.out.println("1. Registrar nueva cita");
            System.out.println("2. Buscar paciente");
            System.out.println("3. Buscar doctor");
            System.out.println("4. Mostrar citas");
            System.out.println("5. Salir");
            System.out.println("Elija una opción: ");
            String opcion = entrada.nextLine();

            switch (opcion){
                //Registrar nueva cita
                case "1":
                    System.out.println("Ingrese su nombre: ");
                    String nombrePaciente = entrada.nextLine();

                    System.out.println("Elija especialidad: ");
                    System.out.println("1. Cardiología");
                    System.out.println("2. Ginecología");
                    System.out.println("3. Neurología");
                    System.out.println("Opción: ");
                    String opcionEspecialidad = entrada.nextLine();

                    if ((!especialidades.containsKey(opcionEspecialidad))){
                        System.out.println("Especialidad no válida");
                        break;
                    }

                    List<String> datos = especialidades.get(opcionEspecialidad);
                    String especialidad = datos.get(0);
                    String doctor1 = datos.get(1);
                    String doctor2 = datos.get(2);

                    System.out.println("Doctores disponibles: ");
                    System.out.println("1. "+doctor1);
                    System.out.println("2. "+doctor2);
                    System.out.println("Elija un doctor: ");
                    String opcionDoctor = entrada.nextLine();

                    String doctorElegido;
                    if(opcionDoctor.equals("1")){
                        doctorElegido=doctor1;
                    }else if (opcionDoctor.equals("2")){
                        doctorElegido = doctor2;
                    }else {
                        System.out.println("Opción no válida");
                        break;
                    }

                    String fecha = "2025-06-17";
                    String horario = "14:00";

                    CitaMedica cita = new CitaMedicaBuilder()
                            .setnombrePaciente(nombrePaciente)
                            .setNombreDoctor(doctorElegido)
                            .setEspecialidad(especialidad)
                            .setFecha(fecha)
                            .setHorario(horario)
                            .build();

                    medicaDao.guardar(cita);
                    System.out.println("Cita registrada");
                    cita.mostrar();
                    break;
                //Buscar paciente
                case "2":
                    System.out.println("Ingrese el nombre del paciente a buscar: ");
                    String pacienteBusqueda = entrada.nextLine();
                    buscador.setEstrategia(new BusquedaPaciente(pacienteBusqueda));
                    List<CitaMedica> citasPorPaciente = buscador.buscar(medicaDao.listar());

                    if(citasPorPaciente.isEmpty()){
                        System.out.println("No se encontraron citas para ese paciente");
                    }else {
                        System.out.println("Citas encontradas");
                        for (CitaMedica c: citasPorPaciente){
                            c.mostrar();
                            System.out.println("_______________");
                        }
                    }
                    break;

                //Buscar doctor
                case "3":
                    System.out.println("Ingrese el nombre del Doctor a buscar: ");
                    String doctorBuscar = entrada.nextLine();

                    buscador.setEstrategia(new BusquedaDoctor(doctorBuscar));
                    List<CitaMedica> citasPorDoctor = buscador.buscar(medicaDao.listar());

                    if (citasPorDoctor.isEmpty()){
                        System.out.println("No se encontraron citas para ese Doctor");
                    }else {
                        System.out.println("Citas encontradas");
                        for (CitaMedica e: citasPorDoctor){
                            e.mostrar();
                            System.out.println("___________________");
                        }
                    }
                    break;
                //Mostrar citas
                case "4":
                    List<CitaMedica> todas = medicaDao.listar();
                    if (todas.isEmpty()){
                        System.out.println("No hay citas registradas");
                    }else {
                        System.out.println("Todas las citas registradas");
                        for (CitaMedica c:todas){
                            c.mostrar();
                            System.out.println("______________");
                        }
                    }
                    break;

                //Salir
                case "5":
                    salir = true;
                    System.out.println("Sistema cerrado");
                    break;

                default:
                    System.out.println("Opción Inválida. Intente de nuevo");
            }
        }
        entrada.close();
    }
}