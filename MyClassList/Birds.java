package MyClassList;

public class Birds {

    private String Name;
    private String Type;
    private double price;
    private int image;
    private double weight;
    private String colour;
    private int age;
    private int lifespan;
    private String description;

    public Birds(String Name, String Type, double price, int age, String colour, String description, int image, int lifespan, double weight) {
        this.Name = Name;
        this.Type = Type;
        this.price = price;
        this.age = age;
        this.colour = colour;
        this.description = description;
        this.image = image;
        this.lifespan = lifespan;
        this.weight = weight;
    }

    

    public Birds() {
    }





    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }



    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }





    public double getprice() {
        return price;
    }

    public void setprice(double price) {
        this.price = price;
    }





    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }





    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }





    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }





    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }






    public int getLifespan() {
        return lifespan;
    }

    public void setLifespan(int lifespan) {
        this.lifespan = lifespan;
    }






    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
