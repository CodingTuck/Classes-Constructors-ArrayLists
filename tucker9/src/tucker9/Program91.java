package tucker9;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
 public class Program91 {
//SPC ID #2429488 Mitchell Tucker
	//keeps track of gifts and the amounts

	public static void main(String[] args) {
		//don't need a scanner but used one
		Scanner input = new Scanner(System.in);
		//declare objects of class gift containing arguments that match
		Gift gift1 = new Gift("Jimmy", "Four Wheeler", 1749.99, 1);
		Gift gift2 = new Gift("Tucker", "Monitors", 769.99, 4);
		Gift gift3 = new Gift("Mitchell", "Computer Programming Degree", 2000.00, 1);
		Gift gift4 = new Gift("Kaitlyn", "Puppies", 400.00, 3);
		Gift gift5 = new Gift("Joe", "Love", 0.00, 1);
		Gift gift6 = new Gift("John", "Tattoos", 749.99, 2);
		
		
		//declare arraylist
		ArrayList<Gift> gifts = new ArrayList<>();
		//add the objects into the arraylist
		gifts.add(gift1);
		gifts.add(gift2);
		gifts.add(gift3);
		gifts.add(gift4);
		gifts.add(gift5);
		gifts.add(gift6);
		
		double sum = 0; //declare variable
		double highest = 0; //declare variable
		double total = 0; //declare variable
		String highestName = ""; //declare variable
		
		//foreach loop to iterate through objects and call the methods from class Gift
		//displays highest gift as well as the name associated and the total for all gifts
		for (Gift eachGift : gifts) {
			
			System.out.println(eachGift.toString());
			eachGift.giftVals();
			System.out.println();
			sum = sum + eachGift.getPrice()*eachGift.getQty();
			total = eachGift.getPrice()*eachGift.getQty();
			
			//if statement to calculate highest spent with name
			if (total > highest) {
				highest = total;
				highestName = eachGift.getRecipient();
			}
		}
		
		//prints out the num of people that were bought gifts
		System.out.println("On " + Gift.recipients + " people I spent $" + sum);
			
		//prints out highest money spent and which person it was associated with
		System.out.printf("I spent the most money on %s, %.2f", highestName, highest);
		
		}
	
		
	}



