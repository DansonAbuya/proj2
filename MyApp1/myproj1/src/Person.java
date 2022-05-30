public class Person {
    private String Name;
    private  String Profession;
    private  int Age;
    private int Earnings;

    public Person() {
    }

    public Person(String name, String profession, int age, int earnings) {
        Name = name;
        Profession = profession;
        Age = age;
        Earnings = earnings;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getProfession() {
        return Profession;
    }

    public void setProfession(String profession) {
        Profession = profession;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public int getEarnings() {
        return Earnings;
    }

    public void setEarnings(int earnings) {
        Earnings = earnings;
    }
}
