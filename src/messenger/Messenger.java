/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package messenger;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author Diak
 */
public class Messenger {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Map<String,User> users = new TreeMap<>();      
        Scanner scan = new Scanner(System.in);
        users.put("a1@a.a", new User("a1@a.a","Teszter a") );
        users.put("a2@a.a", new User("a2@a.a","Teszter b") );
        boolean exit = true;
        boolean exitFromUser = true;
        while(exit){
            exit = true;
            
        System.out.println("Bejelentkezési e-mail: (Kilépéshez hagyja üresen)");
        
       String email = scan.nextLine();
        
        if(!(email.equals(""))){
            if(users.containsKey(email)){
                exitFromUser = true;
                while(exitFromUser){
                    
                    System.out.println(users.get(email).showMessages());
                System.out.println("Üzenet küldése? (Y/N)");
                String choice = scan.nextLine();
                if(choice.toUpperCase().equals("Y")){
                    System.out.println("Címzett email cime: ");
                    String SendToMail = scan.nextLine();
                    System.out.println("A cimzett neve: " + users.get(SendToMail).toString());
                    System.out.println("Adja meg az üzenetet: ");
                    String message = scan.nextLine();
                    users.get(email).newOutMessage(new Message(message,users.get(email),users.get(SendToMail)));
                    users.get(SendToMail).newincMessage(new Message(message,users.get(email),users.get(SendToMail)));
                }
                else{
                exitFromUser = false;
                }
                }
                
                
            }
            else{
                System.out.println("Adja meg felhasználónevét! ");
            users.put(email, new User(email,scan.nextLine()));
            }
        }
        else{
        exit = false;
        }
        }
        
    }
    
}
