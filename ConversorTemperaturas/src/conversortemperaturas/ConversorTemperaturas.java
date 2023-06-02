/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversortemperaturas;

/**
 *
 * 1. Escreva um programa que, com base em uma temperatura em graus celsius, a
 * converta e exiba em Kelvin (K), Réaumur (Re), Rankine (Ra) e Fahrenheit (F),
 * seguindo as fórmulas: F = C * 1.8 + 32; K = C + 273.15; Re = C * 0.8; Ra = C
 * * 1.8 + 32 + 459.67.
 *
 * @author caioluiz versão 1.0
 */
import java.util.Scanner;

public class ConversorTemperaturas {
    
    static boolean roda = true; // variável que verifica se o programa deve continuar rodando ou acabar
    
    static Scanner teclado = new Scanner(System.in); //para ter intereção com o usuário
    
    public static void main(String[] args) { //PRINCIPAL
        int escolha; 
        while(roda == true){ // Enquanto a variável "roda" for verdadeira o programa vai continuar rodando
            System.out.printf("\nDeseja fazer uma conversão de temperatura?\n1 - Sim\n2 - Não\n");
            escolha = teclado.nextInt();
            if(escolha == 1){ // se o usuário responder que quer continuar usando o programa, vai chamar o conversor de temperaturas
                roda = true;
                conversorTemperatura();
            }else roda = false; //como virou falso, significa que o usuário não quer mais usar o programa e quebra o loop do while
        }
        System.out.println("Obrigado por usar o sistema! Volte sempre!");
    }
    
    public static void conversorTemperatura(){  //CONTEM UM MENU DE CONVERSÃO E EXECUTA CONVERSÕES DE TEMPERATURA
        float c, k, f, re, ra; //uma variável para cada medida de temperatura
        int opcao;
        
        System.out.println("\nCONVERSOR DE TEMPERATURAS");
        System.out.println("\nDigite a temperatura em graus celsius:");
        c = teclado.nextFloat(); // o usuario digita o valor em celsius
        // cada variável de temperatura recebe os valores convertidos
        k = c + 273.15f;
        f = c * 1.8f + 32;
        re = c * 0.8f;
        ra = c * 1.8f + 32 + 459.67f;
        System.out.println("\nQual conversão deseja fazer?");
        System.out.printf("1 - Celsius para Kelvin\n2 - Celsius para Fahrenheit\n3 - Celsius para Réaumur\n4 - Celsius para Rankine\n");
        opcao = teclado.nextInt();
        switch(opcao){
            case 1:
                System.out.printf("\n%.2f graus celsius é igual a %.2f graus Kelvin\n", c, k);
                break;
            case 2:
                System.out.printf("%.2f graus celsius é igual a %.2f graus Fahrenheit\n", c, f);
                break;
            case 3:
                System.out.printf("%.2f graus celsius é igual a %.2f graus Réaumur\n", c, re);
                break;
            case 4:
                System.out.printf("%.2f graus celsius é igual a %.2f graus Rankine\n", c, ra);
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }
    }

}
