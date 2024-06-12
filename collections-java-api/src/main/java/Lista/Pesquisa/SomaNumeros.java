package main.java.Lista.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    List<Integer> numerosIntList;

    public SomaNumeros() {
        this.numerosIntList = new ArrayList<>();
    }

    public void adicionarNumeros(int numero){
        numerosIntList.add(numero);
    }

    public int calcularSoma(){
        int soma = 0;
        if (!numerosIntList.isEmpty()){
            for (Integer num: numerosIntList){
                soma+=num;
            }
        }
        return soma;
    }

    public int encontrarMaiorNumero(){
        int maior = 0;
        if (!numerosIntList.isEmpty()){
            for (Integer num : numerosIntList){
                if (num > maior){
                    maior = num;
                }
            }
        }
        return maior;
    }

    public int encontrarMenorNumero(){
        int menor = 99999;

        if (!numerosIntList.isEmpty()){
            for (Integer num : numerosIntList){
                if (num < menor){
                    menor = num;
                }
            }
        }else{
            menor = -99999;
        }
        return menor;
    }

    public void exibirNumeros(){
       if (!numerosIntList.isEmpty()){
           System.out.println(numerosIntList);
       }else{
           System.out.println("A lista está vazia");
       }
    }

    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();
        somaNumeros.adicionarNumeros(2);
        somaNumeros.adicionarNumeros(3);
        somaNumeros.adicionarNumeros(5);

        System.out.println(somaNumeros.calcularSoma());
        System.out.println(somaNumeros.encontrarMaiorNumero());
        System.out.println(somaNumeros.encontrarMenorNumero());
        somaNumeros.exibirNumeros();
    }
}
