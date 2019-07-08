package kvolkov.java.lesson_basics.lesson7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadWriteExample {
	
	public static void writeFile() {
		FileOutputStream out = null;
		try {
			out = new FileOutputStream("result.txt");
			
			out.write(5);
			out.write(2);
			out.write(8);
			out.write(9);
			
			out.flush();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (out != null) {
					out.close();					
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void readFile() {
		FileInputStream in = null;
		try {
			in = new FileInputStream("result.txt");
			
			System.out.println(in.read());
			System.out.println(in.read());
			System.out.println(in.read());
			System.out.println(in.read());
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (in != null) {
					in.close();					
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static void writeCharFile() {
		FileWriter out = null;
		try {
			out = new FileWriter("result.txt");
			
			out.write("- Привет, ");
			out.write("  Михалыч!");
			out.write("- Привет, ");
			out.write("  Валера!");
			
			out.flush();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (out != null) {
					out.close();					
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void readCharFile() {
		FileReader in = null;
		try {
			in = new FileReader("result.txt");
			
			char[] data = new char[100];
			boolean hasData = true;
			String fileData = new String();
			do {
				int bytesRead = in.read(data, 0, 100);
				hasData = bytesRead > 0;
				fileData += new String(data);
				System.out.println("Read " + bytesRead + " bytes");
			} while (hasData);

			System.out.println("File contents:");
			System.out.println(fileData);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (in != null) {
					in.close();					
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
