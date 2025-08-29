//import java.util.*;
package movieticketsales;
import javax.swing.JOptionPane;
public class movie_ticket_sales{
    public static void main(String[] args) {

        // Take input movie name
        String movieName=new String();
        movieName=JOptionPane.showInputDialog(null,"Enter the movie name:");
        JOptionPane.showMessageDialog(null,movieName);

        // take adult ticket price as input
        String AdultTicketPrice=new String();
        AdultTicketPrice=JOptionPane.showInputDialog(null,"Enter the price of movie for adult");
        JOptionPane.showMessageDialog(null,AdultTicketPrice);
        //converting string to double
        //Here we are using Double.parseDouble() function to convert string into double.
        double adultTicketPrice=Double.parseDouble(AdultTicketPrice);

        //take child ticket price as input
        String ChildTicketPrice=new String();
        ChildTicketPrice=JOptionPane.showInputDialog(null,"Enter the price of child ticket price:");
        JOptionPane.showMessageDialog(null,ChildTicketPrice);
        //I am converting ChildTicketPrice(String) to childTicketPrice(Double)
        double childTicketPrice=Double.parseDouble(ChildTicketPrice);

        //Take no of adult ticket sold as input
        String No0fAdultTicketsSold=new String();
        No0fAdultTicketsSold=JOptionPane.showInputDialog(null,"Enter the number of adult ticket sold:");
        JOptionPane.showMessageDialog(null,No0fAdultTicketsSold);
        // Converting No0fAdultTicketsSold(string) to no0fAdultTicketsSold(int)
        int no0fAdultTicketsSold=Integer.parseInt(No0fAdultTicketsSold);

        // Take no of child ticket sold as input
        String NoOfChildTicketsSold=new String();
        NoOfChildTicketsSold=JOptionPane.showInputDialog(null,"Enter the number of child ticket sold:");
        JOptionPane.showMessageDialog(null,NoOfChildTicketsSold);
        // Converting  NoOfChildTicketsSold(String) to  noOfChildTicketsSold(int)
        int  noOfChildTicketsSold=Integer.parseInt(NoOfChildTicketsSold);

        // Take input percentDonation
        String PercentDonation=new String();
        PercentDonation=JOptionPane.showInputDialog(null,"Enter the percentage of the gross amount you " +
                "want to donate");
        JOptionPane.showMessageDialog(null,PercentDonation);
        // Converting PercentDonation(String) to percentDonation(int)
        int percentDonation=Integer.parseInt(PercentDonation);

        // To Calculate the gross amount
        double grossAmount=adultTicketPrice * noOfChildTicketsSold + childTicketPrice * noOfChildTicketsSold;
        // To Calculate the amount donated to the charity
        double amountDonated = grossAmount * percentDonation / 100;
        // To Calculate the net sale amount
        double netSaleAmount = grossAmount - amountDonated;
        // To calculate the total ticket sold
        int totalTicketSold=(no0fAdultTicketsSold + noOfChildTicketsSold);

        // Creating the string consisting of the strings and the values required.
        //String outputStr=String.format("Movie Name: %s\nNumber of ticket sold: %d\nGross Amount: $%.2f\nPercentage of Gross Amount Donated: %d\nAmount Donated: $%.2f\n Net Sale: $%.2f",movieName,totalTicketSold,grossAmount,percentDonation,amountDonated,netSaleAmount);
        String outputStr = "Movie Name: "+movieName + "\n" + "Number of Tickets Sold:"+ (no0fAdultTicketsSold +
                noOfChildTicketsSold) + "\n" +"Gross Amount: $"
                + String.format("%.2f", grossAmount) + "\n"
                +"Percentage of Gross Amount Donated: "
                + String.format("%d", percentDonation) + "\n"
                +"Amount Donated: $"
                + String.format("%.2f", amountDonated) + "\n"
                +"Net Sale: $"
                + String.format("%.2f", netSaleAmount);
        // Displaying the outputStr string which contains 6 information
        JOptionPane.showMessageDialog(null,outputStr,null,JOptionPane.INFORMATION_MESSAGE);
    }
}
