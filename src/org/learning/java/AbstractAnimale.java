package org.learning.java;

public abstract class AbstractAnimale {
    // Metodo astratto per cibo animale
    abstract void mangia();

    // Metodo asrtatto per verso animale
    abstract void verso();

    // Metodo sonno condiviso per tutti gli animali
    void dormi() {
        System.out.println("zzz");
    }
}
