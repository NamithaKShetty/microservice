package solidexample;

public class SecurityGuard implements IEmployee, ISecurityGuard {
    private String name;

    public SecurityGuard(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    // IEmployee method
    @Override
    public void performDuties() {
        monitorPremises();
    }

    // ISecurityGuard method
    @Override
    public void monitorPremises() {
        System.out.println(name + " is monitoring the premises.");
    }
}
