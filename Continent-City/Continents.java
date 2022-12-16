import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Continents {

  public static void main(String[] args) {
    
    int tracker = 0;
    
    System.out.println("Enter a continent and I will tell you the most populated city on it along with it's location.");

    do {

      Scanner input = new Scanner(System.in);

      System.out.print("Enter a continent: ");
      
      String continent = input.nextLine();
      
      try {
          TimeUnit.SECONDS.sleep(1);
        } 
      catch (InterruptedException e) {
          Thread.currentThread().interrupt();
        }

      System.out.println("You entered " + continent + ".");

      try {
          TimeUnit.SECONDS.sleep(2);
        }
      catch (InterruptedException e) {
          Thread.currentThread().interrupt();
        }

      System.out.println("Checking my databanks.. checking.. checking..");

      try {
          TimeUnit.SECONDS.sleep(3);
        }
      catch (InterruptedException e) {
          Thread.currentThread().interrupt();
        }
	    
      switch (continent.toLowerCase()) {
        case ("north america") : {
	  System.out.println("Aha! Found it!");
	  try {
          TimeUnit.SECONDS.sleep(1);
        }
      catch (InterruptedException e) {
          Thread.currentThread().interrupt();
        }
          System.out.println("North America: Mexico City, Mexico");
	  try {
          TimeUnit.SECONDS.sleep(2);
        }
      catch (InterruptedException e) {
          Thread.currentThread().interrupt();
        }
	  System.out.println("Thanks for using my program!");
          tracker += 1;
          break;
      } 
        case ("south america") : {
	  System.out.println("Aha! Found it!");
          try {
          TimeUnit.SECONDS.sleep(1);
        }
      catch (InterruptedException e) {
          Thread.currentThread().interrupt();
        }
	  System.out.println("South America: Sao Paulo, Brazil");
	  try {
          TimeUnit.SECONDS.sleep(2);
        }
      catch (InterruptedException e) {
          Thread.currentThread().interrupt();
        }
	  System.out.println("Thanks for using my program!");
          tracker += 1;
          break;
      }      
        case ("europe") : {
	  System.out.println("Aha! Found it!");
          try {
          TimeUnit.SECONDS.sleep(1);
        }
      catch (InterruptedException e) {
          Thread.currentThread().interrupt();
        }
	  System.out.println("Europe: Moscow, Russia");
	  try {
          TimeUnit.SECONDS.sleep(2);
        }
      catch (InterruptedException e) {
          Thread.currentThread().interrupt();
        }
	  System.out.println("Thanks for using my program!");
          tracker += 1;
          break;
      }
        case ("africa") : {
          System.out.println("Aha! Found it!");
	  try {
          TimeUnit.SECONDS.sleep(1);
        }
      catch (InterruptedException e) {
          Thread.currentThread().interrupt();
        }
	  System.out.println("Africa: Lagos, Nigeria");
	  try {
          TimeUnit.SECONDS.sleep(2);
        }
      catch (InterruptedException e) {
          Thread.currentThread().interrupt();
        }
	  System.out.println("Thanks for using my program!");
          tracker += 1;
          break;
      }
        case ("asia") : {
	  System.out.println("Aha! Found it!");
          try {
          TimeUnit.SECONDS.sleep(1);
        }
      catch (InterruptedException e) {
          Thread.currentThread().interrupt();
        }

	  System.out.println("Asia: Shanghai, China");
	  try {
          TimeUnit.SECONDS.sleep(2);
        }
      catch (InterruptedException e) {
          Thread.currentThread().interrupt();
        }
	  System.out.println("Thanks for using my program!");
          tracker += 1;
          break;
      }
        case ("australia") : {
	  System.out.println("Aha! Found it!");
          try {
          TimeUnit.SECONDS.sleep(1);
        }
      catch (InterruptedException e) {
          Thread.currentThread().interrupt();
        }
	  System.out.println("Australia: Sydney, Australia");
	  try {
          TimeUnit.SECONDS.sleep(2);
        }
      catch (InterruptedException e) {
          Thread.currentThread().interrupt();
        }
	  System.out.println("Thanks for using my program!");
          tracker += 1;
          break;
      }
        case ("antarctica") : {
	  System.out.println("Aha! Found it!");
          try {
          TimeUnit.SECONDS.sleep(1);
        }
      catch (InterruptedException e) {
          Thread.currentThread().interrupt();
        }
	  System.out.println("Antarctica: McMurdo Station, US");
	  try {
          TimeUnit.SECONDS.sleep(2);
        }
      catch (InterruptedException e) {
          Thread.currentThread().interrupt();
        }
	  System.out.println("Thanks for using my program!");
          tracker += 1;
          break;
      }
        default : {
          System.out.println("Oops.. that's not a continent..");
          try {
          TimeUnit.SECONDS.sleep(1);
        }
      catch (InterruptedException e) {
          Thread.currentThread().interrupt();
        }
	  System.out.println("Let's try this again.");
          try {
          TimeUnit.SECONDS.sleep(1);
        }
      catch (InterruptedException e) {
          Thread.currentThread().interrupt();
        }
	  break;
        }
      }
    }
    while (tracker == 0);
  }
}
