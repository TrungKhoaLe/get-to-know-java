class ArrayCopyOfDemo {
    public static void main(String[] args) {
        String[] copyFrom = {
            "Affogato", "Americano", "Cappuccino", "Corretto", "Cortado",   
            "Doppio", "Espresso", "Frappucino", "Freddo", "Lungo", "Macchiato",      
            "Marocchino", "Ristretto"
        };

        String[] copyTo = java.util.Arrays.copyOfRange(copyFrom, 0, 4);
        for (String coffee: copyTo) {
            System.out.print(coffee + " ");
        }
    }
}
