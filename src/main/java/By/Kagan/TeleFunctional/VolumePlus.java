package By.Kagan.TeleFunctional;

import org.springframework.stereotype.Component;

@Component
public class VolumePlus implements Function{
    @Override
    public String getFunction() {
        return "Volume+";
    }
}
