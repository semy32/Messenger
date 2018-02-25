/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package messenger;

import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Diak
 */
public class User {
    private String email;
    private String username;
    private Set<Message> incMessage;
    private Set<Message> OutMessage;

    public User(String email, String username) {
        this.email = email;
        this.username = username;
        this.incMessage = new TreeSet<>();
        this.OutMessage = new TreeSet<>();
    }

  
    
    public void newincMessage(Message message){
        this.incMessage.add(message);
    }
    public void newOutMessage(Message message){
        this.OutMessage.add(message);
    
   }

    @Override
    public String toString() {
        return this.username;
    }
    public String showMessages(){
        String endmessage = "";
        if(this.incMessage != null){
            endmessage += this.incMessage.toString();
        }
        if(this.OutMessage != null){
            endmessage += this.OutMessage.toString();
        }
    return endmessage;
    
    
    }

    
    
    
}
