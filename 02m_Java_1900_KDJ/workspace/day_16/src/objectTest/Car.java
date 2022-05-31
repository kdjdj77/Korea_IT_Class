package objectTest;

public class Car {
	int carNum;

	public Car(int carNum) {
		super();
		this.carNum = carNum;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Car) {
			return this.carNum == ((Car)obj).carNum;			
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return carNum;
	}
	
	@Override
	public String toString() {
		return "자동차 번호판 : " + carNum;
	}
	
	
}























