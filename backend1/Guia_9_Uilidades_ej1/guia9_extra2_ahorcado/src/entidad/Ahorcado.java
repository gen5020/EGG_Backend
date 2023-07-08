/*
Juego Ahorcado: Crear una clase Ahorcado (como el juego), la cual deberá contener como atributos, 
un vector con la palabra a buscar, la cantidad de letras encontradas y la cantidad jugadas máximas 
que puede realizar el usuario. 
 */
package entidad;

public class Ahorcado {
    //atributos
    private char[] palabraBusc;
    private int letras_encontradas;
    private int jugadasMax;
    private char[] mostrarPal;

    public Ahorcado(char[] palabraBusc, int letras_encontradas, int jugadasMax, char[] mostrarPal) {
        this.palabraBusc = palabraBusc;
        this.letras_encontradas = letras_encontradas;
        this.jugadasMax = jugadasMax;
        this.mostrarPal = mostrarPal;
    }

    public Ahorcado() {
    }

    public char[] getMostrarPal() {
        return mostrarPal;
    }

    public void setMostrarPal(char[] mostrarPal) {
        this.mostrarPal = mostrarPal;
    }

   

    public char[] getPalabraBusc() {
        return palabraBusc;
    }

    public void setPalabraBusc(char[] palabraBusc) {
        this.palabraBusc = palabraBusc;
    }

    public int getLetras_encontradas() {
        return letras_encontradas;
    }

    public void setLetras_encontradas(int letras_encontradas) {
        this.letras_encontradas = letras_encontradas;
    }

    public int getJugadasMax() {
        return jugadasMax;
    }

    public void setJugadasMax(int jugadasMax) {
        this.jugadasMax = jugadasMax;
    }

}