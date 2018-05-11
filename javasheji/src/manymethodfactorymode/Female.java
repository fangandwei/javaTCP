package manymethodfactorymode;

public class Female implements Human {

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("女人能吃");

	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
        System.out.println("女人能睡");
	}

	@Override
	public void beat() {
		// TODO Auto-generated method stub
        System.out.println("女人能打豆豆");
	}

}
