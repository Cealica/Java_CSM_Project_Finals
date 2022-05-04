import java.util.*;

public class addStudent {

    /*This contains the arrays and data variables to this class you can also access this class cause its 
    public*/
    private String[] name = new String[10];
    private String[] surn = new String[10];
    private String[] crse = new String[10];
    private int[] year = new int[10];
    private String[] gndr = new String[10];
    private boolean valid = true;
    private String input_name, input_surn, input_crse, input_gndr;
    private int array_Length = surn.length, input_year ,sub_menu_input, iteration = 0;
    private int count = 0;
    private Scanner read = new Scanner(System.in);

    public void function() {
        while(valid){
        
            try {

                System.out.println("\n"+"Enter your Name"+"\n");
                input_name = read.nextLine();
                name[iteration] = input_name;
      
                System.out.println("\n"+"Enter your Surname"+"\n");
                input_surn = read.nextLine();
                surn[iteration] = input_surn;
      
                System.out.println("\n"+"Enter your Course"+"\n");
                input_crse = read.nextLine();
                crse[iteration] = input_crse;
      
                System.out.println("\n"+"Enter your Year level (Numbers only)"+"\n");
                input_year = read.nextInt();
                year[iteration] = input_year;
      
                System.out.println("\n"+"Ender your gender"+"\n");
                input_gndr =  read.nextLine();
                read.nextLine();
                gndr[iteration] = input_gndr;
      
                count++;
                iteration++;
                break;
      

    
            }catch (Exception a) {
        
                System.out.println("\n"+"A stupid mother fucker just inputed a letter in this fucking thing, i didn't think people can be dumber but here you are!");
                break;
      
              }finally{
      
                System.out.println();

            }
        }

        try{
    
            while(valid){
  
              System.out.println("\n"+"Press 1 to input and press 0 to exit"+"\n"+"\n"+"[1]Add"+"\n"+"[0]Exit"+"\n");
  
              sub_menu_input = read.nextInt();
      
              if(count == array_Length){
      
                System.out.println("The array is now full you may not enter now ");
      
                valid = false;
      
              }
              else if(sub_menu_input == 0){
      
                System.out.println("\n"+"Data input is now closed");
      
                valid = false;
      
              }
              else if(sub_menu_input == 1){   
      
                valid = true;
      
              }
              else{
                System.out.println("Error");
              }
      
              }
  
          }catch(Exception e){

            System.out.println("a retard just put a word/letter into a number based question. what a fucking retard :)");

          }finally{
            System.out.println();

          }
    }
}