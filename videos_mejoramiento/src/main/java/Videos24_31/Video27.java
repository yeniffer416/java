
package Videos24_31;

//Con el video anterior ahora este vamos a utilizar metodo constructor

import java.util.Random;

//La clase se llama movieDeVideo25

public class Video27 {
    
    public static void main(String[] args) {
        //llamar a la clase 
        //aca se esta utilizando el metodo constructor
        movieDeVideo25 ToStory = new movieDeVideo25(" To Story"," Familiar",90);
         
         System.out.println(ToStory.getTitulo()+" "+ ToStory.getGenero() );
    }    
    public static String play(String[] tituloArray, int index){
        if (index < tituloArray.length ) { 
            String titulo = tituloArray [index];
            
            for (int i = 0; i < 10; i++){
                System.out.println("Rodando la pelicula"+titulo);
            }
            return titulo;
        }else{
            System.out.println("indice muy grande");
            return "";
        }
    }
    //metodo sobre cargado
    public static String play(String[] tituloArray) {
     Random random = new Random();
     int index = random.nextInt(tituloArray.length - 1);
     
     String titulo = tituloArray [index];
           
        for (int i = 0; i < 10; i++){
            System.out.println("Rodando la pelicula"+titulo);    
        }
        return titulo;    
    }
    
    public static void pausa(String titulo) {
        if (titulo.isEmpty()){
            System.out.println("Pelicula no reproduce");
        }else{
            System.out.println("Pelicula pausada"+titulo);
        } 
    }
    
}
