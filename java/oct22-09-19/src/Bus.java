
public class Bus {
	int seats;
	String color;
	
	public Bus(int seats, String color) {
		this.seats = seats;
		this.color = color;
	}
	
	Bus() {
		this(40);
	}

	public Bus(int seats) {
		this(seats, "yellow");
	}
	
	void getDetails() {
		System.out.println("Welcome to RedBus. Bus Capacity : "+seats+" and color : "+color);
	}
}
