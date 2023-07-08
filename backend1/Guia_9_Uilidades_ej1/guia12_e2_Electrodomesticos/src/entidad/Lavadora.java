/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

/**
 *
 * @author User
 */
public class Lavadora extends Electrodomestico {
    private Double carga;

    public Lavadora() {
    }

    public Lavadora(Double carga) {
        this.carga = carga;
    }

    public Lavadora(Double carga, Integer precio, String color, Character consumo, Double peso) {
        super(precio, color, consumo, peso);
        this.carga = carga;
    }

    
    @Override
    public String toString() {
        return "Lavadora{" + "carga=" + carga + '}';
    }
    
    public Lavadora crearLavadora(){
       super.crearElectrodomestico();
        System.out.print("Carga: ");
       carga=leer.nextDouble();
       
       Lavadora l =new Lavadora(carga,precio, color, consumo, peso);
//       precioFinal();
       return l;
    }
    @Override
    public void precioFinal(){
//        System.out.println("Antes "+precio);
//        
super.precioFinal();
//   System.out.println("super"+super.precio);
        if(carga>30){
          precio=super.precio+500;
        }
//        System.out.println("precio final"+ precio);
    }
    
    
    public void mostrar(){
        System.out.println("Precio: "+precio+" Color: "+color+" Peso: "+ peso+" Consumo Energetico: "+consumo+" carga: "+carga);
    }
    
}
