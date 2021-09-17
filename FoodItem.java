import java.util.Objects;

public class FoodItem {
	enum Taste {SWEET, SOUR, SPICY, SALTY, BITTER;}
	
	enum Category {DRINKS, STARTER, MAINCOURSE, DESERTS;}
	
	enum VegType {VEG, NONVEG;}
	
	public String name;
	public Taste taste;
	public Category category;
	public VegType vegType;
	public int price;
	
	@Override
	public String toString() {
		return "FoodItem [name=" + name + ", taste=" + taste + ", category=" + category + ", vegType=" + vegType
				+ ", price=" + price + "]";
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj == null)
			return false;
		if(getClass() != obj.getClass())
			return false;
		
		FoodItem other = (FoodItem) obj;
		return Objects.equals(name, other.name);
	}	
}
