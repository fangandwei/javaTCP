package javamail;
import java.util.Properties;
import javax.mail.Address;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/*发送邮件*/
public class MailUtil {

	
	public static   void sendmail(String To) throws Exception{
		
		 Properties props = new Properties();  
	        props.setProperty("mail.debug", "true");  
	        props.setProperty("mail.smtp.auth", "true");  
	          
	        // 协议名称设置为smtps，会使用SSL  
	        props.setProperty("mail.transport.protocol", "smtps");  
	          
	        Session session = Session.getInstance(props);  
	          
	        Message msg = new MimeMessage(session);  
	        msg.setSubject("一声问候");
	        msg.setText("你好吗？");  
	        msg.setFrom(new InternetAddress("1214470325@qq.com"));  
	          
	        Transport transport = session.getTransport();  
	        transport.connect("smtp.qq.com", "1214470325@qq.com", "rtizgyajysygbafi");  
	        transport.sendMessage(msg, new Address [] {new InternetAddress(To)});
	        transport.close();  
	    
}}
