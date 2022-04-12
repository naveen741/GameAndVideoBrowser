package puzzlegame;

import java.io.IOException;
import java.util.Scanner;

public class MainGame {

	public static void main(String[] args) throws IOException {
		System.out.println("==================GAMES AND APPLICATION==================");
		Scanner sc=new Scanner(System.in);
		System.out.println("1.Tic_Tac_Toe \n2.Rearranging Number puzzle\n3.Video Browser\n4.Exit");
		System.out.println("Enter your choice: ");
		int choice;
		boolean flag=true;
		while(flag) {
			choice=sc.nextInt();
			switch(choice) {
			case 1:
				new Tic_Tac_Toe();
				break;
			case 2:
				new ArrangeNumber();
				break;
			case 3:
				new MediaPlayer();
				break;
			case 4:
				flag=false;
				break;
			default:
				System.out.println("Enter a valid choice.");
			}
		}
		sc.close();
	}

}
