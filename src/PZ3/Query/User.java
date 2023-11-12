package PZ3.Query;

import javax.management.Query;
import java.util.Queue;

public class User {
    private String login, password;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    class Query{

        void printToLog(){
            System.out.println("Login is " + login + "\nPassword is " + password);
        }
    }


    void createQuery(){
        Query query = new Query();
        query.printToLog();
    }
}

class Main{
    public static void main(String[] args) {
        User user = new User("LOgin", "PAassword");
        user.createQuery();
        User user1 = new User("login", "password");
        User.Query query = user1.new Query();
        query.printToLog();
        User.Query query1 = new User("last", "last").new Query();
        query1.printToLog();
        
    }
}
