package hw;
/*
 * Topic: 設計Student與course 兩個 class，Student Class包含下列資訊:
 * 學號、姓名與課程(Course)，Course的class包含 課程名稱、課程代號、課程分數、授謀老師
 * 、學分數，並於主程式讓使用者輸入位學生的資料及修課資料，並根據平均成績由高至低輸出這些同學的資料
 * Date: 2016/11/28
 * Author: 105021011 丁紹剛
 */
import java.util.ArrayList;
import java.util.Scanner;
public class hw03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		ArrayList <Student> studList = new ArrayList <Student>();
		boolean check = true;
		while(check){
			int sum = 0;
			boolean a = true;
			String name = scn.next();
			String id = scn.next();
			while(a){
				String course = scn.next();
				float score = scn.nextFloat();
				sum++;
				char b = scn.next().charAt(0);
				if(b == 'n' || b == 'N'){
					a = false;
				}
			}
			
		}

	}
}
