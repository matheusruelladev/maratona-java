package academy.devdojo.maratonajava.introducao.exercicios;

public class exercicioAula26 {
    public static void main(String[] args) {
        //Dados os valor de 1 a 7 imprima se é dia util ou final de semana
        //Considerando 1 como domingo.

        int dia =7 ;

        switch (dia) {
            case 1:
            case 7:
                System.out.println("FDS");
                break;
            case 3:
            case 4:                
            case 5:                
            case 6:                
            case 2:
                System.out.println("Dia de semana");
                break;
        
            default:
                System.out.println("Número invalido");
                break;
        }
    }

}
