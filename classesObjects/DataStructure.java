public class DataStructure {
    // create an array
    private final static int SIZE = 15;
    private int[] arrayOfInts = new int[SIZE];

    public DataStructure() {
        // fill the array with ascending integer values
        for (int i = 0; i < SIZE; i++) {
            arrayOfInts[i] = i;
        }
    }

    public void printEven() {
        DataStructureIterator iterator = this.new EvenIterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }
    // an interface is a group of related methods with empty bodies
    interface DataStructureIterator extends java.util.Iterator<Integer> { }
    // implementing an interface allows a class to become more formal
    // about the behaviour it promises to provide. Interfaces form a contract
    // between the class and the outside world, and this contract is enforced
    // at build time by the compiler. If our class claims to implement an in-
    // terface, all methods defined by that interface must appear in its sou-
    // rce code before the class will successfully compile.
    private class EvenIterator implements DataStructureIterator {
        private int nextIndex = 0;

        public boolean hasNext() {
            return (nextIndex <= SIZE - 1);
        }

        public Integer next() {
            Integer retValue = Integer.valueOf(arrayOfInts[nextIndex]);
            nextIndex += 2;
            return retValue;
        }
    }
    
    public static void main(String[] args) {
        DataStructure ds = new DataStructure();
        ds.printEven();
    }
}
