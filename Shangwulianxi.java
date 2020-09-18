package day4file;

import java.io.File;

public class Shangwulianxi {
	public static void main(String[] args) {
		String path = "C:\\Users\\Administrator\\Desktop\\extends";
		File file = new File(path);
		allFile(file);
	}

	public static void allFile(File fileInfo) {
		if (fileInfo != null) {

			File[] fileList = fileInfo.listFiles();

			for (int i = 0; i < fileList.length; i++) {
				System.out.println(fileList[i]);
			}
		}

	}
}