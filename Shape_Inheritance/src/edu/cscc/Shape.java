package edu.cscc;

/**
 * Shape class
 * @author rplatt
 */
public class Shape {
    private Location loc;
    private String name;

    // Constructor
    public Shape(Location loc, String name) {
        this.loc = loc;
        this.name = name;
    }

    // Accessors / Mutators
    public Location getLoc() { return loc; }
    public String getName() { return name; }
    public void setLoc(Location loc) { this.loc = loc; }
    public void setName(String name) { this.name = name; }

    // Other methods
    public String toString() {
        return("Shape named "+getName()+" at "+loc.toString());
    }
}
