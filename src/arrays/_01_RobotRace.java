package arrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
public static void main(String[] args) {
	
	//2. create an array of 5 robots.
	Robot[] robots = new Robot[5];
	robots[0] = new Robot();
	robots[1] = new Robot();
	robots[2] = new Robot();
	robots[3] = new Robot();
	robots[4] = new Robot();
	
	int counter = 100;
	
	//3. use a for loop to initialize the robots.
	for (int i=0;i<robots.length;i++) {
		
		
		robots[i].setX(counter);
		robots[i].setSpeed(50);
		counter+=175;
		robots[i].setY(counter);
		robots[i].setY(550);
	}
		//4. make each robot start at the bottom of the screen, side by side, facing up

	//5. use another for loop to iterate through the array and make each robot move 
	//   a random amount less than 50.
	boolean racing = true;
	while(racing) {
		
	Random number = new Random();
	for(int i=0;i<robots.length;i++) {
		if(robots[i].getY()>0) {
		int n = number.nextInt(50);
		robots[i].move(n);
		}
		
		if(robots[i].getY()==0) {
			JOptionPane.showMessageDialog(null, robots[i] + " is the winner");
			racing = false;
			break;
			
		}
	}

	}
	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

	//7. declare that robot the winner and throw it a party!

	//8. try different races with different amounts of robots.

	//9. make the robots race around a circular track.
}
}