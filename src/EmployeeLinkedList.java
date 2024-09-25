class EmployeeLinkedList {
    private EmployeeNode Head;
    private int Size;

    public void AddToFront(Employee employee) {
        EmployeeNode newEmployee = new EmployeeNode(employee);
        newEmployee.setNext(Head);
        Head = newEmployee;
        Size++;
    }

    public boolean IsEmpty() {
        return Head == null;
    }

    public EmployeeNode RemoveFromFront() {
        if (IsEmpty()) return null;
        EmployeeNode RemovedNode = Head;
        Head = RemovedNode.getNext();
        RemovedNode.setNext(null);
        Size--;
        return RemovedNode;
    }

    public int getSize() {
        return Size;
    }
}

class Employee {
    private String Name;
    private int Age;

    public Employee(String name, int age) {
        this.Name = name;
        this.Age = age;
    }

    public String getName() {
        return Name;
    }

    public int getAge() {
        return Age;
    }
}

class EmployeeNode {
    private Employee Employee;
    private EmployeeNode Next;
    private EmployeeNode Previous;

    public EmployeeNode(Employee employee) {
        this.Employee = employee;
    }

    public Employee getEmployee() {
        return Employee;
    }

    public EmployeeNode getNext() {
        return Next;
    }

    public void setNext(EmployeeNode next) {
        Next = next;
    }

    public EmployeeNode getPrevious() {
        return Previous;
    }

    public void setPrevious(EmployeeNode previous) {
        Previous = previous;
    }
}

class EmployeeDoublyLinkedList {
    private EmployeeNode Head;
    private EmployeeNode Tail;
    private int Size;

    public EmployeeNode getHead() {
        return Head;
    }

    public void setHead(EmployeeNode head) {
        Head = head;
    }

    public EmployeeNode getTail() {
        return Tail;
    }

    public void setTail(EmployeeNode tail) {
        Tail = tail;
    }

    public int getSize() {
        return Size;
    }

    public void setSize(int size) {
        Size = size;
    }

    public boolean IsEmpty() {
        return Head == null;
    }

    public void AddToFront (Employee employee) {
        EmployeeNode newEmployee = new EmployeeNode(employee);
        if (IsEmpty()) {
            Tail = newEmployee;
        } else {
            newEmployee.setNext(Head);
            Head.setPrevious(newEmployee);
        }
        Head = newEmployee;
        Size++;
    }

    public EmployeeNode RemoveFromFront () {
        if (IsEmpty()) return null;

        EmployeeNode removedNode = Head;
        if (removedNode.getNext() != null) {
            removedNode.getNext().setPrevious(removedNode.getPrevious());
        }
        Head = removedNode.getNext();
        removedNode.setNext(null);
        Size--;
        return removedNode;
    }

    public void AddToEnd (Employee employee) {
        EmployeeNode newEmployee = new EmployeeNode(employee);
        if (IsEmpty()) {
            Head = newEmployee;
        } else {
            newEmployee.setPrevious(Tail);
            Tail.setNext(newEmployee);
        }
        Tail = newEmployee;
        Size++;
    }

    public EmployeeNode RemoveFromEnd () {
        if (IsEmpty()) return null;

        EmployeeNode removedNode = Tail;
        if (removedNode.getPrevious() != null) {
            removedNode.getPrevious().setNext(removedNode.getNext()); // or just null
        }
        Tail = removedNode.getPrevious();
        removedNode.setPrevious(null);
        Size--;
        return removedNode;
    }
}
