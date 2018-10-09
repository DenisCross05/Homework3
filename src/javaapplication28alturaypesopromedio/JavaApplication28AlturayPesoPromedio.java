/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication28alturaypesopromedio;

import javax.swing.JOptionPane;

/**
 *
 * @author G6
 */
public class JavaApplication28AlturayPesoPromedio {

    /**6
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       int n;
        float peso = 0, altura = 0, promedioP = 0, promedioA = 0, sumaP = 0, sumaA = 0;
        String Peso, Altura, N;
        
        N = JOptionPane.showInputDialog("Ingrese el numero de personas a evaluar: ");
        n = Integer.parseInt(N);

        for (int i = 1; i <= n; i ++ ){
        Peso = JOptionPane.showInputDialog("Digite el peso en lb: " );
        Altura = JOptionPane.showInputDialog("Digite la altura en cm: " );
        peso = Float.parseFloat(Peso);
        altura = Float.parseFloat(Altura);
                    
        sumaP = sumaP + peso;
        sumaA = sumaA + altura;
                
        }
        promedioP = sumaP / n;
        promedioA = sumaA / n;
        System.out.println("El peso promedio de las "+n+" personas es:" + promedioP +"\n"+"La altura promedio de las "+n+" personas es:"+ promedioA);
    }
}
