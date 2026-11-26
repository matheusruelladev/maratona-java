package academy.devdojo.maratonajava.core.BIntroducaometodos.test;

import academy.devdojo.maratonajava.core.BIntroducaometodos.dominio.Calculadora;

public class CalculadoraTest01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        calculadora.somaDoisNumeros();
        System.out.println("Finalizando calculadoraTest01");
        calculadora.subtrairDoisNumeros();
    }
}
