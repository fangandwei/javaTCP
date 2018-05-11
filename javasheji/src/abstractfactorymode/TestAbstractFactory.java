package abstractfactorymode;

public class TestAbstractFactory {
	public static void main(String[] args) {
		FoodAholic ch=new FoodAholic();
		KitchenFactory af=new Akitchen();
		ch.eat(af);
		
	}
	
	
}
