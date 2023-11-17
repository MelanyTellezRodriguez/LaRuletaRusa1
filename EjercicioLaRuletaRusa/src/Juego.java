public class Juego {
    private Jugador[]jugadores;
    private Revolver revolver;
    
    
    
    
    public Juego(int numJugadores){
        
        if(numJugadores >= 1 && numJugadores <= 6 ){
            System.out.println("");
          
        }else{
            numJugadores = 6;
        }
        
        jugadores = new Jugador[numJugadores];
        crearJugadores();
        revolver = new Revolver();
        
    }
    
    private void crearJugadores(){
     for(int i = 0; i<jugadores.length; i++){
            jugadores[i] = new Jugador(i+1); 
        }   
    }
    
//    public void CrearJugadores(){
//        for(int i = 0; i <Jugadores.length; i++){
//            Jugadores[i] = new Jugador(i+1);
//        }
//    }
    
    public boolean FinDelJuego(){
        for(int i = 0; i<jugadores.length; i++){
            //Si jugador no esta vivo
            if(!jugadores[i].isVivo()){
                return true;
                
             
            
            }
           
        }
     
      return false;
    }
    
    public void Ronda(){
        for(int i = 0; i<jugadores.length; i++){
            jugadores[i].disparar(revolver);
        }
        
    }


}
