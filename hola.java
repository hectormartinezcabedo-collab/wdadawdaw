public class hola {

    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan", 30);
        persona1.saludar();
    }
}
class Persona{
    String nombre;
    int edad;

    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public void saludar(){
        System.out.println("Hola, mi nombre es " + nombre + " y tengo " + edad + " años.");
    }
}

class Alumno{
    String nombre;
    int edad;

    public Alumno(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public void saludar(){
        System.out.println("Hola, mi nombre es " + nombre + " y tengo " + edad + " años.");
    }
}
