import java.util.*;

public class infoStudent {

    /*This contains the arrays and data variables to this class,
    you can also access this class cause its public*/
    String[] name = new String[10];
    String[] surn = new String[10];
    String[] crse = new String[10];
    Integer[]  year = new Integer[10];
    String[] gndr = new String[10];

    /*This contains the public data elements for each method to work,
    This is public cause some method reference their logic based
    on their variables*/
    boolean valid;
    boolean stay = true;
    boolean pintudan =  true;
    String input_name, input_surn, input_crse, input_gndr;
    int array_Length = surn.length; 
    int input_year;
    int sub_menu_input;
    int iteration = 0;
    int count = 0;
    int err = 0;
    Scanner read = new Scanner(System.in);
    

    public void addStudent() {

      err = 0;

      /*This if logic is for allowing the first scan for input to go
      succesfully, failing to do so will make the name and surname unreadable*/
      if(count > 10){

        if(count >= 1)
        read.nextLine();
        input();
  
  
        if(err <= 0){
  
          submen();
    
        }else{
          
          System.out.println("The array is now full you may not enter at the moment ");

  
        }

      }
        
      }

    private void input() {


      
      if(count < 0)

        pintudan  = false;

      

      valid = true;

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
        read.nextLine();
        year[iteration] = input_year;

        System.out.println("\n"+"Ender your gender"+"\n");
        input_gndr =  read.nextLine();
        gndr[iteration] = input_gndr;
        

        count++;
        iteration++;
        
    
    /* This error logic runs if it detected a string or a chracter was inserted
    instead of a number, then the for loop will remove the data that was previously typed
    in the previous array then it will add a number to the err value and it will display the error
    message, then the logic will minus the count and iteration so it will not skip an array
    then it will close the loop then it will go to the switch to see if the err
    integer is more than 0, if its more than 0 and it will not go to the method submen() and 
    just quit the overall add student class*/

    }catch (Exception a) {

      year[iteration] = 0;

      int removeIndex = count;

      for(int i = removeIndex; i < 10 -1; i++){

        name[i] = name[i + 1];

        surn[i] = surn[i + 1];

        crse[i] = crse[i + 1];

      }

        err = 1;


        
        System.out.println("\n"+"You just inputed a character/letter into a number question...are you ok?");




    }finally{

      System.out.print("\n");

    }



    }  

    private void submen() {
          
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
  
                addStudent();
      
              }
              else{
                System.out.println("Error");
              }
      
              }
  
          }catch(Exception e){
  
            System.out.println("\n"+"An error emerged.");          
            
          }finally{
            System.out.println();
  
          }
  
      }

    public void disStudent() {

        for(int c = 0; c < 10; c ++ ){
      
          if(name.equals(null)){

            System.out.println();

          }else{

            System.out.println( "\n" + surn[c] + " | " + name[c] + " | " +  crse[c] + " | " + year[c] + " | " + gndr[c]);


          }
        
       }

      }
 
    public void searchStudent() {

      boolean surnFound = false;
      boolean nameFound = false;
      boolean crseFound = false;
      boolean yearFound =  false;
      boolean gndrFound = false;
      int getYear;
      int menu_search;
      String getSurn;
      String getName;
      String getCrse;
      String getGndr;

      System.out.print("\n" + "What type of search are you trying to do?"+ "\n");
      System.out.print("\n" + "[1] By Surname" + "\n" + "[2] By Name " + "\n" + "[3] By Course" + "\n" + "[4] By Year"+ "\n"+"[5] Gender");
      System.out.print("\n");
      menu_search = read.nextInt();
      read.nextLine();
      

      switch(menu_search){
        
        case 1:

            System.out.print("Type the surname you want to search: ");
            getSurn = read.nextLine();

              for (int i = 0; i<surn.length;i++) {
                if((surn[i].equals(getSurn))) {
                  System.out.println( "\n" + surn[i] + " | " + name[i] + " | " +  crse[i] + " | " + year[i] + " | " + gndr[i]);
                    surnFound = true;
                    break;
                  }
              }
            
            if(!surnFound) System.out.print("\nSurname is not on the list\n");

        break;

        case 2:

        System.out.print("Type the name you want to search: ");
        getName = read.nextLine();

          for (int i = 0; i<name.length;i++) {
            if((name[i].equals(getName))) {
              System.out.println( "\n"+ name[i] + " | " + surn[i] + " | "  +  crse[i] + " | " + year[i] + " | " + gndr[i]);
                nameFound = true;
                break;
              }
          }
        
        if(!nameFound) System.out.print("\nSurname is not on the list\n");

        break;

        case 3:

        System.out.print("Type the course you want to search: ");
        getCrse = read.nextLine();

          for (int i = 0; i<name.length;i++) {
            if((crse[i].equals(getCrse))) {
              System.out.println( "\n" +  crse[i] + " | " + surn[i] + " | " + name[i] + " | " + year[i] + " | " + gndr[i]);
                surnFound = true;
                break;
              }
          }
        
        if(!crseFound) System.out.print("\nCourse is not on the list\n");

        break;

        case 4:

        System.out.print("Type the year you want to search: ");
        getYear = read.nextInt();

          for (int i = 0; i<name.length;i++) {
            if((year[i]==(getYear))) {
              System.out.println( "\n" + year[i] + " | " + surn[i] + " | " + name[i] + " | " +  crse[i] + " | " + gndr[i]);
                nameFound = true;
                break;
              }
          }

          if(!yearFound) System.out.print("\nYear is not on the list\n");

        break;

        case 5:

        System.out.print("Type the gender you want to search: ");
        getGndr = read.nextLine();

          for (int i = 0; i<name.length;i++) {
            if((gndr[i].equals(getGndr))) {
              System.out.println( "\n"+ gndr[i]+ " | " + surn[i] + " | " + name[i] + " | " +  crse[i] + " | " + year[i]  );
                surnFound = true;
                break;
              }
          }
        
        if(!gndrFound) System.out.print("\nCourse is not on the list\n");

        break;

        default:
        
        System.out.println("Sorry, Menu not found...try again");

       }

      }

    public void sortStudents() {
      
    int menu;
    Integer choice;
    
    System.out.print("What array do you wanna sort?");
    System.out.print("\n" + "[1] By Surname" + "\n" + "[2] By Name " + "\n" + "[3] By Course" + "\n" + "[4] By Year"+ "\n"+"[5] Gender"+"\n");
    menu = read.nextInt();

    switch(menu){

      case 1:

          Arrays.sort(surn, Comparator.nullsLast(Comparator.naturalOrder()));

          System.out.print("Sorted Surn:");
          System.out.print(Arrays.toString(surn));

      break;

      case 2:

      Arrays.sort(name, Comparator.nullsLast(Comparator.naturalOrder()));

      System.out.println("Sorted Name:");
      System.out.println(Arrays.toString(name));

      break;

      case 3:

      Arrays.sort(crse, Comparator.nullsLast(Comparator.naturalOrder()));

      System.out.println("Sorted Course:");
      System.out.println(Arrays.toString(crse));

      break;

      case 4:

      Arrays.sort(year, Comparator.nullsLast(Comparator.naturalOrder()));

      System.out.println("Sorted year:");
      System.out.println(Arrays.toString(year));

      break;

      case 5:

      Arrays.sort(gndr, Comparator.nullsLast(Comparator.naturalOrder()));

      System.out.println("Sorted Gender:");
      System.out.println(Arrays.toString(gndr));

      break;


    }

    

    }  

    }
  
