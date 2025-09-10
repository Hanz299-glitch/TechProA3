public class Main {
  public static void main (String [] args) {
  	System.out.println("SeatworkEight");
    
      int  grade = 4;
      switch(grade) {
        case 1 :
          System.out.println("Excellent!");
          break;
        case 2 :
        case 3 :
          System.out.println("Well Done!");
          break;
        case 4 :
          System.out.println("You Passed!");
          break;
        case 5 :
          System.out.println("Better Try Again!");
          break;
        default :
          System.out.println("Invalid Grade");
    }
  System.out.println("Your Grade " + grade);
  }
}
