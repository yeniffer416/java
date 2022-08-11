
package EvaluacionYeniffer;


        

public class Caballo  extends Animal{
    private String nombre;

    public Caballo(String nombre, String comida, int años) {
        super(comida, años);
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    @Override
    public void mamiferos() {
        System.out.println("\ncomida : "+getComida()+"\naños: "+getAños()+"\nnombre: "+getNombre());
    }

   
    
   
    
    
    
}
