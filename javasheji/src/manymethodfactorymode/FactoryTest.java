package manymethodfactorymode;
//工厂测试类
public class FactoryTest {
   public static void main(String[] args) {
	   //先创建一个工厂
	   HumanFactory hf=new HumanFactory();
	   //在造人方法上添加一个参数 用来表明造的是什么类型的人
	   
	   //接口Human指向新创建的对象male
	   Human male=hf.createMale();
	   male.eat();
	   male.sleep();
	   male.beat();
	   
	   
	   
}
}
