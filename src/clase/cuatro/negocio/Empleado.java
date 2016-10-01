package clase.cuatro.negocio;


public abstract class  Empleado extends Persona{
    public Empleado(String legajo,String nombre,String apellido, String dni,
            int edad){
        super(nombre,apellido,dni,edad); // super invoca metodos de superclases
        this.legajo=legajo;
    }
    
    public String getLegajo() {
        return legajo;
    }

    public void setLegajo(String legajo) {
        this.legajo = legajo;
    }
    private String legajo;
    
    public abstract void trabajar();

    @Override
    public String toString() {
        return "Empleado{" + "legajo=" + legajo + '}';
    }
    
    public final int SUELDO_MAXIMO=30000;
    
    
}
    
   
       
    

