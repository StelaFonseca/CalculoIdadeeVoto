package org.example.calculoidadeevoto;

import java.util.Scanner;

public class CalculoIdadeeVoto {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);


        System.out.println("Em que ano você nasceu?");
        int ano_nasc = teclado.nextInt();
        System.out.println("Qual ano atual? ");
        int ano_atual = teclado.nextInt();
        int idade = (ano_atual - ano_nasc);
        System.out.println("Sua idade é: " + idade +"!");
        String sit = ((idade>=16 && idade<18)  || (idade >70 ))?"OPCIONAL!":"OBRIGATORIO";
        System.out.println("O voto nas eleições de 2026 é :" +  sit);

    }
}
