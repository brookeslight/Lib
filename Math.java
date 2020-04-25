package lib;

public class Math {
	
	public static float map(float n, float start1, float stop1, float start2, float stop2) {
		return ((n-start1)/(stop1-start1))*(stop2-start2)+start2;
	}
	
	public static float clamp(float n, float min, float max) {
		return n > max ? max : n < min ? min : n;
	}

}