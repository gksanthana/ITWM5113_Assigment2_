class TechnicalEmployee extends Employee {
    protected int checkins;

    //Assignment 2: Has a default base salary of 75000. Group project:Phavitran,Santhana,Madhan
    protected TechnicalEmployee(String name){
        super(name,75000.00);checkins=0;
    }
    //return a String representation of this Technical_Employee that includes
    // ID ,successful check ins &name and how many successful check ins.Group project:Phavitran,Santhana,Madhan

    protected String employeeStatus(){
        var s = super.toString() + " has " + checkins + " successful check ins";
        return s;
    }


}

