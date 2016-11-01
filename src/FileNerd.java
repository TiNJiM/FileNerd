import java.util.*;
import java.io.*;
public class FileNerd {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		Scanner sf = new Scanner(new File("U:\\Workshop\\FileNerd\\src\\FileNerd.txt"));
		String text[] = new String[5];
		int maxIndx = -1;
		while(sf.hasNext()){
			maxIndx++;
			text[maxIndx] = sf.nextLine();
		}
		for(int i = 0; i < text.length; i++) {
			String testLine = text[i].substring(0, 3);
			if (testLine.equals("The")){
				System.out.println(text[i]);
			}
		}
	}

}
