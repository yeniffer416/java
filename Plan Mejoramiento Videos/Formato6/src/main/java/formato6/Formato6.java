

package formato6;

/**
 *
 * @author SENA
 */
public class Formato6 {

    public static void main(String[] args) {
        int edad = 25;
        float altura = 1.70f;
        double valorDepi = 3.141597465837463512;
        long distanciaAlSol = 47628376481726846L;
        boolean isDay = false;
        char miInicial = 'g';
        
        System.out.println(String.format("mi edad es %d %d", edad, distanciaAlSol));
        System.out.println("mi altura es " + altura);
        System.out.println(String.format("Mi altura es %.15f", valorDepi));
        
        
    }
}
