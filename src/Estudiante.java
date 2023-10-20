import java.util.Scanner;

public class Estudiante {
    private String nombre="";
    private int matricula=0;
    private String cedula="";
    private Materia materia1;
    private Materia materia2;
    private Materia materia3;

    public Estudiante(){

    }
    public Estudiante(String nombre, int matricula, String cedula, Materia materia1, Materia materia2, Materia materia3) {
        this.nombre = nombre;
        this.matricula = matricula;
        this.cedula = cedula;
        this.materia1 = materia1;
        this.materia2 = materia2;
        this.materia3 = materia3;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Materia getMateria1() {
        return materia1;
    }

    public void setMateria1(Materia materia1) {
        this.materia1 = materia1;
    }

    public Materia getMateria2() {
        return materia2;
    }

    public void setMateria2(Materia materia2) {
        this.materia2 = materia2;
    }

    public Materia getMateria3() {
        return materia3;
    }

    public void setMateria3(Materia materia3) {
        this.materia3 = materia3;
    }
    public void ingresarDatosEstudiante(){
        Scanner sc =new Scanner(System.in);
        System.out.println("Ingrese el nombre del estudiante: ");
        String nombre = sc.next();
        System.out.println("Ingrese el numero de matricula: ");
        int matricula = sc.nextInt();
        System.out.println("Ingrese la cedula del estudiante: ");
        String cedula = sc.next();
        System.out.println("\n");
    }

    public void imprimirDatosEstudiante(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Matricula: "+matricula);
        System.out.println("Cedula: "+cedula);
    }

    public void ingresarMateria(int i){
        if(i==1){
            materia1=new Materia();
            materia1.ingresarDatosMateria(i);
            materia1.ingresarProfesor(1);
        }else if(i==2){
            materia2=new Materia();
            materia2.ingresarDatosMateria(i);
            materia2.ingresarProfesor(2);
        }else {
            materia3=new Materia();
            materia3.ingresarDatosMateria(i);
            materia3.ingresarProfesor(3);
        }
    }

    public void imprimirMaterias(){
        System.out.println("Materia 1:");
        materia1.imprimirDatosMateria();
        materia1.imprimirProfesor(1);
        System.out.println("Materia 2:");
        materia2.imprimirDatosMateria();
        materia2.imprimirProfesor(2);
        System.out.println("Materia 3:");
        materia3.imprimirDatosMateria();
        materia3.imprimirProfesor(3);
    }
}