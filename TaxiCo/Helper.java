/**
 * The test class Helper.
 * Provides the beginning of a set of tests for program development.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class Helper 
{
    private TaxiCo taxiCo1;

    /**
     * Default constructor for test class Helper
     */
    public Helper()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    protected void setUp()
    {
        taxiCo1 = new TaxiCo("IMD's cars");
        taxiCo1.addTaxi();
        taxiCo1.addTaxi();
        taxiCo1.addShuttle();
        taxiCo1.showStatus();
    }

    /**
     * Test whether we can book a taxi.
     */
    public void testBook()
    {
        setUp();
        Taxi taxi1 = (Taxi) taxiCo1.lookup("Car #1");
        System.out.println(taxi1.getID());
        System.out.println("Função getID (taxi) funcionou!");
        System.out.println(taxi1.getDestination());
        System.out.println("Função getDestination (taxi) funcionou!");
        System.out.println(taxi1.getLocation());
        System.out.println("Função getLocation (taxi) funcionou!");
        taxi1.book("HIPER");
        taxiCo1.showStatus();
        if ("HIPER".equalsIgnoreCase(taxi1.getDestination()) ) {
            System.out.println("Funçao showStatus funcionou!");
        } else { 
            System.out.println("Alguma coisa errada");
        }
        System.out.println();
    }

    /**
       * Test the status of a taxi and a shuttle after it has arrived.
     */
    public void testArrived()
    {
        Shuttle shuttle1 = (Shuttle) taxiCo1.lookup("Shuttle #3");
        System.out.println(shuttle1.getID());
        System.out.println("Função getID (shuttle) funcionou!");
        Taxi taxi1 = (Taxi) taxiCo1.lookup("Car #1");
        taxi1.book("HIPER");
        taxi1.arrived();
        shuttle1.arrived();
        System.out.println(shuttle1.getDestination());
        System.out.println("Função getDestination (shuttle) funcionou!");
        System.out.println(shuttle1.getLocation());
        System.out.println("Função getLocation (shuttle) funcionou!");
        System.out.println(taxi1.getStatus());
        System.out.println(shuttle1.getStatus());
        System.out.println("Função showStatus (shuttle & Taxi) funcionou!");
        taxiCo1.showStatus();
        if ( taxi1.getDestination() == null && "HIPER".equalsIgnoreCase(taxi1.getLocation()) ) {
            System.out.println("Funcionou showStatus funcionou!");
        } else { 
            System.out.println("Alguma coisa errada");
        }
    }

    public static void main(String[] args) {
        Helper helper = new Helper();
        System.out.println("Primeiro teste");
        helper.testBook();
        
        System.out.println("Segundo teste");
        helper.testArrived();
    }
}


