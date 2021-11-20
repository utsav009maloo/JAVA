import java.net.*;
import java.io.*;
public class Server {
	public static void main(String args[]) throws Exception,UnknownHostException{
		
		ServerSocket ss=new ServerSocket(9007);
		
		Socket c=ss.accept();;
		
		DataInputStream recive=new DataInputStream(c.getInputStream());
		DataOutputStream send=new DataOutputStream(c.getOutputStream());
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		String str="",str2="";
		
		while(str!="Bye")
		{
			System.out.println("Waiting for client's Reply...");
			str=recive.readUTF();
			System.out.println("UTSAV Message: "+str);
			System.out.println("Enter Message:");
			str2=br.readLine();  
			send.writeUTF(str2);  
			send.flush();
		}
		
		recive.close();
		c.close();
		ss.close();
	}
}