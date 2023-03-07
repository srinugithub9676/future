
  package com.org.future.Seriallization;
  
  import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import
  java.io.ObjectInputStream; import java.io.ObjectOutputStream; import
  java.io.Serializable;
  
  
  import com.org.future.Entity.FutureIndia;
  
  public class SerilizationExample implements Serializable{
  
	  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
	
		FutureIndia india=new FutureIndia();
		india.setJobName("Software");
		india.setAgeLimit(25);
		india.setJobType("Govt");
		india.setSalary(850000);
		india.setCompinies(null);
		
		FileOutputStream fos=new FileOutputStream("D:\\SelizationTest");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		//oos.writeObject(india.getJobId());
		oos.writeObject(india.getJobName());
		oos.writeObject(india.getAgeLimit());
		oos.writeObject(india.getJobType());
		oos.writeObject(india.getSalary());
		oos.writeObject(india.getCompinies());
		
		oos.flush();
		oos.close();
		System.out.println("sucesss");
		
		/*FileInputStream Fis=new FileInputStream("D:\\SelizationTest");
		ObjectInputStream ois=new ObjectInputStream(Fis);
		FutureIndia s1=(FutureIndia)ois.readObject();
	System.out.println(s1.getJobName()+" "+s1.getAgeLimit()+" "+s1.getJobType()+" "+s1.getSalary()+" "+s1.getCompinies());  

	}*/
  
  }}
 