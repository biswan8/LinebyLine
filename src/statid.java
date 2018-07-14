import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class statid {

	public static void main(String[] args) throws IOException {

		File file=new File("C:\\Users\\Biswa\\eclipse-workspace\\LinebyLine\\src\\Demo");
		FileReader fs=new FileReader(file);
		BufferedReader bf=new BufferedReader(fs);
		String st;
		while ((st = bf.readLine()) != null)
		{
			System.out.println(st);
		}		
		
		System.out.println("-----------------------------------------------------");
		
		File filee=new File("C:\\Users\\Biswa\\eclipse-workspace\\LinebyLine\\src\\Demo");
		FileReader fst=new FileReader(filee);
		BufferedReader br=new BufferedReader(fst);
		String word[]=new String(br.readLine()).split(" ");
		HashSet<String> hs=new HashSet<>();
		for(String str: word)
		{
			hs.add(str);	
			
		}
		System.out.println("Word count:"+hs.size());
		
		for(String str: hs)
		{
			System.out.print(str+" "+" ");
		}
		HashMap<String, Integer> hm = new HashMap<String, Integer>();

		
		for (String key : word)
		{
			String s=key.toLowerCase(); 
			Integer freq = hm.get(s);
			if(freq == null) freq = 1; else freq ++;
			hm.put(s, freq);
		}
		
		
		
	}

}
