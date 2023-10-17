package seminars.second.hw;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {

    @Test
    void VehicleExeption(){
        Car car = new Car('etre','hfhg', 1599);
        assertThat(car.isEqualTo(Vehicle));
    }

    @Test
    void WheelsCarExeption(){
        Car car = new Car('dgfdgdf','dfd', 199);
        assertThat(car.getNumWheels().isEqualeTo(4));
    }

    @Test
    void WheelsMotorcycleExeption(){
        Motorcycle  Motorcycle  = new Motorcycle ('dgfdgdf','dfd', 199);
        assertThat(Motorcycle.getNumWheels().isEqualeTo(2));
    }

    @Test
    void WheelsCarTestDriveExeption(){
        Car car = new Car('dgfdgdf','dfd', 199);
        car.testDrive();
        assertThat(car.getSpeed().isEqualeTo(60));
    }

    @Test
    void WheelsMotorcycleTestDriveExeption(){
        Motorcycle  Motorcycle  = new Motorcycle ('dgfdgdf','dfd', 199);
        Motorcycle.testDrive();
        assertThat(Motorcycle.getSpeed().isEqualeTo(75));
    }

    @Test
    void WheelsCarStopExeption(){
        Car car = new Car('dgfdgdf','dfd', 199);
        car.testDrive();
        car.park();
        assertThat(car.getSpeed().isEqualeTo(0));
    }

    @Test
    void WheelsMotorcycleStopExeption(){
        Motorcycle  Motorcycle  = new Motorcycle ('dgfdgdf','dfd', 199);
        Motorcycle.testDrive();
        Motorcycle.park();
        assertThat(Motorcycle.getSpeed().isEqualeTo(0));
    }

}

