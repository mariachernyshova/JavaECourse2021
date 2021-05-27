package classwork.sample;

public class Main {

    public static void main(String[] args) {
        Employee firstEmployee = new Employee("Chief", 1000000);
        Company myCompany = new Company("DreamCompany");

        //создаем головной отдел и добавляем туда шефа
        Department department = new Department("head");
        department.addEmployee(firstEmployee);

        //добавляем отдел в компанию
        myCompany.addDepartment(department);
    }
}