import java.util.Arrays;

public class Collection {

    private final int[] numbers;
    private Iterator t1, t2;


    public Collection(int[] numbers) {
        this.numbers = numbers;
        this.t1 = new Collection.Task1();
        this.t2 = new Collection.Task2();

    }

    public Iterator getT1() {
        return t1;
    }

    public Iterator getT2() {
        return t2;
    }

    class Task1 implements Iterator {
        public int index = 0;

        @Override
        public boolean hasNext() {
            return index < Collection.this.numbers.length;
        }

        @Override
        public int next() {
            int n = Collection.this.numbers[index++];
                if (n % 2 != 0) {
                return n;
            }
            return 0;
        }
    }

    class Task2 implements Iterator {
        public int index = Collection.this.numbers.length - 1;

        @Override
        public boolean hasNext() {
            return index >= 0;
        }

        @Override
        public int next() {
            int n = Collection.this.numbers[index];
            index -= 2;
            return n;

        }
    }
}

