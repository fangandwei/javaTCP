package putongfactorymode;
//创建普通工厂类
public class HumanFactory {
    //写一个造人的方法
	public Human creteHuman(String gender){
		
		if(gender.equals("male")){
			return new Male();
		}else if(gender.equals("female")){
			
			return new Female();
		}
		else{
			System.out.println("请输入正确的类型");
			return null;
		
		}
		
		
		
		
	}
}
