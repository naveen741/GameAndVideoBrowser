package puzzlegame;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class VideoBrowser {
	File playList;
	String[] video;
	/**
	 * VideoBrowser() is a constructor used to initialize the playList
	 * And initialize the video Browser
	 */
	Logger logger=Logger.getLogger(VideoBrowser.class.getName());
    public VideoBrowser() throws IOException 
    {
    	logger.log(Level.INFO,"===============VIDEO BROWSER===============");
    	playList=new File("src/videos");
    	video=playList.list();
    	Arrays.sort(video);
    	func();
    }
    /**
     * func() is a method used to implement the functions of 
     * the application of the video Browser  
     */
    void func() throws IOException {
    	Scanner sc=new Scanner(System.in);
    	showList();
    	
    	int choice;
    	while(true) {
    		choice= sc.nextInt();
    		if(choice==video.length+1)
    			break;
    		if((choice<=video.length) && (choice>0))
    			playVideo(choice-1);
    	}
    	
    }
    /**
     * showList() is a method used to display the list of video present in the location. 
     */
    void showList() {
    	
    	StringBuilder str=new StringBuilder();
    	str.append("Available videos are : \n");
    	for(int i=0;i<video.length;i++)
    		str.append((i+1)+". "+video[i]+" \n");
    	str.append((video.length+1)+". Exit \n");
    	str.append("Enter your choice : ");
    	String temp=str.toString();
    	logger.log(Level.INFO,temp);
    }
    /**
     * playVideo() is a method to play the video
     * 
     */
    void playVideo(int n) throws IOException {
    	Desktop.getDesktop().open(new File("src/videos/"+video[n]));
   }
}