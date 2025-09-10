class Student {
    String name;
    int rollNumber;
    int marks;

    String grade() {
        if (marks >= 90) return "A";
        if (marks >= 75) return "B";
        if (marks >= 60) return "C";
        return "D";
    }

    void display() {
        System.out.println("Name : " + name);
        System.out.println("Roll : " + rollNumber);
        System.out.println("Marks : " + marks);
        System.out.println("Grade : " + grade());
    }
}