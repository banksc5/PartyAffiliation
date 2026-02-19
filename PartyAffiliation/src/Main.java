//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(" Pick your Party, D-Democrat, R-Republican, I-Independent, or other");
        String choice = in.next();
        if (choice.equals("D")){
            System.out.println("You get a Democratic Donkey");
        }else if (choice.equals("R")){
            System.out.println("You get a Republican Elephant");
        }else if (choice.equals("I")) {
            System.out.println("You get a Independent Person");
        }else{
            System.out.println("You get other");
        }
        in.close();
    }
}