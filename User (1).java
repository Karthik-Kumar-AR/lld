import java.util.HashMap;
class User extends Person{
    private HashMap<Integer,Character[]> travels=new HashMap<>();
    User(int id,String name){
      super(id,name);
    }
    void updateTravells(char src,char dest,int amt){
        travels.put(amt,new Character[]{src,dest});
    }
    void printDetails(){
        if(travels.isEmpty()){
          System.out.println("No travels yet for "+name);
        }
        else{
            System.out.println("Travels of the user "+name);
            int idx=1;
            for(Integer i:travels.keySet()){
                Character[] arr=travels.get(i);
                System.out.println(idx+". Fare: "+i+", Src: "+arr[0]+", Dest: "+arr[1]);
                idx++;
            }
        }
    }
}