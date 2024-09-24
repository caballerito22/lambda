import java.util.ArrayList;

class Estudiante {
    public String nombre;
    public int nota;
    public Estudiante(String nombre, int nota) {
        this.nombre = nombre;
        this.nota = nota;
    }
}

public class Main {
    public static void main(String[] args) {
        ArrayList<Estudiante> estudiantes = new ArrayList<>();
        Estudiante e1 = new Estudiante("Jose", 20);
        Estudiante e2 = new Estudiante("Maria", 21);
        estudiantes.add(e1);
        estudiantes.add(e2);

    }
}