package dat159.fowler;

import java.util.Enumeration;
import java.util.Vector;

public class Customer {
    private String _name;
    private Vector _rentals = new Vector();

    public Customer(String name) {
        _name = name;
    }
    
    public 

    public String statement() {
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        Enumeration rentals = _rentals.elements();
        String result = "Rental Record for " + getName() + "\n";
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();

            // add frequent renter points
            frequentRenterPoints ++;
            
            boolean isNewRelease = each.getMovie().getPriceCode()== Movie.NEW_RELEASE;
            boolean isMoreThanDay = each.getDaysRented() > 1;
            
            // add bonus for a two day new release rental
            if (isNewRelease  && isMoreThanDay) frequentRenterPoints ++;

            //show figures for this rental
            result += rentalFigures(each.getMovie().getTitle(), each.getAmount());
            totalAmount += each.getAmount();
        }
        //add footer lines
        result += footerLines(totalAmount, frequentRenterPoints);
        return result;
    }
    
    public String rentalFigures(String title, double amount ) {
    	return "\t" + title + "\t" +
                String.valueOf(amount) + "\n";
    }
    
    public String footerLines(double totalAmount, int frequentRenterPoints)
    {
    	return "Amount owed is " + String.valueOf(totalAmount) + "\n" 
    			+ "You earned " + String.valueOf(frequentRenterPoints) +
                " frequent renter points";
    }

    public void addRental(Rental arg) {
        _rentals.addElement(arg);
    }

    public String getName() {
        return _name;
    }
}
