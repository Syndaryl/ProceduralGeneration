package com.fisherevans.proc_gen.caves;

import java.util.ArrayList;
import java.util.List;

public class Point {
	public int x, y, id;
	
	public Point(int x, int y, int id) {
		this.x = x;
		this.y = y;
		this.id = id;
	}
	
	public double distanceTo(Point other) {
		return Math.pow(x-other.x, 2) + Math.pow(y-other.y, 2);
	}
}
