package javafenye;

public class Test {
	
	public static void main(String[] args) {
		//总记录为20//	//		查第4页			每页3；
		PageBean<String> p=new PageBean<String>(20, 4, 3);

	
		System.out.println("索引为"+p.getIndex());//9
		System.out.println("页数为"+p.getTotalpagenum());//7
		System.out.println("起为"+p.getStart());//2
		System.out.println("end为"+p.getEnd());//6
		
	}

}
