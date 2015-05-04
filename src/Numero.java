/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author alumno
 */
public class Numero {

    private double numero;

    public Numero(String sNum, char coma) {
        String aux = sNum;
        if (coma == ',') {
            aux = sNum.replace(",", ".");
        }
        try {
            numero = Double.parseDouble(aux);
        } catch (Exception e) {
            numero = Double.MAX_VALUE;
        }
    }

    public Numero(double n) {
        numero = n;
    }

    public double getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        if (numero == Double.MAX_VALUE) {
            return "Error";
        } else {
            return String.valueOf(numero).replace(".", ",");
        }
    }
}
