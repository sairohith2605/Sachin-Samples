/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package basicjava;

/**
 *
 * @author MC Rohith
 */
public class ClassBasic {
    
    String name;
    int roll;
    
    public ClassBasic(String name1, int roll1)
    {
        name = name1;
        roll = roll1;
    }
    
    public void printDetails()
    {
        System.out.println(name);
        System.out.println(roll);
    }
    
}
