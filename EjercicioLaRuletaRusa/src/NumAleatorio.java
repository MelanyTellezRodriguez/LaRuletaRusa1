public class NumAleatorio {
    
    public static int generaNumAleatorio(int minimo,int maximo){
        int num = (int) Math.floor(Math.random() *(maximo-minimo +1) + (minimo));
        return num;
    }   
    
}
