package leiadaptermode;
//类适配器
//适配器继承想用的类  实现现在有的接口
public class Adapter extends Usbimpl implements Ps2interface {

	@Override
	public void isPs2() {
		// TODO Auto-generated method stub
         this.isUsb();
	}

}
