import java.util.ArrayList;

public class BusinessLead  extends BusinessEmployee{
    public ArrayList<Accountant> team;

    //Assignment 2 :Should create a new BusinessLead that is a Manager.Group project:Phavitran,Santhana,Madhan
    public BusinessLead(String name){
        super(name);
        this.basicSalary=getBaseSalary()*2;
        this.headcount=10;
        this.team= new ArrayList<>();
    }

    public boolean hasHeadCount(){
        return this.team.size() < this.headcount;
    }

    public void addReport(Accountant e, TechnicalLead supportTeam){
        if (hasHeadCount()){

            team.add(e);
            e.setManager(this);
            this.bonusBudget+=e.basicSalary*1.1;
            e.supportTeam(supportTeam);
            supportTeam.accountantSupport=e;
        }
    }

    public boolean approveBonus(Employee e, double bonus){

        for (Accountant accountant : team) {
            if ((accountant.getTeamSupported()).equals(e.manager) && accountant.canApproveBonus(bonus)) {
                e.bonus += bonus;
                accountant.bonusBudget -= bonus;
                return true;
            }
        }
        return  false;
    }

    public String getTeamStatus(){

        if (team.size()==0){
            return this.employeeStatus()+ " and no direct reports yet";
        } else {
            StringBuilder teamStatus= new StringBuilder();
            for (Accountant accountant : team) {
                teamStatus.append("    ").append(accountant.employeeStatus()).append("\n");
            }
            return this.employeeStatus()+" and is managing: \n"+teamStatus;

        }
    }
}
