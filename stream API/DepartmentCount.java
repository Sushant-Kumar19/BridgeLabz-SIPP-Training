import java.util.*;
import java.util.stream.*;

class Employee {
    int id;
    String name, dept;

    Employee(int id, String name, String dept) {
        this.id = id;
        this.name = name;
        this.dept = dept;
    }
}

public class DepartmentCount {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(1, "Alice", "IT"),
                new Employee(2, "Bob", "Finance"),
                new Employee(3, "Charlie", "IT"),
                new Employee(4, "David", "HR"),
                new Employee(5, "Eve", "Finance"));

        Map<String, Long> deptCount = employees.stream()
                .collect(Collectors.groupingBy(e -> e.dept, Collectors.counting()));

        System.out.println(deptCount);
    }
}
