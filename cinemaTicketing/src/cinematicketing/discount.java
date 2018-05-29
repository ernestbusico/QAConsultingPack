
package cinematicketing;


public class discount extends weekDay {
    
    public discount () {}
    
    public int applyDiscount (int ticketPrice) {
        
        weekDay day = new weekDay();
        String currentDay = day.getCurrentDay();
        
        if (currentDay.equalsIgnoreCase("Wednesday")) {
            ticketPrice = ticketPrice - 2;
        }
        return ticketPrice;
    }
}
