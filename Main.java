import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner data  = new Scanner(System.in);

    //Data Variable
    int menu;
    int loop = 0;

    do{
      
      //Error message logic
      
      if (loop > 1 || loop < -0){
        System.out.println(" " + "\n" + "Err: No."+ loop +" not found");
        break;
      }

    //main menu output
      
    System.out.println(" " + "\n" + "Student Record Program" + "\n" + " ");
    
    System.out.println("[1] Add Student " + "\n" + "[2] Display Student Record" + "\n" + "[3] Search a Record" + "\n" + "[4] Sort Student Record" );
    
    System.out.print(" " + "\n" + "Enter your choice:  ");
    menu = data.nextInt();

      //sub menu 
    
      switch (menu) {
          
        case 1:
          
          System.out.println("" + "\n" + "Adding Student");
          
          System.out.println("" + "\n" + "[0] Go back to main menu" + "\n" + "[1] End the program");

          System.out.print(" " + "\n" + "Enter your choice:  ");
            loop = data.nextInt();
          
        break;
          
        case 2:
          
          System.out.println("" + "\n" + "Display Student Record");

          System.out.println("" + "\n" + "[0] Go back to main menu" + "\n" + "[1] End the program");

          System.out.print(" " + "\n" + "Enter your choice:  ");
          loop = data.nextInt();
          
        break;
  
        case 3:
          
          System.out.println("" + "\n" + "Searching");

          System.out.println("" + "\n" + "[0] Go back to main menu" + "\n" + "[1] End the program");

          System.out.print(" " + "\n" + "Enter your choice:  ");
          loop = data.nextInt();
          
        break;
          
        case 4:
          
          System.out.println("" + "\n" + "Sorting");

          System.out.println("" + "\n" + "[0] Go back to main menu" + "\n" + "[1] End the program");

          System.out.print(" " + "\n" + "Enter your choice:  ");
          loop = data.nextInt();
          
        break;

        default:
            System.out.println(" " + "\n" + "Menu No." + menu + " not avaliable");
      }
    
    }while(loop != 1);
      
  }
  
}