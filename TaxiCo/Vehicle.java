
/**
 * Class with elements shared by Taxi and Shuttle.
 *
 * @author Felipe Douglas
 * @version 04/09/2018
 */
public class Vehicle
{
    private String id;
    private String destination;
    private String location;

    /**
     * Constructor for objects of class Vehicle
     */
    public Vehicle(String id)
    {
        this.id = id;
        this.destination = null;
        this.location = null;
    }

    /**
     * Return the ID of the vehicle.
     * @return The ID of the vehicle.
     */
    public String getID()
    {
        return id;
    }
    
    /**
     * Return the destination of the vehicle.
     * @return The destination of the vehicle.
     */
    public String getDestination()
    {
        return destination;
    }
        
    /**
     * Set the intented destination of the vehicle.
     * @param destination The intended destination.
     */
    public void setDestination(String destination)
    {
        this.destination = destination;
    }
    
    /**
     * Return the location of the vehicle.
     * @return The location of the vehicle.
     */
    public String getLocation()
    {
        return location;
    }
    
    /**
     * Set the location of the vehicle.
     * @param location The actual location.
     */
    public void setLocation(String location)
    {
        this.location = location;
    }
    
    /**
     * Return the status of this vehicle.
     * @return The status.
     */
    public String getStatus()
    {
        if(this.getDestination() == null)
        {
            return this.getID() + " at " + this.getLocation() + " is free to be booked ";
        }
        else
        {
            return this.getID() + " at " + this.getLocation() + " headed for " +
               this.getDestination();
        }
    }
}
