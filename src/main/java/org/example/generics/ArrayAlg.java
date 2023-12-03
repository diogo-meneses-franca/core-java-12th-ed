package org.example.generics;

public class ArrayAlg {

    /**
     * Pega o mínimo e o máximo de um array de Strings
     * @param a um array de strings.
     * @return um par com os valores min e max, ou null se a é nulo ou vazia
     */
    public static Pair<String> minmax(String[] a){
       if(a == null || a.length == 0) return null;
       String min = a[0];
       String max = a[0];
       for(int i = 0; i < a.length; i++){
           if(min.compareTo(a[i]) > 0) min = a[i];
           if(max.compareTo(a[i]) < 0) max = a[i];
       }
       return new Pair<>(min, max);
    }

    /**
     * Um método genérico com limites na variável tipada T
     * A declaração <T extends Comparable> indica que T deve ser uma classe que implementa a interface Comparable
     * isso é feito pois é o unico jeito de garantir que o array T[] a será um array de objetos que possuem o método compareTo
     * O parâmetro tipado T pode ter quantos limites forem necessários.
     * Caso T estenda uma classe ela deve ser a primeira a ser declarada.
     * Apenas uma classe pode ser herdada, mas multiplas interfaces podem ser implementadas.
     * Ao herdar ou implementar multiplas classes deve-se separa-las por &. Ex: <T extends Comparable & Serializable>
     * @param a um array de T q possui o método compareTo
     * @return um objeto Pair contendo os valores min e max
     * @param <T> Um array genérico que possui objetos do tipo T
     */
    public static <T extends Comparable> Pair<T> minmax(T[] a){
        if(a == null || a.length == 0) return null;
        T min = a[0];
        T max = a[0];
        for(int i = 0; i < a.length; i++){
            if(min.compareTo(a[i]) > 0) min = a[i];
            if(max.compareTo(a[i]) < 0) max = a[i];
        }
        return new Pair<>(min, max);
    }
}
