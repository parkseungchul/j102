package shutup.code.j002.controller;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BaseController {
	
	@RequestMapping("/")
	public String main() {
		
		InetAddress local; 
		SimpleDateFormat format2 = new SimpleDateFormat ( "yyyy년 MM월dd일 HH시mm분ss초");
		Date time = new Date();
		String time2 = format2.format(time);

		try { 
			local = InetAddress.getLocalHost(); 
			String ip = local.getHostAddress(); 
			System.out.println("Call Time: " + time2 + ", " + "Call IP: " + ip); 
			} catch (UnknownHostException e1) { 
				e1.printStackTrace(); 
		}
		return "index";
	}

}
