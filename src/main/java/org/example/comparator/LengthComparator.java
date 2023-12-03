package org.example.comparator;

import java.util.Comparator;
/*
* Serve para comparar elementos de uma forma diferente da fornecida pelo metodo compareTo da classe String
* Nesse caso e criado uma classe LengthComparator que implementa Comparator.
* Isso serve para caso eu queira utilizar o método sort da classe Array.
* Assim essa implementação vai estabelecer uma forma de comparação para que o método sort a utilize fazendo o sort, nesse caso,
* de acordo com o tamanho da palavra. Usando essa implementação eu poderia utilizar o metodo sort para ordenar um array contendo
* qualquer tipo de objeto de acordo com a forma de comparação que eu escolher.
* Para fazer a comparação é necessario criar um objeto LengthComparator e passar ele como segundo parametro para o metodo sort.
* O primeiro parâmentro deve ser o array contendo os objetos do tipo String nesse caso, mas poderia ser de qualquer classe q eu escolher.
*  */
public class LengthComparator implements Comparator<String> {
    @Override
    public int compare(String first, String second) {
        return first.length() - second.length() ;
    }
}
