/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversortemperaturas;

/**
 * 
 * 1. Escreva um programa que, com base em uma temperatura em graus celsius, a converta e exiba em Kelvin (K), Réaumur (Re), Rankine (Ra) e Fahrenheit (F), seguindo as fórmulas: 
    F = C * 1.8 + 32; 
    K = C + 273.15; 
    Re = C * 0.8; 
    Ra = C * 1.8 + 32 + 459.67.

 * @author caioluiz
 * versão 1.0
 */

import java.util.Scanner;

public class ConversorTemperaturas {

    public static void main(String[] args) {
        float c, k, f, re, ra; //uma variável para cada medida de temperatura
        Scanner teclado = new Scanner(System.in); //para ter intereção com o usuário
        
        System.out.println("CONVERSOR DE TEMPERATURAS");
        System.out.println("Digite a temperatura em graus celsius:");
        c = teclado.nextFloat(); // o usuario digita o valor em celsius
        // cada variável de temperatura recebe os valores convertidos
        k = c + 273.15f;
        f = c * 1.8f + 32;
        re = c * 0.8f;
        ra = c * 1.8f + 32 + 459.67f;
        
        System.out.printf("\n%.2f graus celsius é igual a %.2f graus Kelvin\n",c,k);
        System.out.printf("%.2f graus celsius é igual a %.2f graus Fahrenheit\n",c,f);
        System.out.printf("%.2f graus celsius é igual a %.2f graus Réaumur\n",c,re);
        System.out.printf("%.2f graus celsius é igual a %.2f graus Rankine\n",c,ra);
    }
    
}
