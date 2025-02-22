import java.util.*;
public class GradeCalci
 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);


        System.out.println("Enter Student's Name: ");
        String name=sc.nextLine();

        System.out.println("Enetr marks in Mathmatics: ");
        double mathmaticsMarks =sc.nextDouble();

        System.out.println("Enetr marks in Science: ");
        double scienceMarks =sc.nextDouble();

        System.out.println("Enetr marks in English: ");
        double englishMarks =sc.nextDouble();

        System.out.println("Enetr marks in Hindi: ");
        double hindiMarks =sc.nextDouble();

        System.out.println("Enetr marks in SocialScience: ");
        double socialMarks =sc.nextDouble();

        double totalMarks=mathmaticsMarks+scienceMarks+englishMarks+hindiMarks+socialMarks;
        double percentage=(totalMarks/500)*100;

        System.out.println("\n Student Name :"+name);
        System.out.println("\n Total Marks :"+totalMarks);
        System.out.println("Percentage :"+percentage);

        if (percentage >= 90) {
            System.out.println("Grade: A+");
        } else if (percentage >= 80) {
            System.out.println("Grade: A");
        } else if (percentage >= 70) {
            System.out.println("Grade: B+");
        } else if (percentage >= 60) {
            System.out.println("Grade: B");
        } else if (percentage >= 50) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: F");
        }


    }
    
}
