package in.co.RandomStream;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Set;
import java.util.TreeSet;
import java.io.BufferedReader;
public class RandomFile {

	public static void main(String args[]) throws IOException {
		File f=new File("boy.txt");				//creating the file boy.txt
		FileWriter fileW=new FileWriter(f);			//opening for writing the file
		int n;
		//creating the loop 100 times to generate 100 random numbers between 1-49
		for(int i=0;i<100;i++)
		{
			n=(int)(Math.random()*(49));
			if(n==0)
				n+=1;
			fileW.write(n + "\n");			
		}

		fileW.close();				//closing the file
		System.out.println("Good Job");
		
		FileReader f2=new FileReader(f);
		BufferedReader bufferedReader = new BufferedReader(f2);
		
		
		Set<Integer> treeSet = new TreeSet<Integer>();
		String line = null;
		while ((line = bufferedReader.readLine()) != null) {
			treeSet.add(Integer.valueOf(line));
		}
		
		treeSet.stream().forEach(i->System.out.println(i));
		bufferedReader.close();

	}

}
