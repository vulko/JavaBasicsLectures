package kvolkov.java.lesson_basics.lesson4;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import kvolkov.java.lesson_basics.lesson1.Point;

public class MinRouteFinderWithList {

	private Random mRandom = new Random();
	private List<Point> mPoints = new ArrayList<Point>();
	
	public void initList() {
		int maxElements = mRandom.nextInt(10000) + 10000;
		  
		mPoints = new ArrayList<Point>(maxElements);
		  
		Point point;
		for (int i = 0; i < maxElements; ++i) {
			point = new Point();
			point.setX(mRandom.nextInt(1000));
			point.setY(mRandom.nextInt(1000));
			mPoints.add(point);
		}
	}
	
	public void findMixRoute() {		
		int minRadius = mPoints.get(0).getRadiusVector();
		int maxRadius = mPoints.get(0).getRadiusVector();
		int minIdx = 0, maxIdx = 0;
		
		for (int i = 0; i < mPoints.size(); ++i) {
			int rad = mPoints.get(i).getRadiusVector();
			
			if (minRadius > rad) {
				minRadius = rad;
				minIdx = i;
			}
			
			if (maxRadius < rad) {
				maxRadius = rad;
				maxIdx = i;
			}
		}
		
		Point mStartPoint = mPoints.get(minIdx);
		mPoints.remove(minIdx);
		Point mEndPoint = mPoints.get(maxIdx);
		mPoints.remove(maxIdx);

		System.out.println("nearest point is [" + minIdx + "] = " + mPoints.get(minIdx).toString());
		System.out.println("furthest point is [" + maxIdx + "] = " + mPoints.get(maxIdx).toString());
		for (int i = 0; i < mPoints.size(); ++i) {
			System.out.println("mPoints[" + i + "] = " + mPoints.get(i).toString());			
		}
		
		int minRouteDistance = 10 * mStartPoint.getDistanceTo(mEndPoint);
		// find all possible routes with 2 points between start and end,
		// and get the shortest one
		for (int i = 0; i < mPoints.size(); ++i) {
			for (int j = 0; j < mPoints.size(); ++j) {
				if (i == j) {
					// skip same items
					continue;
				}
				
				int minVariant1Distance = mStartPoint.getDistanceTo(mPoints.get(i))
						+ mPoints.get(i).getDistanceTo(mPoints.get(j))
						+ mPoints.get(j).getDistanceTo(mEndPoint);
				
				int minVariant2Distance = mStartPoint.getDistanceTo(mPoints.get(j))
						+ mPoints.get(j).getDistanceTo(mPoints.get(i))
						+ mPoints.get(i).getDistanceTo(mEndPoint);
				
				int newMin = (minVariant1Distance < minVariant2Distance)
								? minVariant1Distance
								: minVariant2Distance;
				
				if (minRouteDistance > newMin) {
					System.out.println("New min distance is " + newMin + "   was " + minRouteDistance);
					minRouteDistance = newMin;
				}
			}			
		}
		
	}
}
