import java.util.List;

public class App {

      /**
     * TODO:
     * 
     * completare la classe DataHelper
     * 
     * aggiungere i seguenti metodi per testare la classe DataHelper:
     * - testRandomInteger : void
     * testare le 3 implementazioni del metodo getRandomInteger
     * 
     * - testRandomUniqueInteger : void
     * testare le 3 implementazioni del metodo getRandomUniqueInteger
     * 
     * - testFrequencyMap : void
     * testare il metodo getFrequencyMap;
     * sfruttare i metodi precedentemente svolti e utilizzarli come
     * dati in ingresso per il metodo getFrequencyMap
     * 
     */


    public static void main(String[] args) throws Exception {
        //testRandomInteger();
        testRandomUniqueInteger();
        //testFrequencyMap();
    }

    public static void testRandomInteger(){
        DataHelper dh = new DataHelper();

        System.out.println("Size: "+dh.getRandomInteger(6));
        System.out.println("Size, max: "+dh.getRandomInteger(5, 10));
        System.out.println("Size, min, max: "+dh.getRandomInteger(6,3,8));

    }

    public static void testRandomUniqueInteger(){
        DataHelper dh = new DataHelper();
        try{
            System.out.println("Size: "+dh.getRandomUniqueInteger(8));
        }catch (Exception e){
            System.out.println("Numero non valido");
        }

       try {
            System.out.println("Size, max: "+dh.getRandomUniqueInteger(10,5)); 
        } catch (Exception e) {
            System.out.println("Numero non valido");
        }

        try {
            System.out.println("Size, min, max: "+dh.getRandomUniqueInteger(10,4,20));
        } catch (Exception e) {
            System.out.println("Numero non valido");
        }
        
    }

    public static void testFrequencyMap(){
        DataHelper dh = new DataHelper();

        List<Integer> lista = dh.getRandomInteger(10, 8);
        
        System.out.println("Lista: "+lista);
        System.out.println("Frequency map: "+dh.getFrequencyMap(lista)); 
    }
}
