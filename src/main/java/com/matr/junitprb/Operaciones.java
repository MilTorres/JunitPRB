package com.matr.junitprb;

import java.util.List;
import java.util.stream.Collectors;

public class Operaciones {


    public int Sumar(int a, int b) {

        return a + b;

    }

    public boolean checkPositivo(int a) {

        if (a < 0) {
            throw new IllegalArgumentException("el numero no puede ser negativo");
        }

        return true;
    }

    public int contarLetrasA(String a) {
        return (int) a.chars()
                .filter(letra -> letra == 'a')
                .count();
    }

    public boolean contieneElemento(List<String> lista , String elemento){
        return lista.contains(elemento);
    }

    public String revertirCadena(String cadena){
        return new StringBuilder(cadena).reverse().toString();

    }

    public Long factorial(int n){
        if(n < 0){
            throw new IllegalArgumentException("el numero no puede ser menor a 0");
        }
        long fact = 1;
        for(int i = 1; i <= n; i++){
            fact *= i;
        }
        return fact;
    }

    public boolean numPrimo(int num){
        if(num <= 1){
            return false;
        }
        for(int i = 2; i * i <= num; i++){
            System.out.println("i --> "+i);
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }

    public String mensajeConRetraso() throws InterruptedException{
        Thread.sleep(5000);
        return "listo despues del retraso";
    }

    public List<String> converitAString(List<Integer> list){
        return list.stream()
                .map(String::valueOf)
                .collect(Collectors.toList());
    }
}
