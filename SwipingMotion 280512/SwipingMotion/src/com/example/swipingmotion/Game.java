package com.example.swipingmotion;

public class Game {
	SwipingMotionActivity swipe = new SwipingMotionActivity();
	int tracknum = 2;
	public void run()
	{
		//while(there is a swipe)
		//if swipe is left
			tracknum--;
		//if swipe is right
			tracknum++;
		//if(number>2 && swipe is right)
			//do nothing
		//if(number<2 && swipe is left)
			//do nothing
		
	}
	public void initialize()
	{
		
	}
}
