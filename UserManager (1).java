import java.util.HashMap;
public class UserManager{
    private HashMap<Integer,User>users;
    UserManager(){
        this.users=new HashMap<>();
        users.put(10,new Admin(10,"PPP"));
        users.put(20,new User(20,"QQQ"));
        users.put(30,new User(30,"RRR"));
    }
    User getUser(int userId){
        return users.get(userId);
    }
    HashMap<Integer, User> getAllUsers(){
        return users;
    }
}
