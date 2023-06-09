package org.learning.java;

public class RegnoAnimale {
    public static void main(String[] args) {
        // Classe principale per eseguire il programma
        Cane cane = new Cane();
        Passerotto passerotto = new Passerotto();
        Aquila aquila = new Aquila();
        Delfino delfino = new Delfino();

        // Array di animali
        AbstractAnimale[] animali = {cane, passerotto, aquila, delfino};

        // Ciclo gli animali dell'array
        for (AbstractAnimale animale : animali) {
            if (animale instanceof IVolante) {
                faiVolare((IVolante) animale);
            } else if (animale instanceof INuotante) {
                faiNuotare((INuotante) animale);
            }
        }
/*
        // IChiamate metodi interfacce
        faiVolare((IVolante) passerotto);
        faiNuotare((INuotante) delfino);

        // Utilizzo metodi implementati
*/
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

    // Metodo faiVolare per implementare interfaccia
    public static void faiVolare(IVolante animale) {
        animale.vola();
    }

    // Metodo faiNuotare per implementare interfaccia
    public static void faiNuotare(INuotante animale) {
        animale.nuota();
    }
}
