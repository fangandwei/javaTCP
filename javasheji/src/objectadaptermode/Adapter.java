package objectadaptermode;
//对象适配器模式
//适配器  实现现在有的接口 将想用的接口弄成成员变量
public class Adapter  implements Ps2interface {
    Usbinterface usb;
    
    
	public Adapter() {
		super();
	}
	


	public Adapter(Usbinterface usb) {
		super();
		this.usb = usb;
	}



	@Override
	public void isPs2() {
		// TODO Auto-generated method stub
         usb.isUsb();
	}

}
