package academy.devdojo.maratonajava.core.BIntroducaometodos.test;

import academy.devdojo.maratonajava.core.BIntroducaometodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

    double resultado= calculadora.divideDoisNumero(20, 0);
        System.out.println(resultado);

    System.out.println("------------------------------");
    calculadora.imprimeDivisaoDoisNumero(86, 0);
}
}
