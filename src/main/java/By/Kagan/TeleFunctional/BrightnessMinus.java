package By.Kagan.TeleFunctional;

import org.springframework.stereotype.Component;

@Component("brightness-")
public class BrightnessMinus implements Function{
    @Override
    public String getFunction() {
        return "Brightness-";
    }
}
