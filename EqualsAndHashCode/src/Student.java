public class Student implements Comparable<Student> {
    private int number;
    private String name;
    private String address;

    public Student(int number, String name, String address) {
        this.number = number;
        this.name = name;
        this.address = address;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override()
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        return (this.number == ((Student) obj).number); //have to cast as Student
    };

    @Override()
    public int hashCode() {
        return this.number;
    }

    @Override
    public int compareTo(Student o) {
        return this.number - o.number;
    }

    public String toString() {
        return "Student: " + this.name + "; Number: " + this.number + "; Address: " + this.address;
    }
}
