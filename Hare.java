
public class Hare {

	// Make an object for the position and finishPosition of the hare
	private int position;
	private int finishPosition;

	// Make a constructor for the hare
	public Hare( int finalPosition ) {
		position = 1;
		this.finishPosition = finalPosition;
	}

	// Use a getter method to get the position of the hare
	public int getPosition() {
		return position;
	}
	// Use a setter method to set the position of the hare
	public void setPosition(int position) {
		this.position = position;
	}

	// Make methods for the different types of moves of the hare and its effect on the hare's position
	public void BigHop() {
		position += 9;

		// Indicate that if the position becomes more than 50, than return it to position 50 like normal
		if (position > finishPosition) {
			position = finishPosition;
		}
	}

	public void SmallHop() {
		position += 1;
		if (position > finishPosition) {
			position = finishPosition;
		}
	}

	public void BigSlip() {
		position -= 12;

		// Indicate that if the position becomes less than q, than return it to position 1 like normal
		if (position < 1) {
			position = 1;
		}
	}

	public void SmallSlip() {
		position -= 2;
		if (position < 1) {
			position = 1;
		}
	}

	// Fall Asleep has no effect on position
	public void FallAsleep() {

	}

	// Indicate the options for the next move the hare makes
	public void NextMove() {

		// The choices are random from integers 1-10
		int choice = (int) (Math.random() * 10 + 1);
		if (choice <= 2) {
			BigHop();
		} else if (choice <= 5) {
			SmallHop();
		} else if (choice <= 6) {
			BigSlip();
		} else if (choice <= 8) {
			SmallSlip();
		} else {
			FallAsleep();
		}

	}
}
