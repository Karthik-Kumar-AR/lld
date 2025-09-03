import java.util.HashMap;
public class DriverManager{
    private HashMap<Integer, Driver>drivers;
    DriverManager(){
        this.drivers=new HashMap<>();
        drivers.put(100,new Driver(100,"XXX"));
        drivers.put(200,new Driver(200,"YYY"));
        drivers.put(300,new Driver(300,"ZZZ"));
    }
    Driver getDriver(int driverId){
        return drivers.get(driverId);
    }
    HashMap<Integer,Driver> getAllDrivers(){
        return drivers;
    }
}
