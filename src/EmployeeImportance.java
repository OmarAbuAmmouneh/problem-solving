import java.util.List;

class EmployeeImportance {

    class Employee {
        public int id;
        public int importance;
        public List<Integer> subordinates;
    }
    private int importance = 0;
    public int getImportance(List<Employee> employees, int id) {
        if (employees.size() == 0) {
            return 0;
        }

        Employee emp = findEmployee(employees, id);
        handleSubordinates(employees, emp);
        return importance;
    }

    private Employee findEmployee(List<Employee> employees, int id) {
        for (Employee e: employees) {
            if (e.id == id) {
                importance += e.importance;
                return e;
            }
        }
        return null;
    }

    private void handleSubordinates(List<Employee> employees, Employee employee) {
        if (employee.subordinates == null) {
            return;
        }
        // We loop over them and if they have subordinates // we call the function again

        for (int i = 0; i < employee.subordinates.size(); i++) {
            Employee emp = findEmployee(employees, employee.subordinates.get(i));
            handleSubordinates(employees, emp);
        }

    }
}