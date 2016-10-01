
import clase.cuatro.negocio.Persona;
import clase.cuatro.negocio.Desarrollador;
import clase.cuatro.negocio.Empleado;


// clase final : NO se puede heredar 

public class Clase3 {

  
    public static void main(String[] args) {
        
        Persona p =new Persona ("MARCELO","PEREZ","XXXXX",2);
       // Empleado e = new Empleado("l","b","b","2",2);  // al ser abstracta no puedo poner new empleado
        Persona d = new Desarrollador("a","b","c","c","3",4);
        
        p.programar();
        d.programar();
        hacerProgramar(p);
        hacerProgramar(d);
         
    }
    private static void hacerProgramar(Persona p) {
        p.programar();
        
    }
    // metodo final no se puedo volver a sobreescribir
    public final void progama(){
        
    }
       
    
}
