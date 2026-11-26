package academy.devdojo.maratonajava.core.introducaoclasses.teste;

import academy.devdojo.maratonajava.core.introducaoclasses.dominio.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();

        estudante.nome="Luffy";
        estudante.idade=22;
        estudante.sexo='M';
 
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
    }
    
}
