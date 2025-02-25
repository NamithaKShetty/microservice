package solidexample;

public class Developer implements IEmployee, IDeveloper {
    private String name;

    public Developer(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    // IEmployee method
    @Override
    public void performDuties() {
        writeCode();
    }

    // IDeveloper method
    @Override
    public void writeCode() {
        System.out.println(name + " is writing code.");
    }
}
