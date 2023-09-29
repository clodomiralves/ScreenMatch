package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme filme1 = new Filme("O conde de monte Cristo", 2004);
        filme1.avalia(10);
        Filme filme2 = new Filme("Doze homens e outro segredo", 2007);
        filme2.avalia(5);
        Serie sexEducation = new Serie("Sex Education", 2023);
        sexEducation.avalia(3);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filme1);
        lista.add(filme2);
        lista.add(sexEducation);

        for (Titulo item: lista) {
           System.out.println(item.getNome());
           if (item instanceof Filme filme)
               System.out.println("Classificação: " + filme.getClassificacao());
            
        }
        //lista.forEach(System.out::println);



    }
}
