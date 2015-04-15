package structural.composite;

import java.util.ArrayList;
import java.util.List;

/*
    Composite Pattern contains a Group of its own Object
    And provides ways to modify it.
 */

/**
 * Created by Squall on 25/03/2015.
 */
public class Employee {
    private String name;
    private String dept;
    private int salary;
    private List<Employee> teamMembers;

    public Employee(String name, String dept, int sal) {
        this.name = name;
        this.dept = dept;
        this.salary = sal;
        teamMembers = new ArrayList<Employee>();
    }

    public void add(Employee e) {
        teamMembers.add(e);
    }

    public void remove(Employee e) {
        teamMembers.remove(e);
    }

    public List<Employee> getTeamMember() {
        return teamMembers;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Employee)) {
            return false;
        }
        else
        {
            Employee other = (Employee) obj;
            return (this.name.equals(other.name) && this.dept.equals(other.dept) && this.salary == other.salary);
        }
    }

    public String toString() {
        return ("Employee :[ Name : "+ name
                +", dept : "+ dept + ", salary :"
                + salary+" ]");
    }

}
