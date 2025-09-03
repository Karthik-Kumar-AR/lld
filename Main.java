import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DistanceManager distanceManager=new DistanceManager();
        DriverManager driverManager=new DriverManager();
        UserManager userManager=new UserManager();
        CabManager cabManager=new CabManager();

        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("1.Book cab");
            System.out.println("2.Show my travels");
            System.out.println("3.See all driver details");
            System.out.println("4.See all user details");
            System.out.println("5.Exit");
            System.out.print("Enter your choice: ");
            int ch=sc.nextInt();
            switch(ch){
                case 1:{
                    System.out.println("Enter User id: ");
                    int id=sc.nextInt();
                    System.out.println("Enter source: ");
                    char src=sc.next().charAt(0);
                    System.out.println("Enter destination: ");
                    char dest=sc.next().charAt(0);
                    int minDis=Integer.MAX_VALUE;
                    int minEarn=Integer.MAX_VALUE;
                    int cabId=-1;

                    for(Integer i:cabManager.getAllCabs().keySet()){
                        int dist=distanceManager.getDistance(cabManager.getCab(i).getPosition(),src);
                        if(minDis>dist){
                            minDis=dist;
                            cabId=cabManager.getCab(i).getCabId();
                        }
                        else if(minDis==dist){
                            if(minEarn>driverManager.getDriver(cabManager.getCab(i).getDriverId()).getIncome()) {
                                cabId=cabManager.getCab(i).getCabId();
                                minEarn=driverManager.getDriver(cabManager.getCab(i).getDriverId()).getIncome();
                            }
                        }
                    }
                    
                    if(cabId==-1){
                        System.out.println("No rides available");
                    }
                    else{
                        int dist=distanceManager.getDistance(src,dest);
                        int pay=0;
                        if(dist<=5) pay+=dist*20;
                        else pay+=100+(dist-5)*10;

                        driverManager.getDriver(cabManager.getCab(cabId).getDriverId()).updateIncome(pay);
                        System.out.println("The fare is "+pay);

                        userManager.getUser(id).updateTravells(src,dest,pay);
                        cabManager.getCab(cabId).setPosition(dest);
                    }
                    break;
                }
                case 2:{
                    System.out.println("Enter User id: ");
                    int id=sc.nextInt();
                    userManager.getUser(id).printDetails();
                    break;
                }
                case 3:{
                    System.out.println("Enter User id: ");
                    int id=sc.nextInt();
                    Person p=userManager.getUser(id);
                    if(p instanceof Admin){
                      ((Admin)p).viewAllDrivers(driverManager.getAllDrivers());
                    }
                    else{
                      System.out.println("U r not an admin");
                    }
                    break;
                }
                case 4:{
                    System.out.println("Enter User id: ");
                    int id=sc.nextInt();
                    Person p=userManager.getUser(id);
                    if(p instanceof Admin){
                        ((Admin)p).viewAllUsers(userManager.getAllUsers());
                    }
                    else{
                        System.out.println("U r not an admin");
                    }
                    break;
                }
                case 5:
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}