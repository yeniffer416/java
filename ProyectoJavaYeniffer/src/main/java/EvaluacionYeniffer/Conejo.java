

package EvaluacionYeniffer;

/**
 *
 * @author Yeniffer Andrea Espinosa Diaz
 * fecha 10/08/2022
 */
public class Conejo extends Animal {
    
    private String raza;
    private String color;

    public Conejo(String raza, String color, String comida, int años) {
        super(comida, años);
        this.raza = raza;
        this.color = color;
    }

    public String getRaza() {
        return raza;
    }

    public String getColor() {
        return color;
    }

    @Override
    public void mamiferos() {
        System.out.println("\ncomida : "+getComida()+"\naños: "+getAños()+"\nraza: "+getRaza()+"\ncolor:"+getColor());
    }
    
    
}
