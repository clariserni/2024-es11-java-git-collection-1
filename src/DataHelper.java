import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class DataHelper {

     // TODO: completare i metodi seguenti

    // restituisce una lista di numeri interi casuali compresi tra 0 e 10
    public static List<Integer> getRandomInteger(int size) {

        // Random random = new Random();

        // List<Integer> numeriRandom = new ArrayList<>();

        // for (int i=0; i<size; i++){
        //     int numeroRandom = random.nextInt(11);
        //     numeriRandom.add(numeroRandom);
        // }
    
        // return numeriRandom;

        return getRandomInteger(size, 10);
    }

    // restituisce una lista di numeri interi casuali compresi tra 0 e max
    public static List<Integer> getRandomInteger(int size, int max) {
        // Random random = new Random();

        // List<Integer> numeriRandom = new ArrayList<>();

        // for (int i=0; i<size; i++){
        //     int numeroRandom = random.nextInt(max+1);
        //     numeriRandom.add(numeroRandom);
        // }
    
        // return numeriRandom;

        return getRandomInteger(size, 0, max);
    }

    // restituisce una lista di numeri interi casuali compresi tra min e max
    public static List<Integer> getRandomInteger(int size, int min, int max) {
        Random random = new Random();

        List<Integer> numeriRandom = new ArrayList<>();

        for (int i=0; i<size; i++){
            int numeroRandom = random.nextInt(max-min+1) + min;
            numeriRandom.add(numeroRandom);
        }
    
        return numeriRandom;
        
    }

    // restituisce una lista di numeri casuali NON DUPLICATI compresi tra 0 e 10
        public static Set<Integer> getRandomUniqueInteger(int size) {
            Random random = new Random();

            Set<Integer> nonDuplicati = new HashSet<>();

            if(size <=0 || size>11){
                throw new IllegalArgumentException("Numero non consentito");

            } else{
            while(nonDuplicati.size()<size){
                int numeroRandom = random.nextInt(11);
                nonDuplicati.add(numeroRandom);
                }
            }
            return nonDuplicati;
        }

        // restituisce una lista di numeri casuali NON DUPLICATI compresi tra 0 e max
        public static Set<Integer> getRandomUniqueInteger(int size, int max) { 
            Random random = new Random();

            Set<Integer> nonDuplicati = new HashSet<>();

            if(size <=0 || size>max+1){
                throw new IllegalArgumentException("Numero non consentito");

            } else{
            while(nonDuplicati.size()<size){
                int numeroRandom = random.nextInt(max+1);
                nonDuplicati.add(numeroRandom);
                }
            }
            return nonDuplicati;
        }

    // restituisce una lista di numeri casuali NON DUPLICATI compresi tra min e max
        public static Set<Integer> getRandomUniqueInteger(int size, int min, int max) {
            Random random = new Random();

            Set<Integer> nonDuplicati = new HashSet<>();

            if(size <=0 || size>(max+1)-min){
               throw new IllegalArgumentException("Numero non consentito");

            } else{
            while(nonDuplicati.size()<size){
                int numeroRandom = random.nextInt((max+1)-min) + min;
                nonDuplicati.add(numeroRandom);
                }
            }
            return nonDuplicati;

        }

   // restituisce una mappa di frequenza di numeri interi
        public static Map<Integer, Integer> getFrequencyMap(List<Integer> list) {
            Map <Integer, Integer> counter = new HashMap<>();

            for (int i : list){
                if(counter.containsKey(i)){
                    int valore = counter.get(i);
                    counter.put(i, valore+1);
                }else{
                    counter.put(i,1);
                }
            }

        return counter;
        }
}
