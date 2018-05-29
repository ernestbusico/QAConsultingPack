
package cinematicketing;

import java.text.SimpleDateFormat;
import java.util.Date;


public class weekDay {
    
    private String currentDay;
    
    public weekDay () {
        Date day = new Date();
        
        SimpleDateFormat simpleDateformat = new SimpleDateFormat("EEEE");
        currentDay = simpleDateformat.format(day);
    }
    
    public String getCurrentDay() {
        return currentDay;
    }
    
    public void setCurrentDay(String currentDay) {
        this.currentDay = currentDay;
    }

}
