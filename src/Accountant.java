public class Accountant extends BusinessEmployee {
    protected TechnicalLead teamSupported;

    //Assignment 2:Should start bonus budget of 0.Group project:Phavitran,Santhana,Madhan*/
    public Accountant(String name){
        super(name);
        bonusBudget=0;
    }

    //Should return a reference to TechnicalLead that this Accountant currently supporting.TechnicalLead null
    // should be returned if they have not been assigned .Group project:Phavitran,Santhana,Madhan
    protected TechnicalLead getTeamSupported(){
        return this.teamSupported;
    }

    //allow reference to TechnicalLead to be passed in & saved.
    // Accountant's bonus budget updated in the total SoftwareEngineer salry that
    // reports to that TechnicalLead plus ten(10)%.Group project:Phavitran,Santhana,Madhan
    protected void supportTeam(TechnicalLead lead){
        this.teamSupported=lead;
        int bound = lead.team.size();
        for (int i = 0; i < bound; i++) {
            this.bonusBudget += lead.team.get(i).getBaseSalary() * 1.1;
        }
    }

    //take in suggested bonus amount & check if there still enough room in budget.
    // false returned if the bonus is > remaining budget.
    // false returned if accountant not supporting any team.Group project:Phavitran,Santhana,Madhan
    public boolean canApproveBonus(double bonus){

        if (bonus <=getBonusBudget()){
            return true;
        } else {
            System.out.print(" Rejected because Budget not sufficient. ");
            return false;
        }

    }

    //return a String representation name, their ID,nthe size
    // of their currently managed budget & the name of TechnicalLead and
    // currently supporting. Group project:Phavitran,Santhana,Madhan
    public String employeeStatus(){
        return this +" with a budget of "+ getBonusBudget()+" is supporting "+ this.getTeamSupported();
    }



}
