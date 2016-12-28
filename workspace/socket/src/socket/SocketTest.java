package socket;

import java.io.*;
import java.net.*;
import java.util.*;

/**
 * This program makes a socket connection to the atomic clock in Boulder, Colorado, and prints
 * this time that the server sends
 * @author blank
 * @version 1.20 2004-08-03
 */
public class SocketTest {

	public static void main(String[] args) throws UnknownHostException, IOException {

//		InetAddress i = InetAddress.getLocalHost();
//		System.out.println("address:"+i.getHostAddress());
//		System.out.println("name:"+i.getHostName());
		
		InetAddress ia = InetAddress.getByName("www.baidu.com");
		System.out.println("address:"+ia.getHostAddress());
		System.out.println("name:"+ia.getHostName());
		
//		try(Socket s = new Socket("time-A.timefreq.bldrdoc.gov", 13)){
//		InputStream inStream = s.getInputStream();
//		Scanner in = new Scanner(inStream);
//		
//		while(in.hasNextLine()){
//			String line = in.nextLine();
//			System.out.println(line);
//		}
	}

}
