package components;

public class GPSNavigator {
    private String route;

    public GPSNavigator() {
        this.route = "103 Vincent street, Auckland to 55 Wellesley street, Auckland";
    }

    public GPSNavigator(String manualRoute) {
        this.route = manualRoute;
    }

    public String getRoute() {
        return route;
    }
}
