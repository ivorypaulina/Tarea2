public class Estudiante {
    //Atributos
    public String nombre;
    public String apellido;
    private int edad;
    private double nota1;
    private double nota2;

    //constructor
    public Estudiante(String nombre, String apellido, int edad, double nota1, double nota2){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    //metodos
    public double promedio(){
        return(nota1+nota2)/2;
    }

    public void mostrarE(){
        System.out.println("Estudiante: "+nombre+""+apellido);
        System.out.println("Edad: "+edad);
        System.out.println("Promedio: "+ promedio());
        System.out.println("---------------------------------------------------------");
    }

}
