package abstractfactorymode;
//抽象工厂
public interface KitchenFactory {
	//抽象工厂用来得到抽象食物和餐具
	public Food getFood();
	public TableWare getTableWare();

}
