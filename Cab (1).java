class Cab{
    private int cabId,driverId;
    private char pos;
    Cab(int cabId,int driverId,char pos){
      this.cabId=cabId;
      this.driverId=driverId;
      this.pos=pos;
    }
    char getPosition(){ 
      return pos;
    }
    int getCabId(){
      return cabId;
    }
    int getDriverId(){
      return driverId;
    }
    void setPosition(char x){
      this.pos=x;
    }
}