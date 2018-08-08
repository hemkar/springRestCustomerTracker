import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Test {
	public static void main(String[] args) throws IOException {
		BufferedReader reader;
		
		try{
			reader= new BufferedReader(new FileReader("TradeData.dat"));
			String line=reader.readLine();
			line = reader.readLine();
			while(line!=null){
				String[] object=line.split("\\|");
				if(object.length<8 || object.length>8){
					System.out.println("invalid input file");
				}else{
					
					/*checkvalidaDate()
					Trades t=new Trades(object[0], object[0], object[0], object[0], object[0], object[0], object[0], object[0]);*/
				}
				
				System.out.println(line);
				System.out.println(Arrays.toString(object));
				line = reader.readLine();
				
				
			}
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}
	}
}
