
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Select the Card");
        System.out.println("1.Payback Card");
        System.out.println("2.Membership Card");
        Integer selCard = Integer.parseInt(br.readLine());
        System.out.println("Enter the Card Details:");
        String[] dataList1 = br.readLine().split("\\|");
        String holderName = dataList1[0];
        String cardNumber = dataList1[1];
        String expiryDate = dataList1[2];
        if(selCard == 1){
            System.out.println("Enter points in card");
            Integer points = Integer.parseInt(br.readLine());
            System.out.println("Enter Amount");
            Double amt = Double.parseDouble(br.readLine());
            
            PaybackCard payIns = new PaybackCard(holderName, cardNumber, expiryDate, points, amt);
            System.out.println(payIns.getHolderName()+"'s Payback Card Details:");
            System.out.println("Card Number "+payIns.getCardNumber());
            System.out.println("Points Earned "+payIns.getPointsEarned());
            System.out.println("Total Amount "+payIns.getTotalAmount());
        }else if(selCard == 2){
            System.out.println("Enter rating in card");
            Integer rating = Integer.parseInt(br.readLine());
            
            MembershipCard memIns = new MembershipCard(holderName, cardNumber, expiryDate, rating);
            System.out.println(memIns.getHolderName()+"'s Membership Card Details:");
            System.out.println("Card Number "+memIns.getCardNumber());
            System.out.println("Rating "+memIns.getRating());
        }else{
            System.out.println("Invalid card");
        } 
        

        
        
    }
    
}
