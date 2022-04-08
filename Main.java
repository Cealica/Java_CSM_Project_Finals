import java.util.*;

public class Main {

  public static void addStudent() {
    Scanner read  = new Scanner(System.in);

    String[] name = new String[10];
    String[] surn = new String[10];
    String[] crse = new String[10];
    int[] year = new int[10];
    String[] gndr = new String[10];
    String ans;
    
    for(int x = 0; x < 10; x++){
      
      System.out.print("Enter The first and middle name of the student: ");
      
      for(int n = 0; n < 10; n++){
        
        name[n] = read.nextLine();

          System.out.print("Enter the Surname name of the student: ");

            for(int s = 0; s < 10; s++){

              surn[s] = read.nextLine();
              
               System.out.print("Enter the Course name of the student: ");

                for(int c = 0; c < 10; c++){
                  
                  crse[c] = read.nextLine();

                    System.out.print("Enter the Year name of the student(Number Only): ");

                     for(int y = 0; y < 10; y++){

                        year[y] = read.nextInt();
                                  read.nextLine();
                        
                         System.out.print("Enter the Gender name of the student: ");

                           for(int g = 0; g < 10; g++){

                             gndr[g] = read.nextLine();

                              System.out.print("Do you still want to continue: ");
                               
                                  ans = read.nextLine();
        
                                    if(ans.equalsIgnoreCase("yes")){
                                    continue;
                                  } else if (ans.equalsIgnoreCase("no")){
                                    break;
                                  }else;
                                      System.out.println("error cannot found");
                            
              }
            }
          }  
        }
      }
    }
            
  }
  
  public static void main(String[] args) {
    Scanner data  = new Scanner(System.in);

    //Data Variable
    
    int menu;
    int loop = 0;

    do{
      
      //Error message logic
      
      if (loop > 1 || loop < -0){
        System.out.println(" " + "\n" + "Err: No."+ loop +" not found, Closing program.");
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
          
          addStudent();
          
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