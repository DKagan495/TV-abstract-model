package By.Kagan.TeleFunctional;

public class Televisor {
    Function function;
    private String Brand, Specs;
    private int Cost;
    public String getBrand() {
        return Brand;
    }

    public String getSpecs() {
        return Specs;
    }

    public int getCost() {
        return Cost;
    }

    public void setBrand(String Brand) {
        this.Brand = Brand;
    }

    public void setSpecs(String Specs) {
        this.Specs = Specs;
    }

    public void setCost(int Cost) {
        this.Cost = Cost;
    }

    public void setFunction(Function function) {
        this.function = function;
    }
    public String getFunction()
    {
        return function.getFunction();
    }
}
