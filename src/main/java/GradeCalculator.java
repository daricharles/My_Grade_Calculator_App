// import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Scanner;

// import org.junit.jupiter.api.Test;

public class GradeCalculator {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Enter your grade score here: ");

    int grade = scan.nextInt();
    char gradeScore;
    
    if (grade >= 90){
      gradeScore = 'A';
    }
    else if (grade >= 80){
      gradeScore = 'B';
    }
    else if (grade >= 70){
      gradeScore = 'C';
    }
    else if (grade >= 60){
      gradeScore = 'D';
    }
    else{
      gradeScore = 'F';
    }

    System.out.println("The letter to your grade score is: " + gradeScore);

    scan.close();

  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}