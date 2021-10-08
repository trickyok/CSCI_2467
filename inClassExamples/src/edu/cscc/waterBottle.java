package edu.cscc;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

/* Gage Farmer
10/5/21
Fill up and empty a water bottle lol
 */
class waterBottle {

    // Declarations
    int percentFilled;
    double height, radius, totalVolume, waterVolume;


    // Returning values
    public double getHeight() { return this.height; }
    public double getRadius() { return this.radius; }
    public double getTotalVolume() { return this.totalVolume; }
    public double getWaterVolume() { return this.waterVolume; }
    public int getPercentFilled() { return this.percentFilled; }


    // Setting values
    public void setHeight(double height) { this.height = height; }
    public void setRadius(double radius) { this.radius = radius; }
    public void setPercentFilled(int percent) {
        if (percent <= 100 && percent >= 0) { this.percentFilled = percent; }
        else { System.out.println("Invalid percentage. Value was not set."); }
    }


    // Manipulating values
    public void drinkWater() {
        if (this.percentFilled == 0) { System.out.println("You can't drink anything, the bottle is empty.");
        } else if (this.percentFilled >= 6) { this.percentFilled -= 6; }
        else { this.percentFilled = 0; }
        calcWaterVolume();
    }
    public void fillBottle() {
        this.percentFilled = 100;
        calcWaterVolume();
    }


    // Calculating volumes based on dimensions and percent filled
    public void calcVolumes() { calcTotalVolume(); calcWaterVolume(); }
    private void calcTotalVolume() {
        this.totalVolume = Math.PI * (this.radius * this.radius) * this.height;
    }
    private void calcWaterVolume() {
        this.waterVolume = this.totalVolume * (this.percentFilled / 100.0);
    }


    // Print out text bottle
    public String print() {

        String bottlePicture = "";
        int topLine, bottomLine;
        int pictureNumber = (int) Math.ceil(this.percentFilled / 6);

        if (pictureNumber == 0) { pictureNumber = 1; }

        topLine = 21 * pictureNumber - 20;
        bottomLine = pictureNumber * 21 - 1;

        for (int i=topLine; i<=bottomLine; i++) {
            bottlePicture += FileRead(i);
            bottlePicture += "\n";
        }

        return bottlePicture;
    }

    // Reads line n from the file and returns as string
    private String FileRead(int n) {
        String line = "";

        try{
            line = Files.readAllLines(Paths.get("src/edu/cscc/bottleImages")).get(n);
        }
        catch(IOException e){
            System.out.println(e);
        }

        return line;
    }


}
