/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Diego Plascencia
 */
public class Validacion {

    public static void main(String[] args) {

    }

    public boolean ValidacionEdad(String edad) {
        boolean r = false;
        try {
            int a = Integer.parseInt(edad);
            r = true;
        } catch (Exception e) {
            r = false;
        }
        return r;
    }

    public boolean ValidacionNombre(String nom) {
        boolean r = false;
        int c = 0;
        for (int i = 0; i < nom.length(); i++) {
            if (nom.codePointAt(i) >= 97 && nom.codePointAt(i) <= 122
                    || (nom.codePointAt(i) >= 65 && nom.codePointAt(i) <= 90)
                    || (nom.codePointAt(i) == 32)) {
                c++;
            }
        }
        if (c == nom.length()) {
            r = true;
        } else {
            r = false;
        }
        return r;
    }

    public boolean ValidacionAltura(String alt) {
        boolean r = false;
        try {
            int a = Integer.parseInt(alt);
            r = true;
        } catch (Exception e) {
            r = false;
        }
        return r;
    }
}
