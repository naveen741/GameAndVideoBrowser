package puzzlegame;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
public class MainGame {
	/**
	 * this is the main engine of our application 
	 */
	static Logger logger=Logger.getLogger(MainGame.class.getName());
	public static void main(String[] args) throws IOException {
		logger.log(Level.INFO,"==================GAMES AND APPLICATION==================");
		Scanner sc=new Scanner(System.in);
		logger.log(Level.INFO,"1.Tic_Tac_Toe \n2.Rearranging Number puzzle\n3.Video Browser\n4.Exit\nEnter your choice: ");
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
				new VideoBrowser();
				break;
			case 4:
				flag=false;
				break;
			default:
				logger.log(Level.INFO,"Enter a valid choice.");
			}
		}
		sc.close();
	}

}
