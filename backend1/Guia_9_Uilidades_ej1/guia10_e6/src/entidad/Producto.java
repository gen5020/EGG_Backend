/*

 */
package entidad;

import java.util.HashMap;

/**
 *
 * @author User
 */
public class Producto {
   private HashMap <String,Double> prod=new HashMap();

    public Producto() {
    }

    public HashMap<String, Double> getProd() {
        return prod;
    }

    public void setProd(HashMap<String, Double> prod) {
        this.prod = prod;
    }

    @Override
    public String toString() {
        return "Productos=" + prod;
    }
   
    
}
