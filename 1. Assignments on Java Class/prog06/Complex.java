public class Complex {
	private double re;
	private double im;

	public Complex() {
		this(0, 0);
	}

	public Complex(final double re) {
		this(re, 0);
	}

	public Complex(final double re, final double im) {
		this.re = re;
		this.im = im;
	}

	@Override
	public String toString() {
		if (this.im >= 0) {
			return ("(" + this.re + " + " + this.im + "i)");
		} else {
			return ("(" + this.re + " - " + Math.abs(this.im) + "i)");
		}
	}

	public static Complex add(final Complex cmplx1, final Complex cmplx2) {
		Complex res = new Complex((cmplx1.re + cmplx2.re), (cmplx1.im + cmplx2.im));
		return res;
	}

	public static Complex multiply(final Complex cmplx1, final Complex cmplx2) {
		double re = cmplx1.re * cmplx2.re - cmplx1.im * cmplx2.im;
		double im = cmplx1.re * cmplx2.im + cmplx1.im * cmplx2.re;
		Complex res = new Complex(re, im);
		return res;
	}
}
