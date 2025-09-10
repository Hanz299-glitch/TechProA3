public class Main {
  public static void main(String [] args) {
  	System.out.println("SeatworkSeven");
    char grade = 'D';

    switch (grade) {
      case 'A':
        System.out.println("Excellent!");
        break;
      case 'B':
        System.out.println("Good Job!");
        break;
      case 'C':
        System.out.println("Well Done!");
        break;
      case 'D':
        System.out.println("You Passed!");
        break;
      case 'F':
        System.out.println("Better try again!");
        break;
      default :
        System.out.println("Invalid Grade");
    }
    System.out.println("Your Grade " + grade);
  }
}
