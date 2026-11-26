package academy.devdojo.maratonajava.introducao.exercicios;

public class exercicioAula30 {
    //Dado o valor de um carro, descubra em quantas ele pode ser parcelado
    //Condição o valorParcela >=1000
    //27013389
    public static void main(String[] args) {
        double valorTotal=30000;
        for (int parcela=1; parcela<=valorTotal; parcela++) {
          double valorParcela = valorTotal/parcela;  
        if(valorParcela<1000){
            break;
        }
           System.out.println("Parcela "+ parcela+" R$ "+valorParcela);
        }
    }
}
