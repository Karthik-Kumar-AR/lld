import java.util.HashMap;
public class DistanceManager{
    private HashMap<Character,Integer>dMap;
    DistanceManager(){
        dMap=new HashMap<>();
        dMap.put('a',0);
        dMap.put('b',10);
        dMap.put('c',20);
        dMap.put('d',25);
        dMap.put('e',40);
        dMap.put('f',70);
    }
    int getDistance(char src, char dest){
        return Math.abs(dMap.get(dest)-dMap.get(src));
    }
}
