import java.util.*;
class MainClass {
	
	public static void main(String[]args) {
	Scanner sc= new Scanner(System.in);
	FoodStore foodStore = FoodStore.getInstance();
	
	MainClass mainClass = new MainClass();
	mainClass.showUserMenu();
	}
	
	public void showUserMenu() {
		int userValue = 0;
		while(userValue != 10) {
			System.out.println("Enter 1: For adding food item");
			System.out.println("Enter 2: For printing food item");
			System.out.println("Enter 3: For deleting food item");
			System.out.println("Enter 4: For updating food item");
			System.out.println("Enter 5: For exit");
			
			Scanner sc= new Scanner(System.in);
			int userInput = sc.nextInt();
			
			FoodStore foodStore = FoodStore.getInstance();
			switch(userInput) {
			case 1:
				FoodItem foodItem = new FoodItem();
				System.out.println("Which item you want to add?");
				foodItem.name = sc.next();
				setTaste(foodItem);
				setCategory(foodItem);
				setVegType(foodItem);
				System.out.println("Enter the price");
				foodItem.price = sc.nextInt();
				foodStore.add(foodItem);
				break;
			
			case 2:
        		System.out.println("Printing all Food Items");
        		foodStore.print();
        		break;
        		
			case 3:
				System.out.println("Which item do you want to delete");
				String name = sc.next();
				FoodItem foodItem1 = foodStore.getFoodItem(name);
				foodStore.delete(foodItem1);
				break;
				
			case 4:
				System.out.println("Which item you have to update");
				String item = sc.next();
				//item +=" "+sc.next();
				FoodItem foodItem2 = foodStore.getFoodItem(item);
				System.out.println("What you have to update in this item : ");
				update(foodItem2);
        		break;
        	
        	default:
        		System.out.println("Invalid entry");
			}
		}
	}

	public void setTaste(FoodItem foodItem) {
		// TODO Auto-generated method stub
		System.out.println("Taste: Enter 1 for Sweet, 2 for Sour, 3 for Bitter, 4 for Spicy, 5 for Salty");
		Scanner sc= new Scanner(System.in);
		int tasteItem = sc.nextInt();
		switch(tasteItem) {
			case 1:
				foodItem.taste = FoodItem.Taste.SWEET;
				break;
				
			case 2:
				foodItem.taste = FoodItem.Taste.SOUR;
				break;
				
			case 3:
				foodItem.taste = FoodItem.Taste.BITTER;
				break;
				
			case 4:
				foodItem.taste = FoodItem.Taste.SPICY;
				break;
				
			case 5:
				foodItem.taste = FoodItem.Taste.SALTY;
				break;
		}
	}
	
	public void setCategory(FoodItem foodItem) {	
		System.out.println("Category : Enter 1 for Drinks, 2 for Starters, 3 for MainCourse, 4 for Spicy, 5 for Deserts");
		Scanner sc = new Scanner(System.in);
		int CatItem = sc.nextInt();
		switch(CatItem) {
			case  1 :
				foodItem.category = FoodItem.Category.DRINKS;
				break;
		  
			case  2 :
				foodItem.category = FoodItem.Category.STARTER;
				break;
		    
			case  3 :
				foodItem.category = FoodItem.Category.MAINCOURSE;
				break;
		    
			case  4 :
				foodItem.category = FoodItem.Category.DESERTS;
				break;
		 }	
	}
	
	public void setVegType(FoodItem foodItem) {	
		System.out.println("VegType : Enter 1 for Veg, 2 for NonVeg");
		Scanner sc= new Scanner(System.in);
		int vegTypeItem = sc.nextInt();
		switch(vegTypeItem) {
			case  1 :
				foodItem.vegType = FoodItem.VegType.VEG;
				break;
	    
			case  2 :
				foodItem.vegType = FoodItem.VegType.NONVEG;
				break;
		}
	}
	
	public void update(FoodItem foodItem) {
		System.out.println("What you have to update in this: 1 for Category, 2 for VegType and 3 for Taste 4 for Price");
		Scanner sc = new Scanner(System.in);
		int toBeUpdated = sc.nextInt();
		
		switch(toBeUpdated) {
			case 1:
				setCategory(foodItem);
				break;
			case 2:
				setVegType(foodItem);
				break;
			case 3:
				setTaste(foodItem);
				break;
			case 4:
				System.out.println("Enter new price for the " + foodItem.name);
				foodItem.price = sc.nextInt();
				break;
				//break;)
		}
	}
	
}
