package By.Kagan.TeleFunctional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

public class Televisor {
    @Autowired
    @Qualifier("brightness-")
   private Function function;
    @Value("${televisor.Brand}")
    private String Brand;
    @Value("${televisor.Specs}")
    private String Specs;
    @Value("${televisor.Cost}")
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


    public String getFunction()
    {
        return function.getFunction();
    }

   /* public void setFunction(Function function) {
        this.function = function;
    }*/
}
