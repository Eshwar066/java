package Projects.ZoomCar;

import Projects.ZoomCar.Car;

public class Customer {

    private Integer Id;
    private String CusName;
    private String CusPhNum;

    private Car car;

    public Customer(Integer id, String cusName, String cusPhNum, Car car) {
        Id = id;
        CusName = cusName;
        CusPhNum = cusPhNum;
        this.car = car;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getCusName() {
        return CusName;
    }

    public void setCusName(String cusName) {
        CusName = cusName;
    }

    public String getCusPhNum() {
        return CusPhNum;
    }

    public void setCusPhNum(String cusPhNum) {
        CusPhNum = cusPhNum;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "Id=" + Id +
                ", CusName='" + CusName + '\'' +
                ", CusPhNum='" + CusPhNum + '\'' +
                ", car=" + car +
                '}';
    }

    public void  cusDisplay(){
        System.out.println("id: "+Id);
        System.out.println("customerName: "+ CusName);
        System.out.println("phone Number: "+ CusPhNum);
        System.out.println("car: "+car);
        System.out.println("--------------------------");
    }
}
