

class Employee {


    protected String name;
    protected int employeeID = countID;
    protected static int countID;
    protected double bonus;
    protected Employee manager;
    protected int headcount=0;
    protected double basicSalary;
    protected Accountant accountantSupport;
    protected double bonusBudget;

    //Assignment 2 Should_construct a new employee object and take in two parameters, one for the name
    // of the user and one for base_salary. Group project:Phavitran,Santhana,Madhan
    protected Employee(String name, double baseSalary){
        this.name=name;
        int i = ++countID;
        this.basicSalary=baseSalary;
    }
    //return the employee's salary. Group project:Phavitran,Santhana,Madhan
    protected double getBaseSalary(){
        return this.basicSalary;
    }
    //return the employee's_name. Group project:Phavitran,Santhana,Madhan
    public String getName(){
        return this.name;
    }
    //return the employee's ID & issued on behalf of the employee at
    // the time they constructed. Employee have ID 1,
    // the second 2 and the third 3 so on. Group project:Phavitran,Santhana,Madhan
    protected int getEmployeeID(){

        return this.employeeID;
    }
    //Should_return a reference to Employee object
    // that represents this manager of employees.Group project:Phavitran,Santhana,Madhan
    protected Employee getManager(){
        return manager;
    }

    protected Accountant getAccountantSupport() {
        return this.accountantSupport;
    }

    protected void setManager(Employee manager){
        this.manager=manager;
    }

    //Should_return true if the two employee_IDs are the same,
    // false otherwise Group project:Phavitran,Santhana,Madhan
    protected boolean equals(Employee other){
        return this.getEmployeeID()==other.getEmployeeID();
    }

    //Should_return a String.  employee representation that is a combination of their id
    // followed by the employee name.Group project:Phavitran,Santhana,Madhan

    public String toString(){
        String s;
        s = getEmployeeID() + " " + getName();
        return s;
    }

    //String should return as representation of that Employee's current status.
    // This will be different for every subclass of Employee Group project:Phavitran,Santhana,Madhan
    protected String employeeStatus() {
        return null;
    }

}

