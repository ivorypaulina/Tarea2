public class Profesor {
    //Atributos
    public String nombreP;
    public String materia;
    private int edad;
    private double sueldo;

    //constructor
    public Profesor(String nombreP, String materia, int edad, double sueldo){
        this.nombreP = nombreP;
        this.materia = materia;
        this.edad = edad;
        this.sueldo = sueldo;
    }

    //metodos
    public void mostrarP(){
        System.out.println("Docente: "+ nombreP);
        System.out.println("Materia asignada: "+materia);
        System.out.println("Edad: "+edad);
        System.out.println("Sueldo: "+sueldo);
        System.out.println("---------------------------------------------------------");
    }

}
