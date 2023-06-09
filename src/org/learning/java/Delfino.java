package org.learning.java;

import org.learning.java.INuotante;

class Delfino extends AbstractAnimale implements INuotante {
    // Implemento metodo mangia del delfino
    void mangia() {
        System.out.println("Il delfino mangia il pesce");
    }

    // Implemento metodo verso delfino
    void verso() {
        System.out.println("eeek-eeek");
    }

    //
    public void nuota() {
        System.out.println("posso nuotare");
    }
}
