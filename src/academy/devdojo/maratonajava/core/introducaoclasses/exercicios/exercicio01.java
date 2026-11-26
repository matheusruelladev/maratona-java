package academy.devdojo.maratonajava.core.introducaoclasses.exercicios;

public class exercicio01 {
    public static void main(String[] args) {
        exerccio01Carro carro1 = new exerccio01Carro();
        exerccio01Carro carro2 = new exerccio01Carro();

        carro1.nome="Audi";
        carro1.modelo= "A3";
        carro1.ano = 2018;

        carro2.nome= "Chevrolet";
        carro2.modelo= "Opala";
        carro2.ano = 1984;

        carro2=carro1;

        System.out.println(carro1.nome);
        System.out.println(carro1.modelo);
        System.out.println(carro1.ano);
        System.out.println(carro2.nome);
        System.out.println(carro2.modelo);
        System.out.println(carro2.ano);
    }
}
