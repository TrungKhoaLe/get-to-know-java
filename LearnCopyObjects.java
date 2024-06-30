public class LearnCopyObjects {
    public static void main(String[] args) {
        LearnCopyObjectsCarClass car1 = new LearnCopyObjectsCarClass("Honda", "CRV", 2023);
        // LearnCopyObjectsCarClass car2 = new LearnCopyObjectsCarClass("Volvo", "XC90", 2024);
        LearnCopyObjectsCarClass car2 = new LearnCopyObjectsCarClass(car1);

        // car2.copy(car1);

        System.out.println();
        System.out.println(car1);
        System.out.println(car1.getMake());
        System.out.println(car1.getModel());
        System.out.println(car1.getYear());
        System.out.println();
        System.out.println(car2);
        System.out.println(car2.getMake());
        System.out.println(car2.getModel());
        System.out.println(car2.getYear());
    }
}
