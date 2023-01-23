package lld.design.designPrinciple.OOPS;

public class EncapusalatedPerson {
    private String name;
    private String role;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age >= 0) {
            System.out.println("Setting up age");
            this.age = age;
        } else {
            System.out.println("Bad Age Value");
            throw new RuntimeException();
        }
    }

    private int age;
}
