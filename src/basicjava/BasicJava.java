package basicjava;

public class BasicJava
{
    
    public static void main(String[] args)
    {
        
        ClassBasicInit();
        //We are calling the setName method of Encapsulation.
        
        
    }
    
    static void ClassBasicInit()
    {
        ClassBasic basic = new ClassBasic("Sachin", 52);
        basic.printDetails();
    }
    
    
}