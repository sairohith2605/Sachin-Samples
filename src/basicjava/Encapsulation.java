/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package basicjava;

/**
 *
 * @author MC Rohith
 */

/*Class - 2 types
 *  -> public
 *  -> protected
 * 
 */
public class Encapsulation {
    
    String s;
    private String Name;
    //Private instance variable
    
    public void setName(String nm)
    {
        Name = nm;
        //print(Name);
    }
    //Called function
    public String getName()
    {
        return Name;
    }
    
    private void print(String namex)
    {
        System.out.println(namex);
    }
    
    //Setter - Getter methods
}
