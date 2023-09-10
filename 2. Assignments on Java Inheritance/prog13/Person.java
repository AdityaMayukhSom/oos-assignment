public class Person {
    private String name;
    private double weight;
    private double height;
    private Date dateOfBirth;
    private String address;

    public Person(final String name, final Date birthDay, final String address,
            final double height, final double weight) {
        this.name = name;
        this.weight = weight;
        this.height = height;
        this.address = address;
        this.dateOfBirth = birthDay;
    }

    public int getAge() {
        return Date.computeYearsBetweenDates(dateOfBirth, Date.now());
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(final double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(final double height) {
        this.height = height;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(final Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(final String address) {
        this.address = address;
    }

}
