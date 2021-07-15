import java.util.Arrays;

public class Aplication {
    public static void main(String[] args) {
        int[] numbers = {11, 14, 17,15,16,18,19};

        Collection collection = new Collection(numbers);
        while (collection.getT1().hasNext()) {
            System.out.println(collection.getT1().next());
        }
        System.out.println("---------------------------------");
        while (collection.getT2().hasNext()) {
            System.out.println(collection.getT2().next());
        }
    }

}
