package concurrentetpo;

public class Main {

    public static void main(String[] args) {

        JugadorRol JugadorX = new JugadorRol();
        

        Curandero cur = new Curandero();
        Orco orc = new Orco();

        cur.setJugador(JugadorX);
        orc.setJugador(JugadorX);

        Thread Curandero = new Thread(cur,"Curandero");
        Thread Orco = new Thread(orc, "Orco");
        Orco.start();
        Curandero.start();        
    }    
}
