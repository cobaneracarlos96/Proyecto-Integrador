package clase.cuatro.negocio;


public class Desarrollador extends Empleado {
    private String senority;
    
    public Desarrollador (String senority,String legajo,String nombre,String dni,
            String apellido,int edad){
        super(legajo,nombre,apellido,dni,edad);
        this.senority=senority;
    }
   
    public String getSeniority() {
        return senority;
    }

    public void setSeniority(String seniority) {
        this.senority = seniority;
    }
    
    public void programar(){
        System.out.println("Programo como un Campeon");
        
    }
    
    public void trabajar(){
        System.out.println("Estoy Programando ");
    }
}


