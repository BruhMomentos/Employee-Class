

public class Employee {

    private int id;
    private String firstname;
    private String lastname;
    private int salary;

    //Constructor

   Employee(int id, String firstname, String lastname, int salary){
       System.out.println("Creating id Card");
       this.id = id;
       this.firstname = firstname;
       this.lastname = lastname;
       this.salary = salary;

   }
   //Methods
    public int getid(){
       return id;
    }
    public String getfirstname(){
       return firstname;
    }
    public String getlastname(){
       return lastname;
    }
    public int getsalary(){
       return salary;
    }
    public String getname(){
       String name = firstname + lastname;
       return name;
   }

    public void setSalary(int Salary){
       if (Salary < 0) {
           this.salary = 0;
       }
        else {
           this.salary = salary;
       }
   }
    public int getannualsalary(){
        this.salary = salary * 12;
        return salary;
    }
    public int raisesalary(int percent){
       salary = (1+(percent/100)) * this.salary;
       return salary;
   }
   public String toString(){
       String name = getname();
       return "ID " + id + "| Name: " + name + " | Salary " + salary;
   }










}


