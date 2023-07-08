package entidades;

import java.util.ArrayList;


public class Asiento {
    
    
    private Integer num;
    private String letra;
    private String ocupado;
    

    public Asiento() {
    }

    public Asiento(Integer num, String letra, String ocupado) {
        this.num = num;
        this.letra = letra;
        this.ocupado = ocupado;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public String getOcupado() {
        return ocupado;
    }

    public void setOcupado(String ocupado) {
        this.ocupado = ocupado;
    }

    @Override
    public String toString() {
        return num + letra  + ocupado ;
    }

   

}
