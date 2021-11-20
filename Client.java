import java.net.*;
import java.io.*;
public class Client  {

	public static void main(String[] args)  throws Exception {
		
		Socket c=new Socket("localhost",9007);
		
		DataInputStream recive=new DataInputStream(c.getInputStream());
		DataOutputStream send=new DataOutputStream(c.getOutputStream());
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		String str="",str2="";
		
		while(!str.equals("Bye")){ 
			System.out.println("\nEnter Response: ");
			str=br.readLine();  
			send.writeUTF(str);  
			send.flush();  
			System.out.println("Waiting for Server's Reply...");
			str2=recive.readUTF();  
			System.out.println("Server Message: "+str2);  
			}  
			  
			send.close();  
			c.close();  
		
	}
}