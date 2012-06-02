package com.example.swipingmotion;

public class Track {
	int number ;
	int type = 0;//0 = normal, 1 = JumpObstacle, 2 = DuckObstacle
		
	public Track(int i, int j)
	{
		number = i;
		type = j;
	}
//	public void setTrackNum(int i)
//	{
//		number = i;
//	}
//	public void setTrackType(int t)
//	{
//		type = t;
//	}
//	public int getTrackNum()
//	{
//		return number;
//	}
//	public int getTrackType()
//	{
//		return type;		
//	}

}
