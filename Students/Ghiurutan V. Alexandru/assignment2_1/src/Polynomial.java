
public class Polynomial {
	private double[] coeffs;

	public Polynomial(double... coeffs) {
		this.coeffs = coeffs;
	}

	public double[] getPolynomial() {
		return coeffs;
	}

	public int getDegree() {
		int d = 0;
		for (int i = 0; i < coeffs.length; i++) {
			if (coeffs[i] != 0) {
				d = i;
			}
		}
		return d;
	}

	public String toString() {
		String pol = "";
		int d = getDegree();
		for (int i = d; i >= 0; i--) {
			if (i == 1) {
				if (coeffs[0] >= 0) {
					pol += coeffs[i] + "X+";
				} else {
					pol += coeffs[i] + "X";
				}
			} else if (i == 0) {
				pol += coeffs[i];
			} else {
				if (coeffs[i - 1] >= 0) {
					pol += coeffs[i] + "X^" + i + "+";
				} else {
					pol += coeffs[i] + "X^" + i;
				}
			}
		}
		return pol;
	}
}
