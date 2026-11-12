import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ControlTutor {
    private static final String FORMATO_FILA = "%-12s | %-20s | %-10s%n";
    private List<Alumno> listaTutorados = new LinkedList<>();

    public ControlTutor(){
        cargarAlumnosIniciales();
    }

    private void cargarAlumnosIniciales(){
        registrarAlumno("Josue", 253343, "inactivo");
        registrarAlumno("Alex", 251234, "inscrito");
        registrarAlumno("Manuel", 251343, "inactivo");
        registrarAlumno("Pedro", 251343, "inactivo");
        registrarAlumno("Ricardo", 251234, "inactivo"); // no se registra en la LISTA
    }

    private boolean existeMatricula(int matricula){
        for(Alumno alumno : listaTutorados){
            if(alumno.getMatricula() == matricula){
                return true;
            }
        }
        return false;
    }

    public boolean registrarAlumno(String nombre, int matricula, String estatus){
        if(existeMatricula( matricula )){
            return false;
        }
        listaTutorados.add(new Alumno(nombre, matricula, estatus)); //crea objeto
        return true;
    }

    public void mostrarTodos(){
        //ordena por matricula
        Collections.sort(listaTutorados);
        //imprimir la lista completa
        System.out.printf(FORMATO_FILA, "Nombre", "Matricula", "Estatus");

        for(Alumno alumno:listaTutorados){
            System.out.printf(FORMATO_FILA, alumno.getNombre(), alumno.getMatricula(), alumno.getEstatus());
        }
    }

    public void mostrarPorEstatus(String estatusBuscado){ //inactivo
        Collections.sort(listaTutorados);
        //imprimir lista por estatus
        System.out.printf(FORMATO_FILA, "Nombre", "Matricula", "Estatus");

        for(Alumno alumno:listaTutorados){
            //alumno= inactivo
            if(alumno.getEstatus().equals(estatusBuscado)){
                System.out.printf(FORMATO_FILA, alumno.getNombre(), alumno.getMatricula(), alumno.getEstatus());
            }
        }
    }
}
