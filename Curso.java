public class Curso {
    //atributos
    public String nombreC;
    public int creditos;
    private Estudiante estudiante;
    private Profesor profesor;

    //constructor
    public Curso(String nombreC, int creditos, Estudiante estudiante, Profesor profesor){
        this.nombreC = nombreC;
        this.creditos = creditos;
        this.estudiante = estudiante;
        this.profesor = profesor;
    }

    //metodos
    public void mostrarC(){
        System.out.println("Curso: "+nombreC);
        System.out.println("Creditos: "+creditos);
        System.out.println("---------------------------------------------------------");
        estudiante.mostrarE();
        profesor.mostrarP();

    }
}
