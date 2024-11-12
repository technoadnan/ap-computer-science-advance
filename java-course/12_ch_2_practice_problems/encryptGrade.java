import java.util.Scanner;

public class EncryptGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        char grade = 'A';
        System.out.println("Enter the grade of the student");
        char grade = sc.next().charAt(0);
//        type casting & encrypt
        grade = (char)(grade + 8);
//        Decrypt
        grade = (char)(grade - 8);
        System.out.printf("The grade of the student is %c", grade);
        sc.close();



    }
}
