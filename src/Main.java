import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean isOnRepeat = true;
        while(isOnRepeat){
            System.out.println("Playing current song");
            System.out.println("would you like to take this song off the repeat?");
            String userInput = input.next();

            if(userInput.equals("yea")){
                isOnRepeat = false;
            }





        }
        System.out.println("Playing next song");
    }

}
