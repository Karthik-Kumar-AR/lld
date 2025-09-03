import java.util.HashMap;
public class CabManager{
    private HashMap<Integer,Cab>cabs;
    CabManager() {
        this.cabs = new HashMap<>();
        cabs.put(1,new Cab(1,100,'a'));
        cabs.put(2,new Cab(2,200,'b'));
        cabs.put(3,new Cab(3,300,'c'));
    }
    Cab getCab(int cabId){
        return cabs.get(cabId);
    }
    HashMap<Integer,Cab>getAllCabs(){
        return cabs;
    }
}
