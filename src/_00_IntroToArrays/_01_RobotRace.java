package _00_IntroToArrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
	
	public static void main(String[] args) {
		Random randy= new Random();
		//2. create an array of 5 robots.
Robot[] robots = new Robot[5];
		//3. use a for loop to initialize the robots.
for(int i=0;i<robots.length;i++) {
	robots[i]=new Robot();
	robots[i].setSpeed(20);
}
			//4. make each robot start at the bottom of the screen, side by side, facing up
	for(int i=0;i<robots.length;i++) {
		robots[i].setX(50+(i*(40*robots.length)));
		robots[i].setY(500);
	}
		//5. use another for loop to iterate through the array and make each robot move 
	    //   a random amount less than 50.
    	for(int i=0;i<robots.length;i++) {
    		robots[i].move(randy.nextInt(50));
    	}
		//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.
    	while(true) {
    		for(int i=0;i<robots.length;i++) {
        		robots[i].move(randy.nextInt(50));
        		if(robots[i].getY()<=0) {
        			JOptionPane.showMessageDialog(null, "Robot "+(i+1)+" is the winner!");
        			return;
        		}
        	}
    	}
		//7. declare that robot the winner and throw it a party!
    	
		//8. try different races with different amounts of robots.
    	
	    //9. make the robots race around a circular track.

	}
}
