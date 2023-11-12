package lab3.BSUIR.IKT.Number5;//5

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws WrongLoginException, WrongPasswordException {
        boolean t = true;
        String login, password;
        Scanner s = new Scanner(System.in);
        try {
            System.out.print("Enter ur login - ");
            login = s.nextLine();
            if (!((login.length() <= 20) && (login.matches("^[a-zA-Z0-9-_]+$"))))
                throw new WrongLoginException("Login is incorrect");
            System.out.print("Enter ur password - ");
            password = s.nextLine();
            if (!((password.length() <= 20) && (password.matches("^[a-zA-Z0-9-_]+$"))))
                throw new WrongPasswordException("Password is incorrect");
        } catch (WrongLoginException | WrongPasswordException e) {
            throw new RuntimeException(e);
        }

        System.out.print("Confirm ur password - ");
        String confirmPassword = s.nextLine();
        while (t) {
            if (!password.equals(confirmPassword)) {
                System.out.println("Problem with confirm password, try again");
                System.out.print("Confirm ur password - ");
                confirmPassword = s.nextLine();
            }
            else
                t = false;
        }
        System.out.print("Ur login - " + login + "\nUr password - " + password);
    }
}


