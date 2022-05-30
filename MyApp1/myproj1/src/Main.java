
public class Main {
    public static void main(String[] args) {
        Driver driver = new Driver();

        driver.setCompany("Co-operative bank");
        driver.setRoute("Nairobi-Mombasa");
        driver.setAge(24);
        driver.setEarnings(20000);
        driver.setName("Jerry");
        driver.setProfession("Driving");

        System.out.println("The person's profession is " + driver.getProfession());
        System.out.println("The driver's name is "+ driver.getName());
        System.out.println("The driver works for " + driver.getCompany());
        System.out.println("The driver is "+ driver.getAge() + " old");
        System.out.println( "The driver earns "+ driver.getEarnings() +" shillings");
        System.out.println("The driver operates in the "+ driver.getRoute() + " route");

    }
}
