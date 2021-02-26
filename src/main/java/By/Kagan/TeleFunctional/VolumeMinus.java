package By.Kagan.TeleFunctional;

import org.springframework.stereotype.Component;

@Component("VolMinus")
public class VolumeMinus implements Function{
    @Override
    public String getFunction() {
        return "Volume-";
    }
}
