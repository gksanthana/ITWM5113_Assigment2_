class BusinessEmployee extends Employee {

    //default salary 50000.
    public BusinessEmployee(String name){
        super(name,50000.00);
    }
    //Should establish a running tally with remaid bonusBudget for the employeesupport team. How
    // budget determined will depend on which type of Business_Employee it is.Group project:Phavitran,Santhana,Madhan
    public double getBonusBudget(){

        return bonusBudget;
    }

    //\return a String represent BusinessEmployee including name ,includestheir ID,
    // , size of their currentlybudget.Group project:Phavitran,Santhana,Madhan
    public String employeeStatus(){
        String s= String.format("%.2f",bonusBudget);
        return this + " with a budget of " + s;
    }
}

