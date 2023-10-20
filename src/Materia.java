import java.util.Scanner;

public class Materia {
    private String nombre="";
    private int codigo=0;
    private int horas=0;
    private Profesor profesor1;
    private Profesor profesor2;
    private Profesor profesor3;

    public Materia(){

    }

    public Materia(String nombre, int codigo, int horas, Profesor profesor1, Profesor profesor2, Profesor profesor3) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.horas = horas;
        this.profesor1 = profesor1;
        this.profesor2 = profesor2;
        this.profesor3 = profesor3;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public Profesor getProfesor1() {
        return profesor1;
    }

    public void setProfesor1(Profesor profesor1) {
        this.profesor1 = profesor1;
    }

    public Profesor getProfesor2() {
        return profesor2;
    }

    public void setProfesor2(Profesor profesor2) {
        this.profesor2 = profesor2;
    }

    public Profesor getProfesor3() {
        return profesor3;
    }

    public void setProfesor3(Profesor profesor3) {
        this.profesor3 = profesor3;
    }

    public void ingresarDatosMateria(int i){
        Scanner sc =new Scanner(System.in);
        System.out.println("Ingrese el nombre de la materia "+i);
        this.nombre=sc.next();
        System.out.println("Ingrese el codigo de la materia "+i);
        this.codigo=sc.nextInt();
        System.out.println("Ingrese las horas semanales de la materia "+i);
        this.horas=sc.nextInt();
        System.out.println("\n");
    }
    public void ingresarProfesor(int i){
        if(i==1){
            profesor1=new Profesor();
            profesor1.ingresarDatosProfesor(i);
        }else if(i==2){
            profesor2=new Profesor();
            profesor2.ingresarDatosProfesor(i);
        }else {
            profesor3=new Profesor();
            profesor3.ingresarDatosProfesor(i);
        }
    }

    public void imprimirDatosMateria(){
        System.out.println("Materia: "+nombre);
        System.out.println("Codigo: "+codigo);
        System.out.println("Horas semanales: "+horas);
    }

    public void imprimirProfesor(int i){
        if(i==1){
            profesor1.imprimirDatosProfesor();
        }else if(i==2){
            profesor2.imprimirDatosProfesor();
        }else{
            profesor3.imprimirDatosProfesor();
        }
    }

}