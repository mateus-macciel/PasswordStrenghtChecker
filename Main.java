import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.io.File;

class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your password: ");
        String password = scanner.nextLine();
        scanner.close();

        int score = 0;
        score += Checker.lengthCheck(password);
        score += Checker.uppercaseCheck(password);
        score += Checker.lowercaseCheck(password);
        score += Checker.digitCheck(password);
        score += Checker.commonWordsCheck(password);
        score += Checker.patternCheck(password);

        if (score <= 2) {
            System.out.println("Weak password.");
        } else if (score <= 4) {
            System.out.println("Moderate password.");
        } else {
            System.out.println("Strong password.");
        }
    }
}

class Checker{

    public static int lengthCheck(String password){
        if (password.length() < 8){
            return 0;
        } else if (password.length() >= 8){
            return 1;
        }
        return -1;
    }

    public static int uppercaseCheck(String password){
        Pattern pattern = Pattern.compile("[A-Z]");
        Matcher matcher = pattern.matcher(password);
        boolean matchFound = matcher.find();
        if(matchFound){
            return 1;
        } else {
            return 0;
        }
    }

    public static int lowercaseCheck(String password){
        Pattern pattern = Pattern.compile("[a-z]");
        Matcher matcher = pattern.matcher(password);
        boolean matchFound = matcher.find();
        if(matchFound){
            return 1;
        } else {
            return 0;
        }
    }

    public static int digitCheck(String password){
        Pattern pattern = Pattern.compile("[0-9]");
        Matcher matcher = pattern.matcher(password);
        boolean matchFound = matcher.find();
        if(matchFound){
            return 1;
        } else {
            return 0;
        }
    }

    public static int commonWordsCheck(String password){
        File file = new File("common.txt");

        try(Scanner scanner = new Scanner(file)){
            while(scanner.hasNextLine()){
                String data = scanner.nextLine();
                if(password.toLowerCase().contains(data.toLowerCase())){
                    return 0;
                }
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        return 1;
    }

    public static int patternCheck(String password){
        Pattern pattern = Pattern.compile("(.)\\1{2,}");
        Matcher matcher = pattern.matcher(password);
        boolean matchFound = matcher.find();
        if(matchFound){
            return 0;
        } else {
            return 1;
        }
    }
}