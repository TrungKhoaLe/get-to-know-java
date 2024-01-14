public class WindChill {
    public static void main(String[] args) {
        double temp = Double.parseDouble(args[0]);
        double v_speed = Double.parseDouble(args[1]);

        if (Math.abs(temp) > 50.0 || v_speed > 120.0 || v_speed < 3) {
            System.out.println("Values make the formula invalid!!");
        }
        else {
            double w = 35.74 + 0.6215 * temp + (0.4275 * temp - 35.75) * Math.pow(v_speed, 0.16);
            System.out.println("Wind chill is: " + w);
        }
    }
}
