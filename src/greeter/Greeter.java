package greeter;

/**
 * A class for producing simple greetings.
 */
public class Greeter {

    private String name;
  
    /**
     * Constructs a Greeter object that can greet a person or 
     * other entity.
     * @param aName The name of the person or entity who should
     *        be addressed in the greetings.
     */
    public Greeter(String aName) {
        name = aName;
    }
    
    /**
     * Greet with a "Hello" message.
     * @return a message containing "Hello" and the name of the 
     *         person or entity.
     */
    public String sayHello() {
        return "Hello, " + name + "!";
    }
    
    /**
     * Say farewell with a "Goodbye" message.
     * @return a message containing "Goodbye" and the name of the
     *         person or entity,
     */
    public String sayGoodbye() {
        return "Goodbye, " + name + ".";
    }
    
    public void setName(String newName) {
        name = newName;
    }
    
    public void swapNames(Greeter other) {
        String oldName = name;
        name = other.name;
        other.name = oldName;
    }
    
    /**
     * Write a message.
     * @param args unused.
     * @return a message saying "Hello" and "Goodbye" to a
     * person or entity.
     */
    public static void main(String[] args) {
        Greeter worldGreeter = new Greeter("World");
        Greeter planetGreeter = new Greeter("Planet");
        worldGreeter.swapNames(planetGreeter);
        String greeting = planetGreeter.sayHello();
        System.out.println(greeting);
        String farewell = worldGreeter.sayGoodbye();
        System.out.println(farewell);
        
        for (int i = 0; i < args.length; i++) {
            
        }
    }
}
