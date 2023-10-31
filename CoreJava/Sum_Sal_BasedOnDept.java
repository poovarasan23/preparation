package CoreJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Sum_Sal_BasedOnDept {
    public static void main(String[] args) {
        List<Eployeee> empList = new ArrayList<>();
        empList.add(new Eployeee("debashree", 10000, "IT"));
        empList.add(new Eployeee("pratap", 20000, "Tech"));
        empList.add(new Eployeee("xyz", 15000, "IT"));
        empList.add(new Eployeee("abc", 30000, "Xyz"));

        AtomicInteger sumSalary = new AtomicInteger();
        // System.out.println(empList.stream().filter(e -> e.getDepartment().equals("IT")).collect(Collectors.summarizingInt(CoreJava.Eployeee::getSalary)));

        System.out.println("one :" + empList.stream().filter(e -> e.getDepartment().equals("IT")).mapToInt(Eployeee::getSalary).sum());

        empList.stream().filter(e -> e.getDepartment().equals("IT")).forEach(emp -> sumSalary.addAndGet(emp.getSalary()));

        System.out.println("sumSalary: " + sumSalary);
        int[] arr = {5, 4, 1, 7, -8, -9};

        System.out.println(arr);

        int[] actualARR = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            actualARR[i] = arr[i];
        }

        Arrays.sort(arr);
        int sumGood = 0;
        int sumBad = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == actualARR[i])
                sumGood = sumGood + arr[i];
            else
                sumBad = sumBad + arr[i];

        }
        System.out.println(sumGood - sumBad);

    }
}


class Eployeee {

    private String name;
    private int salary;
    private String department;

    public Eployeee(String name, int salary, String department) {
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
