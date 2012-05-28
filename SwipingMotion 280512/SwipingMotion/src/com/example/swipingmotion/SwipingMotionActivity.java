package com.example.swipingmotion;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.GestureDetector.OnGestureListener;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class SwipingMotionActivity extends Activity implements OnGestureListener {
	private GestureDetector detector; 
	View.OnTouchListener gestureListener;
	private static final int SWIPE_MIN_DISTANCE = 120;
    private static final int SWIPE_MAX_OFF_PATH = 250;
    private static final int SWIPE_THRESHOLD_VELOCITY = 200;
    TextView tv;
    
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.main);
        tv = new TextView(this);
        tv.setText("Hello, Android");
        setContentView(tv);
        
        detector = new GestureDetector(this,this);
        
        
    }
    @Override  
    public boolean onTouchEvent(MotionEvent event) {  
        return detector.onTouchEvent(event);  
    } 
	public boolean onDown(MotionEvent arg0) {
		// TODO Auto-generated method stub
		//Context context = getApplicationContext();
		//CharSequence text = "Down";
		//int duration = Toast.LENGTH_SHORT;

		//Toast.makeText(getApplicationContext(), "Down", Toast.LENGTH_SHORT).show();
		//toast.show();
		return true;
	}
	public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX,
			float velocityY) {
		// TODO Auto-generated method stub
//		try {
//            if (Math.abs(e1.getY() - e2.getY()) > SWIPE_MAX_OFF_PATH)
//                return false;
//            // right to left swipe
//            if(e1.getX() - e2.getX() > SWIPE_MIN_DISTANCE && Math.abs(velocityX) > SWIPE_THRESHOLD_VELOCITY) {
//            	tv.setText("Left");
//            }  else if (e2.getX() - e1.getX() > SWIPE_MIN_DISTANCE && Math.abs(velocityX) > SWIPE_THRESHOLD_VELOCITY) {
//            	tv.setText("Right");
//            }
//        } catch (Exception e) {
//            // nothing
//        }
//		return false;
        if (e1==null || e2==null)
            return false;
        float dX = e2.getX()-e1.getX();
        float dY = e1.getY()-e2.getY();
        if (Math.abs(dY)<SWIPE_MAX_OFF_PATH &&
            Math.abs(velocityX)>=SWIPE_THRESHOLD_VELOCITY &&
            Math.abs(dX)>=SWIPE_MIN_DISTANCE ) {
            if (dX>0) {
                //Toast.makeText(getApplicationContext(), "Right Swipe", Toast.LENGTH_SHORT).show();
            	tv.setText("Right");
            } else {
                //Toast.makeText(getApplicationContext(), "Left Swipe", Toast.LENGTH_SHORT).show();
            	tv.setText("Left");
            }
            return true;
        } else if (Math.abs(dX)<SWIPE_MAX_OFF_PATH &&
            Math.abs(velocityY)>=SWIPE_THRESHOLD_VELOCITY &&
            Math.abs(dY)>=SWIPE_MIN_DISTANCE ) {
            if (dY>0) {
                //Toast.makeText(getApplicationContext(), "Up Swipe", Toast.LENGTH_SHORT).show();
            	tv.setText("Up");
            } else {
                //Toast.makeText(getApplicationContext(), "Down Swipe", Toast.LENGTH_SHORT).show();
            	tv.setText("Down");
            }
            return true;
        }
        return false;
	}
	public void onLongPress(MotionEvent e) {
		// TODO Auto-generated method stub
		Toast.makeText(getApplicationContext(), "Long Press", Toast.LENGTH_SHORT).show();
		
	}
	public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX,
			float distanceY) {
		// TODO Auto-generated method stub
		return false;
	}
	public void onShowPress(MotionEvent e) {
		// TODO Auto-generated method stub
		
	}
	public boolean onSingleTapUp(MotionEvent e) {
		// TODO Auto-generated method stub
		
		return false;
	}
}