public class EmployeeLinkedListTest {

    public static void main(String[] args) {
        EmployeeLinkedList list = new EmployeeLinkedList();

        // Create some Employee objects
        Employee employee1 = new Employee("Alice", 30);
        Employee employee2 = new Employee("Bob", 25);
        Employee employee3 = new Employee("Charlie", 35);

        // Add employees to the list
        list.AddToFront(employee1);
        list.AddToFront(employee2);
        list.AddToFront(employee3);

        // Print list size and check if list is empty
        System.out.println("Size of list: " + list.getSize()); // Output: Size of list: 3
        System.out.println("Is list empty? " + list.IsEmpty()); // Output: Is list empty? false

        // Remove employees from the front and print their details
        EmployeeNode removedNode = list.RemoveFromFront();
        System.out.println("Removed employee: " + removedNode.getEmployee().getName() + ", Age: " + removedNode.getEmployee().getAge()); // Output: Removed employee: Charlie, Age: 35

        removedNode = list.RemoveFromFront();
        System.out.println("Removed employee: " + removedNode.getEmployee().getName() + ", Age: " + removedNode.getEmployee().getAge()); // Output: Removed employee: Bob, Age: 25

        removedNode = list.RemoveFromFront();
        System.out.println("Removed employee: " + removedNode.getEmployee().getName() + ", Age: " + removedNode.getEmployee().getAge()); // Output: Removed employee: Alice, Age: 30

        // Print list size and check if list is empty again
        System.out.println("Size of list: " + list.getSize()); // Output: Size of list: 0
        System.out.println("Is list empty? " + list.IsEmpty()); // Output: Is list empty? true
    }
}
