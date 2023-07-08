/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Electrodomestico {
    Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");   
    protected Integer precio;
    protected String color;
    protected Character consumo;
    protected Double peso;
     
    public Electrodomestico() {
    }

    public Electrodomestico(Integer precio, String color, Character consumo, Double peso) {
        this.precio = precio;
        this.color = color;
        
        this.consumo = consumo;
        this.peso = peso;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Character getConsumo() {
        return consumo;
    }

    public void setConsumo(Character consumo) {
        this.consumo = consumo;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }
//    Método comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta,
//sino es correcta usara la letra F por defecto. Este método se debe invocar al crear el
//objeto y no será visible.
    protected void comprobarConsumo(){
//        if((consumo=='A' ||consumo=='B' || consumo=='C'|| consumo=='D'||)){
            if(!(consumo>='A' && consumo<='F'||consumo>='a' && consumo<='f')){
            consumo='F';
        }else {consumo=Character.toUpperCase(consumo);}
    }
    
//   Método comprobarColor(String color): comprueba que el color es correcto, y si no lo es,
//usa el color blanco por defecto. Los colores disponibles para los electrodomésticos son
//blanco, negro, rojo, azul y gris. No importa si el nombre está en mayúsculas o en
//minúsculas. Este método se invocará al crear el objeto y no será visible. 
    protected void comprobarColor(){
        String[] vectorColor= new String[]{"blanco","negro","rojo","azul","gris"};
        int cont=0;
        for (int i = 0; i < 5; i++) {
            if(!color.equalsIgnoreCase(vectorColor[i])){
            cont++;    
            }
        }
    
        if (cont==5){
        color="blanco";
    }
    }
    
//    Metodo crearElectrodomestico(): le pide la información al usuario y llena el
//electrodoméstico, también llama los métodos para comprobar el color y el consumo. Al
//precio se le da un valor base de $1000.
    public void crearElectrodomestico(){
        System.out.print("Color: ");
        color=leer.next();
        System.out.println("Consumo energético: ");
        consumo=leer.next().charAt(0);
        precio=1000;
        System.out.println("Peso: ");
        peso=leer.nextDouble();
        comprobarColor();
        comprobarConsumo();
//        precioFinal();
    }
    
//    Método precioFinal(): según el consumo energético y su tamaño, aumentará el valor del
//precio. Esta es la lista de precios:
    public void precioFinal(){
        switch (consumo) {
            case 'A':
                precio+=1000;
                
                break;
            case 'B':
                     precio+=800;
                     break;
                     case 'C':
                precio+=600;
                
                break;
            case 'D':
                     precio+=500;
                     break;
                     case 'E':
                precio+=300;
                
                break;
            case 'F':
                     precio+=100;
                     break;
           
        }
        
        if(peso>0 && peso<19){
            precio+=100;
        }else if(peso>19 && peso<=49){
            precio+=500;
        }else if(peso>=50 && peso<=79){
        precio+=800;
    }else if(peso>80){
        precio+=1000;}
    
    }
}
