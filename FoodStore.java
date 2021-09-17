import java.util.*;

public class FoodStore {
	
	private static FoodStore instance;
	
	private FoodStore() {}
	Scanner sc = new Scanner(System.in);
	
	public static synchronized FoodStore getInstance() {
		if(instance == null)
			instance = new FoodStore();
	return instance;
	}
	
	Set<FoodItem> foodList=new HashSet<FoodItem>();
	
	public void add(FoodItem foodItem) {
		foodList.add(foodItem);
	}
	
    public void print() {
    	for(FoodItem foodItem : foodList) {
    		System.out.println(foodItem);
    	}
    }
    
    public void delete(FoodItem foodItem) {
    	foodList.remove(foodItem);
    }
    
    public FoodItem getFoodItem(String name) {
    	for(FoodItem foodItem : foodList) {
    		if((foodItem.name.equals(name))) {
    			return foodItem;
    		}
    	}
    	return null;
    }
    
	
}
