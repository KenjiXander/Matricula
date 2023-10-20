import java.util.Scanner;

public class Profesor {
    private String nombre="";
    private String cedula="";
    private int codigo=0;

    public Profesor(){

    }
    public Profesor(String nombre, String cedula, int codigo) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void ingresarDatosProfesor(int i){
        Scanner sc =new Scanner(System.in);
        System.out.println("Ingrese el nombre del/a profesor/a "+i);
        this.nombre = sc.next();
        System.out.println("Ingrese el codigo del/a profesor/a "+i);
        this.codigo = sc.nextInt();
        System.out.println("Ingrese la cedula del/a profesor/a "+i);
        this.cedula = sc.next();
        System.out.println("\n");
    }

    public void imprimirDatosProfesor(){
        System.out.println("Profesor: "+nombre);
        System.out.println("Codigo: "+codigo);
        System.out.println("Cedula: "+cedula);
        System.out.println("\n");
    }
}