import java.util.*;

public class AddStudent extends Student {
    // To' yung di mo na kailangan mag-instantiate
    // automatic nang mag-rurun ang method
    public AddStudent() {
        inputData();
        showData();
    }

    //input method/function
    private void inputData() {
        Scanner input = new Scanner(System.in);

        for(int i = 0; i < stud.length; i++) {
            System.out.println("Input Name:");
            stud[i][0] = input.nextLine();
            System.out.println("Input Surname:");
            stud[i][1] = input.nextLine();
            System.out.println("Input Course");
            stud[i][2] = input.nextLine();
            System.out.println("Input Gender");
            stud[i][3] = input.nextLine();
        }
            
        input.close();
    }

    // show method/function
    private void showData() {
        for(int i = 0; i < stud.length; i++) {
            System.out.println(
                "Student " + i + 1 + '\n' +
                "Name: " + stud[i][0] + '\n' +
                "Surname: " + stud[i][1] + '\n' + 
                "Course: " + stud[i][2] + '\n' +
                "Gender: " + stud[i][3] + '\n'
                );
        }
    }

    // Tinatamad ako aralin ang syntax ng sort
    // Visit mo nalang tong URL para may idea ka
    // https://duckduckgo.com/?t=ffab&q=java+sort+multidimensional+array&ia=web
    public void sortData() {
        Arrays.sort(stud);
    }
}