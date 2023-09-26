package Projects.ZoomCar;

public class Car {

    private Integer CarId;
    private String Model;
    private Integer Year;
    private boolean isRented;

    public Car(Integer carId, String model, Integer year, boolean isRented) {
        this.CarId = carId;
        this.Model = model;
        this.Year = year;
        this.isRented = isRented;
    }

    public Integer getCarId() {
        return CarId;
    }

    public void setCarId(Integer carId) {
        CarId = carId;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public Integer getYear() {
        return Year;
    }

    public void setYear(Integer year) {
        Year = year;
    }

    public boolean isRented() {
        return isRented;
    }

    public void setRented(boolean rented) {
        isRented = rented;
    }

    @Override
    public String toString() {
        return "Car{" +
                "CarId=" + CarId +
                ", Model='" + Model + '\'' +
                ", Year=" + Year +
                ", isRented=" + isRented +
                '}';
    }

    public void diplay(){
        System.out.println("carId: "+CarId);
        System.out.println("Model:  "+Model);
        System.out.println("Year: "+Year);
        System.out.println("isRentend: "+(isRented ? "Rented" : "Available"));
        System.out.println("-------------------------------------------");
    }
}
