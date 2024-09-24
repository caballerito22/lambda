import java.util.ArrayList;

class Estudiante {
    public String nombre;
    public int nota;

    public Estudiante(String nombre, int nota) {
        this.nombre = nombre;
        this.nota = nota;


    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", nota=" + nota +
                '}';
    }
}

interface Filtro{
    boolean filtrar(Estudiante est);
}

class MostradorDeAlumnos{
    void mostrar(ArrayList<Estudiante> alumno,Filtro filtro){
        for(var est : alumno){
            if(filtro.filtrar(est)){
                System.out.println(est + " ");
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        ArrayList<Estudiante> estudiantes = new ArrayList<>();
        Estudiante e1 = new Estudiante("Jose", 20);
        Estudiante e2 = new Estudiante("Maria", 21);
        Estudiante e3 = new Estudiante("clara", 4);
        Estudiante e4 = new Estudiante("claudia", 8);
        estudiantes.add(e1);
        estudiantes.add(e2);
        estudiantes.add(e3);
        estudiantes.add(e4);

        MostradorDeAlumnos mostrador_alu = new MostradorDeAlumnos();

        mostrador_alu.mostrar(estudiantes,est -> est.nota >= 5 );

        System.out.println();

        mostrador_alu.mostrar(estudiantes, new Filtro() {
            @Override
            public boolean filtrar(Estudiante est) {
                return estudiantes.contains("c");
            }
        });

        System.out.println();

        mostrador_alu.mostrar(estudiantes, estudi -> estudi.nombre.length() > 5);

        System.out.println();

        mostrador_alu.mostrar(estudiantes, n -> true);


    }
}