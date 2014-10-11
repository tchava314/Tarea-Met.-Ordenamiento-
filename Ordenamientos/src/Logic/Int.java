package Logic;

public class Int<ele> implements Comparacion {
	private int num;

	public void Int(ele num) {
		this.num = (int) num;
	}

	public Int(ele ele) {
		num = (int) ele;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int Comparar(Comparacion obj) {
		if ((this.getNum() > ((Int) obj).getNum())) {
			return 1;

		} else {
			return -1;
		}
	}
}
