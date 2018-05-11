package staticmethodfactorymode;
//创建普通工厂类
public class HumanFactory {
    //将方法写成静态的就是静态工厂方法模式
		   public static Male createMale() {
		        return new Male();
		    }
		    public static  Female createFemale() {
		        return new Female();
		    }
		
		}
		
		
		
		

