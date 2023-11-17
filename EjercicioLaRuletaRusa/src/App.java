public class App {
    public static void main(String[] args) throws Exception {

        Juego juego = new Juego(6);

        //mientras no termine el juego

        
        
        while(!juego.FinDelJuego()){
            juego.Ronda();
            
           

            
            
            
        }
        System.out.println("El juego ha acabado");
        
    
    }
}
