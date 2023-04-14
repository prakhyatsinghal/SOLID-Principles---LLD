public class Penthouse {
    int squareFootage;
    int numberOfBedrooms;

    public Penthouse() {
        this.numberOfBedrooms = 4;
    }

    public void setSquareFootage(int sqft) {
        this.squareFootage = sqft;
    }
    
    public void addBedroom() {
        this.numberOfBedrooms += 1;
    }
}

// To follow the Liskov Substitution Principle, we can define a base class Penthouse 
// that has a property for the number of bedrooms, and then derive the PenthouseSuite  classes from it. 
// The BedroomAdder class can then be modified to take an instance 
// of Penthouse as a parameter, making it more flexible and accommodating to any subtype of Penthouse.