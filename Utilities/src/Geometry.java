
public class Geometry {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	//return AB.AC
	public double dotProduct(double[] A, double[] B, double[] C) {
		
		double[] P1 = getVector(A, B);
		double[] P2 = getVector(A, C);
		
		return (P1[0]*P2[0] + P1[1]*P2[1]);
	}
	
	//return ABxAC
	public double crossProduct(double[] A, double[] B, double[] C) {
		double[] P1 = getVector(A, B);
		double[] P2 = getVector(A, C);
		
		return (P1[0]*P2[1] - P1[1]*P2[0]);
	}

	//return AB
	public double[] getVector(double[] A, double[] B) {
		return new double[]{B[0] - A[0], B[1] - A[1]};
	}
	
	//return distance b/w A & B
	public double distance(double[] A, double[] B) {
		return Math.sqrt(Math.pow(A[0] - B[0], 2) + Math.pow(A[1] - B[1], 2));
	}
	
	//return distance of C from line/segment AB
	public double linePodoubleDistance(double[] A, double[] B, double[] C, boolean isSegment){
		
		double dist = crossProduct(A, B, C) / distance(A, B);
		
		if(isSegment) {
			if(dotProduct(A, B, C) < 0){
				dist = distance(A, C);
			}
			if(dotProduct(B, A, C) < 0){
				dist = distance(B, C);
			}
		}
		
		return dist;
		
	}
	
	public double[] lineThrough(double[] A, double[] B) {
		double[] res = new double[3];
		res[0] = B[1] - A[1];
		res[1] = A[0] - B[0];
		res[2] = res[0] * A[0] + res[1] * A[1];
		
		return res;
	}
	
	public double[] lineIntersection(double[] A, double[] B) {
		double det = A[0]*B[1] - B[0]*A[1];
		if(det == 0)
			return null;
		else {
			double x = (B[1]*A[2] - A[1]*B[2]) / det;
			double y = (A[0]*B[2] - B[0]*A[2]) / det;
			
			return new double[]{x, y};
		}
	}
}
