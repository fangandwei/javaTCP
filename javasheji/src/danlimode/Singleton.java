package danlimode;
//单例模式

//保证jvm中只有一个实例对象
public class Singleton {
//持有私有静态实例，防止被引用,此处设置为null，延迟加载
	
	private static Singleton instance=null;
	//私有构造方法，防止被实例化
	private Singleton(){}
	
    /* 静态工程方法，创建实例 */  
    public static Singleton getInstance() {  
        if (instance == null) {  
            instance = new Singleton();  
        }  
        return instance;  
    }  
    
    
    /* 如果该对象被用于序列化，可以保证对象在序列化前后保持一致 */  
    public Object readResolve() {  
        return instance;  
    }  

     

}
