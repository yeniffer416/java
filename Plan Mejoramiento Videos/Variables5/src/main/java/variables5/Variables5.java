

package variables5;

/**
 *
 * @author SENA
 */
public class Variables5 {

    public static void main(String[] args) {
        
        String saludo = "¡Hola mundo ya soy programador Java!";
        int longitud = saludo.length();
        char myChar = saludo.charAt(2);
        boolean stringVacio = saludo.isEmpty();
        boolean containsString = saludo.contains("prog");
        String substring = saludo.substring(2, 7);
        String newString = saludo.replace( "o", "5");
        System.out.println(saludo + longitud + " " + myChar + " " + substring + " " + newString);
        
        
    }
}
