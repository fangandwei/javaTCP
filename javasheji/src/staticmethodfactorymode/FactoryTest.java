package staticmethodfactorymode;
//工厂测试类
//一般用这种，既可以避免传参错误，又不用实例化对象
public class FactoryTest {
   public static void main(String[] args) {
	  
	   Human male=HumanFactory.createMale();
	   male.eat();
	   male.sleep();
	   male.beat();
	   
	   
	   
}
}
