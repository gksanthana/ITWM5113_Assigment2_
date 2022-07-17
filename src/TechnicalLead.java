import java.util.ArrayList;

class TechnicalLead extends TechnicalEmployee {
    public ArrayList<SoftwareEngineer> team;

    {
        team = new ArrayList<>();
    }


    //Assignment 2 create a new TechnicalLead that is a Manager &
    //salary be 1.3 times of TechnicalEmployee.Group project:Phavitran,Santhana,Madhan
    public TechnicalLead(String name){

        super(name);
        this.basicSalary = this.basicSalary * 1.3;
        headcount=4;
    }

    //return true if the number of direct reports manager
    // has is < their headcount.Group project:Phavitran,Santhana,Madhan
    public boolean hasHeadCount(){
        boolean b;
        b = team.size() < headcount;
        return b;
    }

    //accept reference to SoftwareEngineer object.Group project:Phavitran,Santhana,Madhan
    public void addReport(SoftwareEngineer e){
        if (!hasHeadCount()) {
            return;
        }
        boolean add;
        add = team.add(e);
        e.setManager(this);
    }


    protected boolean approveCheckIn(SoftwareEngineer e){
        return e.getManager().equals(this) && e.getCodeAccess();
    }

    //Should check if the bonus amount requested would be approved by the BusinessLead supporting this TechnicalLead.

    protected boolean requestBonus(Employee e, double bonus){
        BusinessLead businessLead = (BusinessLead) getAccountantSupport().getManager();
        boolean b = businessLead.approveBonus(e, bonus);
        boolean b1;
        b1 = b;
        return b1;
    }

    protected String getTeamStatus(){
        if (team.size() != 0) {
            StringBuilder teamStatus= new StringBuilder();
            for (SoftwareEngineer softwareEngineer : team) {
                teamStatus.append("    ").append(softwareEngineer.employeeStatus()).append("\n");
            }
            String s;
            s = this.employeeStatus() + " and is managing: \n" + teamStatus;
            return s;
        } else {
            String s;
            s = this.employeeStatus() + " and no direct reports yet";
            return s;
        }

    }


}
