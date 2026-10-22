import java.util.Scanner;

public class madLibs {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        String gstr1 = "Hi, my name is";
        String gstr2 = "and I live in the really cool town of";
        String gstr3 = ". I have a pet";
        String gstr4 = "whose name is";
        String gstr5 = "and I my favorite thing to do is";
        String gstr6 = "and I like sleeping.";
        System.out.println(gstr1 + " ___ " + gstr2 + " ___ " + gstr3 + " ___ " + gstr4 + " ___ " + gstr5 + " ___ " + gstr6);
        System.out.println("Enter what you would like to insert into the first blank here: ");
        String blank1 = scanner.nextLine();
        System.out.println("Enter what you would like to insert into the second blank here: ");
        String blank2 = scanner.nextLine();
        System.out.println("Enter what you would like to insert into the third blank here: ");
        String blank3 = scanner.nextLine();
        System.out.println("Enter what you would like to insert into the fourth blank here: ");
        String blank4 = scanner.nextLine();
        System.out.println("Enter what you would like to insert into the fifth blank here: ");
        String blank5 = scanner.nextLine();
        System.out.println(gstr1 + " " + blank1 + " " + gstr2 + " " + blank2 + gstr3 + " " + blank3 + " " + gstr4 + " " + blank4 + " " + gstr5 + " " + blank5 + " " + gstr6);
        scanner.close();
    }
}
