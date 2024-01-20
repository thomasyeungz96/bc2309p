public class TestSwitch {
  public static void main(String[] args) {
    int score = 70;
    char grade = ' ';
    // check if score match anyone of the following cases
    switch(score) {
      case 90: // 1, match
        grade = 'A'; // 2, execute
        break;
      case 80:
        grade = 'B';
        break;
      case 70:
        grade = 'C';
        break;
      case 60:
        grade = 'D';
        break;
      default: 
        grade = 'F';
    }
    System.out.println("The grade is " + grade);
    
    // Alternative, if-else
    if (score >= 90) {
      grade = 'A';
    } else if (score >= 80) { // 80 - 89
      grade = 'B';
    } else if (score >= 70) { // 70 - 79
      grade = 'C';
    } else if (score >= 60) { // 60 - 69
      grade = 'D';
    } else {
      grade = 'F';
    }

  }
}
