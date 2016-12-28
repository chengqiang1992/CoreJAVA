package socket;

import java.io.IOException;
import java.net.*;

/**
 * ���� ͨ��udp���䷽ʽ����һ�����ַ��ͳ�ȥ
 * ˼·
 * 1�� ����udp socket����
 * 2�� �ṩ���ݣ��������ݷ�װ�����ݰ���
 * 3�� ͨ��socket����ķ��͹��ܽ����ݰ����ͳ�ȥ
 * 4���ر���Դ
 * @author blank
 *
 */

public class UdpTest {

	public static void main(String[] args) throws IOException {
		//1,����UDP����ͨ��DatagramSocket
		DatagramSocket ds = new DatagramSocket();
		
		//2,ȷ�����ݣ�����װ�����ݰ�
		byte[] buf = "udp ge men lai le".getBytes();
		DatagramPacket dp = new DatagramPacket(buf, buf.length, InetAddress.getByName("192.168.10.14"), 10000);
		
		//3,ͨ��socket���񣬽����е����ݰ����ͳ�ȥ��ͨ��send����
		ds.send(dp);
		
		//4,�ر���Դ
		ds.close();
	}

}

/**
 * ���� ����һ��Ӧ�ó������ڽ���UDPЭ�鴫������ݲ������
 * ˼·
 * 1�� ����udp socket����
 * 2�� ����һ�����ݰ������ڴ洢Ҫ���յ����ֽ����ݡ�
 * 3�� ͨ��socket�����receive���ܽ����ݰ������Ѷ���õ����ݰ���
 * 4���ر���Դ
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
		
		//4,�ر���Դ
		ds.close();
	}

}
