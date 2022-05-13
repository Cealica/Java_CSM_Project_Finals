import java.util.*;

public class StudMainProgram {

  public static void main(String[] args) {

    Scanner data = new Scanner(System.in);

    try  {

      //data variables
      int menu;
      int loop = 0;
      //clasess
      infoStudent s = new infoStudent(); 

      do{
        
        try {
          
                  /*This error will appear if the you choose 
                  above 1 while going back to the main menu*/
        
        if (loop > 1 || loop < -0){
          System.out.println(" " + "\n" + "Err: No."+ loop +" not found, Closing program.");
          break;
        }

      //main menu output
        
      System.out.println(" " + "\n" + "Student Record Program" + "\n" + " ");
      
      System.out.println("[1] Add Student " + "\n" + "[2] Display Student Record" + "\n" + "[3] Search a Record" + "\n" + "[4] Sort Student Record" +"\n"+"[5] Exit the program");
      
      System.out.print(" " + "\n" + "Enter your choice:  ");
      menu = data.nextInt();

        //Main Menu
      
        switch (menu) {
            
          case 1:
            
            s.addStudent();

          break;
            
          case 2:
            
            s.disStudent();
            
          break;
 
          case 3:
            
            s.searchStudent();
            
          break;
            
          case 4:
            
          s.sortStudents();
          
          break;

          case 5:

          System.out.print("Goodbye!");

          loop = 1;

          break;

          default:
              System.out.println("\n" + "\n" + "Menu No." + menu + " not avaliable");
        }

        } catch (Exception e) {
          
          System.out.print("\n"+"uh..oh...seems a stupid person has been using my program");

          loop = 0;

        }
      
      }while(loop != 1);

    } finally {

      System.out.print("\n");

    }
    
    data.close();

  }
  
}