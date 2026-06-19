
public class StudentMarks {
    public static void main(String[] args) {

        // Store 5 student marks in an array
        int[] marks = {72,121,60,62,68,24};

        int total = 0;
        int highest = marks[0];

        // Display all marks, calculate total, and find highest mark
        System.out.println("Student Marks:");

        for (int mark : marks) {
            System.out.println(mark);

            total += mark;

            if (mark > highest) {
                highest = mark;
            }
        }

        System.out.println("\nTotal Marks = " + total);
        System.out.println("Highest Mark = " + highest);
    }
}
