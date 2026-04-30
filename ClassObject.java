public class ClassObject {

    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student();

        s1.insertRecord(101, "Deepak");
        s2.insertRecord(102, "Rahul");

        s1.displayInformation();
        s2.displayInformation();
    }
}
class Student {

    int rollNo;
    String name;

    void insertRecord(int r, String n) {
        rollNo = r;
        name = n;
    }

    void displayInformation() {
        System.out.println(rollNo + " " + name);
    }
}

