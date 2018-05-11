package manymethodfactorymode;
//创建普通工厂类
public class HumanFactory {
    //写造多个不同的人的方法，就是多方法工厂模式
		   public Male createMale() {
		        return new Male();
		    }
		    public Female createFemale() {
		        return new Female();
		    }
		
		}
		
		
		
		

