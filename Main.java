public class Main {
    public static void main(String[] args){

        Estudiante estudiante1 = new Estudiante("Juan","Perez",25,6.5,9.2);
        Profesor profesor1 = new Profesor("Roberto Martinez", "Matemáticas", 68, 950.99);
        Curso curso1 = new Curso("Matemáticas",3,estudiante1,profesor1);

        curso1.mostrarC();
    }
}
