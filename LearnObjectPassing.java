public class LearnObjectPassing {
    public static void main(String[] args) {
        //
        LearnObjectPassingGarageClass garage = new LearnObjectPassingGarageClass();
        LearnObjectPassingCarClass car1 = new LearnObjectPassingCarClass("BMW");
        LearnObjectPassingCarClass car2 = new LearnObjectPassingCarClass("Tesla");
        garage.park(car1);
        garage.park(car2);
    }
}
