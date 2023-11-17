public class Revolver {

    private static int posicionActual;
    private static int posicionBala;
    

    
    public Revolver(){
        posicionActual = NumAleatorio.generaNumAleatorio(1,6);
        posicionBala =  NumAleatorio.generaNumAleatorio(1,6);
        
    }
    
    //metodos
    public boolean disparar(){
        boolean suerte = false;
        if(posicionActual == posicionBala){
            suerte = true;
        }
        siguienteBala();
        return suerte;
    }
        
        
        
    public static void siguienteBala(){
        if(posicionBala == 6){
            posicionBala = 1; 

        }else{
            posicionBala++;

        }
      
 
    }
    
    public static String mostrar(){ 
        
       return("La posicion actual del revolver es: " + posicionActual + "La posicion de la bala es: " + posicionBala);
     
    }

    
            
    
}
