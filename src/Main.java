import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Estudiante estudiante1 = new Estudiante();

        estudiante1.ingresarDatosEstudiante();
        estudiante1.ingresarMateria(1);
        estudiante1.ingresarMateria(2);
        estudiante1.ingresarMateria(3);
        estudiante1.imprimirDatosEstudiante();
        estudiante1.imprimirMaterias();
    }
}