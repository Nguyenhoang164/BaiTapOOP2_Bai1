public class People {
    private String name;
    private boolean gender;
    private int age;

    public People() {
        this.name = "Tên mặc định";
        this.gender = false;
        this.age = 0;
    }

    public People(String name, boolean gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void eat() {
        System.out.println("People eating......");
    }

    public void sleep(){
        System.out.println("Sleeping.....");
    }

    @Override
    public String toString() {
        return "A people with name: "
                + getName()
                + ", age: "
                + getAge()
                + " and gender: "
                + (isGender() ? "Nam" : "Nữ");
    }
}
class PeopleTest {
    public static void main(String[] args) {
        People people = new People();
        System.out.println(people);
        people = new People("Nguyen Van C", false, 18);
        System.out.println(people);
        people.setAge(20);
        System.out.println(people);

    }
}
 class Student extends People {
    private String className;

    public Student(){
        super();
        this.className = "D101_C1K14";
    }

    public Student(String className){
        super();
        this.className = className;
    }

    public Student(String name, boolean gender, int age, String className) {
        super(name, gender, age);
        this.className = className;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public void study() {
        System.out.println("Learning code.......");
    }

    @Override
    public String toString() {
        return "A student with class name: "
                + getClassName()
                + " ,which is a subclass of "
                + super.toString();
    }
}
class StudentTest {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student);

        student = new Student("D101_C2K14");
        System.out.println(student);

        student = new Student("Ta Van A", false, 23, "IBSK1D1");
        System.out.println(student);
    }
}
 class Employee extends People {
    private String enterprise;

    public Employee(){
        super();
        this.enterprise = "CodeGym";
    }

    public Employee(String enterprise){
        super();
        this.enterprise = enterprise;
    }

    public Employee(String name, boolean gender, int age, String enterprise) {
        super(name, gender, age);
        this.enterprise = enterprise;
    }

    public String getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(String enterprise) {
        this.enterprise = enterprise;
    }

    public void work() {
        System.out.println("Working.......");
    }

    @Override
    public String toString() {
        return "A employee work at: "
                + getEnterprise()
                + " ,which is a subclass of "
                + super.toString();
    }
}
 class EmployeeTest {
    public static void main(String[] args) {
        Employee employee = new Employee();
        System.out.println(employee);
        employee = new Employee("Nguyen Thi A", true, 21, "FPT");
        System.out.println(employee);
        employee.work();
        employee.setEnterprise("Viettel");
        System.out.println(employee);
    }
}






