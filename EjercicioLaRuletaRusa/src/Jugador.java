public class Jugador {

    private int idNumJugador;
    private String nombre;
    private boolean vivo;

    //metodoConstructor 

    public Jugador(int idNumJugador) {
        this.idNumJugador = idNumJugador;
        this.vivo = true;
        this.nombre = "Jugador" +idNumJugador;
        
        
    }

    
    
    public void disparar(Revolver r){
      
        if(r.disparar()){
        
           
             System.out.println("El " +nombre + "Se esta apuntando con la pistola!! *Suerte*" );
           
            this.vivo = false;
            System.out.println("El " + nombre +  "Ha muerto!!!");
         
        }else{
            System.out.println( nombre  + "**Te has librado**"); 
            
        }
        
    }

       
            

        
        
     //aqui deberian ir los metodos seter y geters

    public int getIdNumJugador() {
        return idNumJugador;
    }

    public void setIdNumJugador(int idNumJugador) {
        this.idNumJugador = idNumJugador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isVivo() {
        return vivo;
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }
    
    
}
