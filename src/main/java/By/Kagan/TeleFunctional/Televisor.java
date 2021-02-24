package By.Kagan.TeleFunctional;

import org.springframework.beans.factory.annotation.Autowired;

public class Televisor {
   private VolumePlus volumePlus;
    private String Brand, Specs;
    private int Cost;
    @Autowired
    public Televisor(VolumePlus volumePlus)
    {
        this.volumePlus = volumePlus;
    }
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


    public String getFunction()
    {
        return volumePlus.getFunction();
    }
}
