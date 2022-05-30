public class Driver extends Person{
    private String Company;
    private String Route;

    public Driver() {
    }

    public Driver(String company, String route) {
        Company = company;
        Route = route;
    }

    public String getCompany() {
        return Company;
    }

    public void setCompany(String company) {
        Company = company;
    }

    public String getRoute() {
        return Route;
    }

    public void setRoute(String route) {
        Route = route;
    }
}
