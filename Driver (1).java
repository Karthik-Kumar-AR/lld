class Driver extends Person{
    private int income;
    Driver(int id,String name){
      super(id,name);
      this.income=0;
    }
    int getIncome(){
      return income;
    }
    void updateIncome(int x){ 
      income+=x;
    }
    void printDetails(){
        System.out.println("Id: "+id+", DriverName: "+name+", Income: "+income);
    }
}