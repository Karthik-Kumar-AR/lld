import java.util.HashMap;
class Admin extends User{
    Admin(int id,String name){
      super(id,name);
    }
    void viewAllDrivers(HashMap<Integer,Driver> drivers){
        for(Driver i:drivers.values()){
          i.printDetails();
        }
    }
    void viewAllUsers(HashMap<Integer,User> users){
        for(User i:users.values()){
            i.printDetails();
        }
    }
}