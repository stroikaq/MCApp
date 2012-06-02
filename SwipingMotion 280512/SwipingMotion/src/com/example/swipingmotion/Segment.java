package com.example.swipingmotion;

//each segment consists of 3 tracks
public class Segment {

	Track track1 = null; 
	Track track2 = null; 
	Track track3 = null; 
	
	public Segment(Track i, Track j, Track k)
	{
		track1 = i;
		track2 = j;
		track3 = k;
	}
	public Track getTrack1()
	{
		return track1;
	}
	public Track getTrack2()
	{
		return track2;
	}
	public Track getTrack3()
	{
		return track3;
	}
}
