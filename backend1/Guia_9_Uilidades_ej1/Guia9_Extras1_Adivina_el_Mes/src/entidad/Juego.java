/*
Crea una clase en Java donde declares una variable de tipo array de Strings que contenga los doce meses del año, en minúsculas. 
A continuación, declara una variable mesSecreto de tipo String, y hazla igual a un elemento del array (por ejemplo, mesSecreto = mes[9]. 
El programa debe pedir al usuario que adivine el mes secreto. Si el usuario acierta mostrar un mensaje, 
y si no lo hace, pedir que vuelva a intentar adivinar el mes secreto. 
 */
package entidad;

public class Juego {
    //atributos 
    private String[] meses;
    private String mesSecreto;
    private String adivina;

    public String getAdivina() {
        return adivina;
    }

    public void setAdivina(String adivina) {
        this.adivina = adivina;
    }

    public Juego() {
    }

    public String[] getMeses() {
        return meses;
    }

    public void setMeses(String[] meses) {
        this.meses = meses;
    }

    public String getMesSecreto() {
        return mesSecreto;
    }

    public void setMesSecreto(String mesSecreto) {
        this.mesSecreto = mesSecreto;
    }

    public Juego(String[] meses, String mesSecreto) {
        this.meses = meses;
        this.mesSecreto = mesSecreto;
    }

    @Override
    public String toString() {
        return "Juego{" + "meses=" + meses + ", mesSecreto=" + mesSecreto + ", adivina=" + adivina + '}';
    }


 
    
    
}
