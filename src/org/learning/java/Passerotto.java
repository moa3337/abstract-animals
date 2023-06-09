package org.learning.java;

import org.learning.java.IVolante;

class Passerotto extends AbstractAnimale implements IVolante {
    // Implemento metodo mangia del passerotto
    void mangia() {
        System.out.println("Il passerotto mangia i semi");
    }

    // Implemento metodo verso passerrotto
    void verso() {
        System.out.println("cip-cip");
    }

    //
    public void vola() {
        System.out.println("Posso volare");
    }
}
