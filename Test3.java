package homework1;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test3 {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("myfile.txt");
		BufferedInputStream bis = new BufferedInputStream(fis);
		FileOutputStream fos = new FileOutputStream("myfile_cp2.txt");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		// byte[] data=new byte[1024*10];
		int len = -1;

		while ((len = bis.read()) != -1) {
			bos.write(len);
		}
		System.out.println("�������");
		bis.close();
		bos.close();

	}

}
