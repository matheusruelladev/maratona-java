package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        /*
        // + - / *
        int numero01 = 10;
        double numero02 = 20;
        double resultado = numero01 + numero02;
        System.out.println(resultado);
    
        //%
         
        int resto =21% 7;
        System.out.println(resto);
        // < > <= >= == !=
       
       boolean isDezMaiorQueVinte = 10>20;   
       boolean isDezMenorQueVinte = 10<20;   
       boolean isDezigualVinte = 10==20;
       boolean isDezigualDez = 10==10;
       boolean isDezDiferentelDez = 10!=10;

       System.out.println(isDezMaiorQueVinte);
       System.out.println(isDezMenorQueVinte);
       System.out.println(isDezigualVinte);
       System.out.println(isDezigualDez);
       System.out.println(isDezDiferentelDez);
       */
       // &&(AND) ||(OR) !(NOT)
        int idade =35;
        float salario   =3500f;
        boolean isDentroDaLeiMaiorQueTrinta = idade >30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade <30 && salario >= 3381;

        System.out.println("isDentroDaLeiMaiorQueTrinta: "+ isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta: "+ isDentroDaLeiMenorQueTrinta);
        
        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation = 5000f;

        boolean isPlaystatioCincoCompravel = valorTotalContaCorrente> valorPlaystation || valorTotalContaPoupanca > valorPlaystation;
        System.out.println("isPlaystationCincoCompravel"+ isPlaystatioCincoCompravel);
    }
} 