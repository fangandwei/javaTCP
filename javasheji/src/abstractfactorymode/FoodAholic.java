package abstractfactorymode;
//吃货
public class FoodAholic {
	//吃货开吃   参数为抽象工厂   外面看着像得到抽象类调用抽象类的方法
	  public void eat(KitchenFactory k) {
	       System.out.println("A foodaholic is eating "+ k.getFood().getFoodName()
	              + " with " + k.getTableWare().getToolName() );
	    }

}
