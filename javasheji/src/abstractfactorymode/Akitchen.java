package abstractfactorymode;

public class Akitchen implements KitchenFactory {

	@Override
	public Food getFood() {
		// TODO Auto-generated method stub
		
		//多态   
		return new Apple();
	}

	@Override
	public TableWare getTableWare() {
		// TODO Auto-generated method stub
		return new Knife();
	}

}
