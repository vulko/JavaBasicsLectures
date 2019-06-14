package kvolkov.java.lesson_basics.lesson3;

import java.util.Random;

import kvolkov.java.lesson_basics.lesson1.Point;

public class MinRouteFinder {
	
	public static void execute() {
		
		Random mRandom = new Random();
		Point[] mPoints = new Point[10];
		
		for (int i = 0; i < mPoints.length; ++i) {
			mPoints[i] = new Point();
			mPoints[i].setX(mRandom.nextInt(1000));
			mPoints[i].setY(mRandom.nextInt(1000));			
			System.out.println("mPoints[" + i + "] = " + mPoints[i].toString());
		}
		
		int minRadius = mPoints[0].getRadiusVector();
		int maxRadius = mPoints[0].getRadiusVector();
		int minIdx = 0, maxIdx = 0;
		
		for (int i = 0; i < mPoints.length; ++i) {
			int rad = mPoints[i].getRadiusVector();
			
			if (minRadius > rad) {
				minRadius = rad;
				minIdx = i;
			}
			
			if (maxRadius < rad) {
				maxRadius = rad;
				maxIdx = i;
			}
		}
		System.out.println("nearest point is [" + minIdx + "] = " + mPoints[minIdx].toString());
		System.out.println("furthest point is [" + maxIdx + "] = " + mPoints[maxIdx].toString());
		
	}

}
