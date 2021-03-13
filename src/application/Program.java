package application;

import java.io.File;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		//Lendo arquivo texto com classes File e Scanner
		
//		File file = new File("c:\\temp\\in.txt");
//		Scanner sc = null;
//		
//		
//		try {
//			sc = new Scanner(file);
//			while(sc.hasNextLine()) {
//				System.out.println(sc.nextLine());
//			}
//		}catch(IOException e) {
//			System.out.println("Error: " + e.getMessage());
//		}finally {
//			if(sc != null) {
//				sc.close();
//			}
//		}
		
		
		//FileReader e BufferedReader
		
//		String path = "c:\\temp\\in.txt";
//		FileReader fr = null;
//		BufferedReader br = null;
//		
//		try {
//			fr = new FileReader(path);
//			br = new BufferedReader(fr);
//			
//			String line = br.readLine();
//			
//			while(line != null) {
//				System.out.println(line);
//				line = br.readLine();
//			}
//		}catch(IOException e) {
//			System.out.println("Error: " + e.getMessage());
//			
//		}finally {
//			try {
//				if(br != null) {
//					br.close();
//				}
//				if(fr != null) {
//					fr.close();
//				}
//			}catch(IOException e) {
//				e.printStackTrace();
//			}
//		}
		
		
		//Bloco try-with-resources
		
//		String path = "c:\\temp\\in.txt";
//		try (BufferedReader br = new BufferedReader(new FileReader(path))){
//			
//			String line = br.readLine();
//			
//			while(line != null) {
//				System.out.println(line);
//				line = br.readLine();
//			}	
//		
//		}catch(IOException e) {
//			System.out.println("Error: " + e.getMessage());
//		}
	
		
		//FileWriter e BufferedWriter
//		String[] lines = new String[] {"Good morning", "Good afternoon", "Good night"};
//		
//		String path = "c:\\temp\\out.txt";
//		
//		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
//			for(String line: lines) {
//				bw.write(line);
//				bw.newLine();
//			}
//		}catch(IOException e) {
//			e.printStackTrace();
//		}
		
		//Manipulando pastas com File
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Entre com a pasta e o caminho: ");
//		String strPath = sc.nextLine();
//		
//		File path = new File(strPath);
//		
//		File[] folders = path.listFiles(File::isDirectory);
//		
//		System.out.println("FOLDERS: ");
//		
//		for(File folder : folders) {
//			System.out.println(folder);
//		}
//		
//		System.out.println("-------------------------------------------------------------------");
//		
//		File[] files = path.listFiles(File::isFile);
//		
//		System.out.println("FILES:");
//		
//		for(File file: files) {
//			System.out.println(file);
//		}
//		
//		System.out.println("--------------------------------------------------------------------");
//		
//		boolean success = new File(strPath + "\\subdir").mkdir();
//		System.out.println("Diretório criado com sucess: " + success);
//		
//		sc.close();
		
		//Informações do caminho do arquivo
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre com o caminho do arquivo: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		System.out.println("getName: " + path.getName());
		System.out.println("getParent: " + path.getParent());
		System.out.println("getPath: " + path.getPath());
		
	
	}

}
