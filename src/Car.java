public class Car {
    public int year;
    private String make;
    private int miles;
    private String model;

    public Car(int year, String make, int miles, String model) {
        this.year = year;
        this.make = make;
        this.miles = miles;
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getMiles() {
        return miles;
    }

    public void setMiles(int miles) {
        this.miles = miles;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
    public String toString(){
        return
                "This car is a " +
                this.getYear() + " " +
                this.getMake() + " " +
                this.getModel() + " with " +
                this.getMiles() + " miles. ";



    }
}
