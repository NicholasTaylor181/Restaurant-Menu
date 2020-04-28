package restaurant;

public class MenuItem {
    private String name;
    private double price;
    private String description;
    private String category;
    private boolean isNew;

    public String getName() {
        return name;
    }
    public void setName(String aName){
        name = aName;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double aPrice){
        price = aPrice;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String aDescription) {
        description = aDescription;
    }

    public String getCategory() {
        return category;
    }
    public void setCategory(String aCategory){
        category = aCategory;
    }

    public boolean getIsNew(){
        return isNew;
    }
    public void setIsNew(boolean aIsNew){
        isNew = aIsNew;
    }

}
