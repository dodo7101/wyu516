package homework1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test2 {
	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("myfile.txt");
		FileOutputStream fos = new FileOutputStream("myfile_cp.txt");
		byte[] data = new byte[1024];
		int len = -1;
		while ((len = fis.read(data)) != -1) {
			fos.write(data, 0, len);
		}
		System.out.println("¸´ÖÆÍê±Ï");
		fis.close();
		fos.close();

	}

}
