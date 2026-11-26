package academy.devdojo.maratonajava.introducao.exercicios;

public class exercicioAula23 {
    public static void main(String[] args) {
        double salario = 70000;
        String mensagem;
        if (salario<=34712) {
            mensagem= String.format("Você paga de imposto por ano: %.2f%n ",(salario*9.7)/100);
        }else if (salario<= 68507) {
            mensagem= String.format("Você paga de imposto por ano: %.2f%n ",(salario*37.35)/100);
        }else{
            mensagem= String.format("Você paga de imposto por ano: %.2f%n ",(salario*49.5)/100);
        }
        System.out.println(mensagem);
    }
    
}
