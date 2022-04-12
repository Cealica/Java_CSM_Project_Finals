import java.util.*;

public class CSM_Project {

  public static void addStudent() {
    Scanner read  = new Scanner(System.in);

    String[] name = new String[10];
    String[] surn = new String[10];
    String[] crse = new String[10];
    int[] year = new int[10];
    String[] gndr = new String[10];
    String ans;
    boolean valid = true;
    String input_name, input_surn, input_crse, input_gndr;
    int array_Length = surn.length, input_year ,sub_menu_input, iteration = 0;
    int count = 0;


    while(valid){
      System.out.println("Press 1 to input and press 0 to exit"+"\n"+"[1]Add"+"\n"+"[0]Exit");

      sub_menu_input = read.nextInt();

      if(count == array_Length){

        System.out.println("The array is now full you may not enter now ");

        valid = false;

      }
      else if(sub_menu_input == 0){

        System.out.println("Data input is now closed");

        valid = false;

      }
      else if(sub_menu_input == 1){   

        valid = true;

      }
      else{
        System.out.println("Error");
      }

      while(valid){

        System.out.println("Enter your Name");
        input_name = read.nextLine();
        read.nextLine();
        name[iteration] = input_name;

        System.out.println("Enter your Surname");
        input_surn = read.nextLine();
        surn[iteration] = input_surn;

        System.out.println("Enter your Course");
        input_crse = read.nextLine();
        crse[iteration] = input_crse;

        System.out.println("Enter your Year level (Numbers only)");
        input_year = read.nextInt();
        year[iteration] = input_year;

        System.out.println("Ender your gender");
        input_gndr =  read.nextLine();
        read.nextLine();
        gndr[iteration] = input_gndr;

        count++;
        iteration++;
        break;

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