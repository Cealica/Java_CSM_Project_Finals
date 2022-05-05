import java.util.*;

public class addStudent {

    /*This contains the arrays and data variables to this class you can also access this class cause its 
    public*/
    String[] name = new String[10];
    String[] surn = new String[10];
    String[] crse = new String[10];
    int[] year = new int[10];
    String[] gndr = new String[10];
    boolean valid = true;
    boolean stay = true;
    String input_name, input_surn, input_crse, input_gndr;
    int array_Length = surn.length, input_year ,sub_menu_input, iteration = 0;
    int count = 0;
    int err = 0;
    Scanner read = new Scanner(System.in);

    public void function() {

        while(valid){
        
            try {

                System.out.println("\n"+"Enter your Name"+"\n");
                input_name = read.nextLine();

                /*This is for subcalling so you can input a name if 
                the function() method has been called again*/
                if(count == 1)
                  read.nextLine();

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
            
            /* This error logic runs if it detected a string or a chracter was inserted
            instead of a number then it will add a number to the err value and it will display the error
            message and it will close the loop then it will go to the switch to see if the err
            integer is more than 0, if its more than 0 and it will not go to the method submen() and 
            just quit the overall add student class*/

            }catch (Exception a) {

                err = 1;
                
                System.out.println("\n"+"A stupid mother fucker just inputed a letter in this fucking thing, i didn't think people can be dumber but here you are!");

                break;
      

          switch(err){

            case 0:

              submen();

            case 1:
                
          }

      }

      
    private  void submen() { 
        
        try{
    
          while(valid){

            System.out.println("\n"+"Press 1 to input and press 0 to exit"+"\n"+"\n"+"[1]Add"+"\n"+"[0]Exit"+"\n");

            sub_menu_input = read.nextInt();
    
            if(count == array_Length){
    
              System.out.println("The array is now full you may not enter at the moment ");
    
              valid = false;
    
            }
            else if(sub_menu_input == 0){
    
              System.out.println("\n"+"Data input is now closed");
    
              valid = false;
    
            }
            else if(sub_menu_input == 1){   
    
              valid = true;

              stay = false;

              function();
    
            }
            else{
              System.out.println("Error");
            }
    
            }

        }catch(Exception e){

          System.out.println("\n"+"a retard just put a word/letter into a number based question. what a fucking retard :)");          
          
        }finally{
          System.out.println();

        }

      }

    }
