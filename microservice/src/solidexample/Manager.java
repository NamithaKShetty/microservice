package solidexample;

public class Manager implements IEmployee, IManager {
    private String name;

    public Manager(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    // IEmployee method
    @Override
    public void performDuties() {
        manageTeam();
    }

    // IManager method
    @Override
    public void manageTeam() {
        System.out.println(name + " is managing the team.");
    }
}
