package Boba;
import java.util.Scanner;
public class Credit {
	//Set Attributes of Credit Card
	private String cardName;
	private long cardNumber;
	private int cardMonth;
	private int cardYear;
	private int cardSSV;
	//Set Setters and Getters for Credit card Info
	public void setCardName(String cardName) {
		this.cardName = cardName;
	}
	public String getCardName() {
		return cardName;
	}
	public void setCardMonth(int cardMonth) {
		this.cardMonth = cardMonth;
	}
	public int getCardMonth() {
		return cardMonth;
	}
	public void setCardYear(int cardYear) {
		this.cardYear = cardYear;
	}
	public int getCardYear() {
		return cardYear;
	}
	public void setCardSSV(int cardSSV) {
		this.cardSSV = cardSSV;
	}
	public int getCardSSV() {
		return cardSSV;
	}
	
	public void setCardNumber(long cardNumber) {
		this.cardNumber = cardNumber;
	}
	public long getCardNumber() {
		return cardNumber;
	}
	//Main Function
	public static void main(String[] args) 
    { 
		//Retreive Card Detail from USER INPUT
		Scanner input = new Scanner(System.in); 
        Credit c1 = new Credit();
        System.out.println("Sorry No AMEX"); //Notify no AMEX Taken
        System.out.println("Card Name:");
        c1.setCardName(input.nextLine());
        System.out.println("Card Number:");
        c1.setCardNumber(input.nextLong());
        System.out.println("Card Month:");
        c1.setCardMonth(input.nextInt());
        System.out.println("Card Year:");
        c1.setCardYear(input.nextInt());
        System.out.println("Card SSV:");
        c1.setCardSSV(input.nextInt());
        long number = c1.getCardNumber(); //Set Number to card number to validate
        String name = c1.getCardName(); //Set Name to card name for display
        int lastFour = (int) (number % 10000); //retreive last 4 digits of card
       
		System.out.println("The card belonging to "+ name + " ending in " + lastFour + " is " +  
        (isValid(number) ? "Accepted" : "Declined")); 
    } 
  
    // Step 1 Return true if the card number is valid 
	
	public static boolean isValid(long number) 
    { 
       return (getSize(number) >= 13 &&  
               getSize(number) <= 16) &&  
               //visa
    		   (prefixMatched(number, 4) ||  
               //mastercard
    		    prefixMatched(number, 5) ||   
                //disc
    		    prefixMatched(number, 6)) &&  
              ((sumOfDoubleEvenPlace(number) +  
                sumOfOddPlace(number)) % 10 == 0); 
    } 
  
   
	//Card Companies use algorithm of Luhn Algorithm
	// Get the boolean result from Step 1
    public static int sumOfDoubleEvenPlace(long number) 
    { 
        int sum = 0; 
        String num = number + ""; 
        for (int i = getSize(number) - 2; i >= 0; i -= 2)  
            sum += getDigit(Integer.parseInt(num.charAt(i) + "") * 2); 
          
        return sum; 
    } 
  
    // Check Validility if Modulous of ten
    public static int getDigit(int number) 
    { 
        if (number < 9) 
            return number; 
        return number / 10 + number % 10; 
    } 
  
    // Return sum of odd digits in number 
    public static int sumOfOddPlace(long number) 
    { 
        int sum = 0; 
        String num = number + ""; 
        for (int i = getSize(number) - 1; i >= 0; i -= 2)  
            sum += Integer.parseInt(num.charAt(i) + "");         
        return sum; 
    } 
  
    // Return true if the digit d is a prefix for number 
    public static boolean prefixMatched(long number, int d) 
    { 
        return getPrefix(number, getSize(d)) == d; 
    } 
  
    // Return the number of digits in d 
    public static int getSize(long d) 
    { 
        String num = d + ""; 
        return num.length(); 
    } 
    public static long getPrefix(long number, int k) 
    { 
        if (getSize(number) > k) { 
            String num = number + ""; 
            return Long.parseLong(num.substring(0, k)); 
        } 
        return number; 
    } 
	
}
