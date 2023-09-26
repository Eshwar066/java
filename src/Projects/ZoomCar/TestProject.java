package Projects.ZoomCar;

import Projects.ZoomCar.Car;
import Projects.ZoomCar.Customer;
import Projects.ZoomCar.Rental;

public class TestProject {
    public static void main(String[] args) {

        Car car1=new Car(1,"BMW",2003,false);
        Car car2=new Car(2,"Audi",2015,false);

        Customer customer1=new Customer(1,"Eshwar","1234567",car1);
        Customer customer2=new Customer(2,"teja","9876542",car2);

        Rental rentalSystem=new Rental();
        rentalSystem.rentCar(car1,customer1);
        rentalSystem.rentCar(car2,customer2);

        rentalSystem.returnCar(car2);

        car1.diplay();
        car2.diplay();

        customer1.cusDisplay();
        customer2.cusDisplay();
    }
}
