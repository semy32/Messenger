/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package messenger;

/**
 *
 * @author Diak
 */
public class Message implements Comparable<Message>{
    private String message;
    private User sender;
    private User sendto;

    public Message(String message, User sender, User sendto) {
        this.message = message;
        this.sender = sender;
        this.sendto = sendto;
    }

    @Override
    public String toString() {
        return  "Sender: " + sender + " \nMessage: " + message + "\n"; 
    }

    @Override
    public int compareTo(Message t) {
        return this.sender.toString().compareTo(t.sender.toString());
    }
    
    
}
