package Projects.ZoomCar;

import Projects.ZoomCar.Car;
import Projects.ZoomCar.Customer;

import java.util.HashMap;

public class Rental {

    private HashMap<Car, Customer> rentals;

    public Rental(){
        rentals=new HashMap<>();
    }

    public boolean rentCar(Car car,Customer customer){
        if(!car.isRented()){
            car.setRented(true);
            rentals.put(car,customer);
            return true;
        }
        return false;
    }

    public boolean returnCar(Car car){
        if (rentals.containsKey(car)) {
            car.setRented(false);
            rentals.remove(car);
            return true;

        }
        return false;
    }


}
