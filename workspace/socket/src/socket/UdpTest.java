package socket;

import java.io.IOException;
import java.net.*;

/**
 * 需求： 通过udp传输方式，讲一段文字发送出去
 * 思路
 * 1： 建立udp socket服务
 * 2： 提供数据，并将数据封装到数据包中
 * 3： 通过socket服务的发送功能将数据包发送出去
 * 4：关闭资源
 * @author blank
 *
 */

public class UdpTest {

	public static void main(String[] args) throws IOException {
		//1,创建UDP服务，通过DatagramSocket
		DatagramSocket ds = new DatagramSocket();
		
		//2,确定数据，并封装成数据包
		byte[] buf = "udp ge men lai le".getBytes();
		DatagramPacket dp = new DatagramPacket(buf, buf.length, InetAddress.getByName("192.168.10.14"), 10000);
		
		//3,通过socket服务，将已有的数据包发送出去，通过send方法
		ds.send(dp);
		
		//4,关闭资源
		ds.close();
	}

}

/**
 * 需求： 定义一个应用程序，用于接受UDP协议传输的数据并处理的
 * 思路
 * 1： 建立udp socket服务
 * 2： 定义一个数据包，用于存储要接收到的字节数据。
 * 3： 通过socket服务的receive功能将数据包存入已定义好的数据包中
 * 4：关闭资源
 * @author blank
 *
 */
class UdpRece {

	public static void main(String[] args) throws IOException {
		DatagramSocket ds = new DatagramSocket(10000);
		
		byte[] buf = new byte[1024];
		DatagramPacket dp = new DatagramPacket(buf, buf.length);
		
		ds.receive(dp);
		
		String ip = dp.getAddress().getHostAddress();
		
		String data = new String(dp.getData(), 0, dp.getLength());
		
		int port = dp.getPort();
		
		System.out.println(ip+"::"+data+"::"+port);
		
		//4,关闭资源
		ds.close();
	}

}
