package sumarecursiva;

/**
 *
 * @author lexna
 */
public class SumaRecursiva {
    
    
    // Metodo recursivo
    public static int sumarHasta(int n) {
        if (n <= 0) {
            return 0;
        }
        return n + sumarHasta(n-1);
    }
    
    
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int n1 = 5;
        System.out.println("Suma hasta " + n1 + " = " + sumarHasta(n1));
        
        int n2 = 8;
        System.out.println("Suma hasta " + n2 + " = " + sumarHasta(n2));
    }
    
}
