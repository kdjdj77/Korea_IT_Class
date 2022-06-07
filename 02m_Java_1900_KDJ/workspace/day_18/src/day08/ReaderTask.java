package day08;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReaderTask {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		File task = new File("task.txt");
		FileReader fr = null;
		BufferedReader br = null;
		
		
		System.out.print("인덱스 >> ");
		int idx = sc.nextInt();
		
		try {
			fr = new FileReader(task);
			br = new BufferedReader(fr);
			for (int i = 0; i < idx; i++) {
				br.readLine();
			}
			
			System.out.println(br.readLine());
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch(IOException e) {
			
		}finally {
			try {
				if(br != null) br.close();
				if(fr != null) fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		// 사용자에게 인덱스번호를 입력 받아
		// task.txt 파일에서 해당 인덱스번호에 있는 문장을 출력하시오
		// ex) 인덱스 >> 5
		// 5번째 방입니다
	}
}
























