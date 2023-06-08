package org.learning.java;

public class RegnoAnimale {
    public static void main(String[] args) {
        // Classe principale per eseguire il programma
        Cane cane = new Cane();
        Passerotto passerotto = new Passerotto();
        Aquila aquila = new Aquila();
        Delfino delfino = new Delfino();

        // Utilizzo metodi implementati

        // Cane
        cane.mangia();
        cane.verso();
        cane.dormi();

        // Passerotto
        passerotto.mangia();
        passerotto.verso();
        passerotto.dormi();

        // Aquila
        aquila.mangia();
        aquila.verso();
        aquila.dormi();

        // Delfino
        delfino.mangia();
        delfino.verso();
        delfino.dormi();
    }
}
