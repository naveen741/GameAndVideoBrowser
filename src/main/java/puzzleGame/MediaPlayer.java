package puzzleGame;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class MediaPlayer {
	File playList;
	String[] video;
    public MediaPlayer() throws IOException 
    {
    	System.out.println("===============VIDEO BROWSER===============");
    	playList=new File("src/videos");
    	video=playList.list();
    	Arrays.sort(video);
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Available videos are : ");
    	showList();
    	System.out.println((video.length+1)+". Exit");
    	System.out.println("Enter your choice : ");
    	int choice;
    	while(true) {
    		choice= sc.nextInt();
    		if(choice==video.length+1)
    			break;
    		if((choice<=video.length) && (choice>0))
    			playVideo(choice-1);
    	}
    	sc.close();
    }
    void showList() {
    	for(int i=0;i<video.length;i++)
    		System.out.println((i+1)+". "+video[i]);
    }
    void playVideo(int n) throws IOException {
    	Desktop.getDesktop().open(new File("src/videos/"+video[n]));
    }
}