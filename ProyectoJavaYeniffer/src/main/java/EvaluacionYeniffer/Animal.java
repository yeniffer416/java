
package EvaluacionYeniffer;

/**
 *
 * @author Yeniffer Andrea Espinosa Diaz
 */
public abstract class Animal {
    
    public abstract void mamiferos ();
    
    private String comida;
    private int años;

    public Animal(String comida, int años) {
        this.comida = comida;
        this.años = años;
    }

    public String getComida() {
        return comida;
    }

    public int getAños() {
        return años;
    }
    
    
}
