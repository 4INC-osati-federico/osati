package PompaCarburante;

/**
 *
 * @author feder
 */
public class PompaCarburanteTest {

    public static void main(String[] args) {
        PompaCarburante p = new PompaCarburante("Fede", 1.1,
                10, 5.5);
        double dimSerbatoio = 5.0;
        System.out.println(p.stampa());
        
        System.out.println(p.prezzoCarbRimasto());
        System.out.println(p.carburanteRimasto()); 
        System.out.println(p.riempimentoCisterna());
        System.out.println(p.prezzoPieno());
        
    }
    
}
