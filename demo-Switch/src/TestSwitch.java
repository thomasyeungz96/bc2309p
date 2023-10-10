public class TestSwitch {
  public static void main (String[] args){
    int score = 90;
    char grade = ' '; 
    // check if score match anyone of the folling cases
    switch(score) { 
      case 90: // 1, match case 無得大過 細過 要指定
        grade = 'A'; // 2, execute
        break;
        // System.out.println("case 90");
      case 80:
      grade = 'B'; 
      break;
      // System.out.println("case 80");
      case 70:
      grade = 'C'; 
      break;
      // System.out.println("case 70");
      case 60:
      grade = 'D'; 
      break;
      // System.out.println("case 60");
      default: 
        grade = 'F';
        // System.out.println("default case");
    }
    System.out.println("The grade is " + grade); // 

    // Alternatice, if-else
    if (score >= 90) {
      grade = 'A';
      } else if (score >= 80 ) { // 80 - 89
        grade = 'B';
      } else if (score >= 70 ) { // 70 - 79
        grade = 'C';
      } else if (score >= 60 ) { // 60 - 69
        grade = 'D';
      } else {
        grade = 'F';
      }
      System.out.println(grade);

    }
  }
