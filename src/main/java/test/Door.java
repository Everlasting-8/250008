package text;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Door {
    private boolean locked = true;

    public void close(){
        locked = true;
    }

    public void open(){
        locked = false;
    }

}
