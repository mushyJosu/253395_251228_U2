public class Alumno implements Comparable<Alumno>{
    private String nombre;
    private int matricula;
    private String estatus;

    public Alumno(String nombre, int matricula, String estatus) {
        this.nombre = nombre;
        this.matricula = matricula;
        this.estatus = estatus;
    }

    @Override
    public int compareTo(Alumno otroAlumno) {
        return Integer.compare(this.matricula, otroAlumno.matricula);
    }

    public int getMatricula() {
        return matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEstatus() {
        return estatus;
    }
}
