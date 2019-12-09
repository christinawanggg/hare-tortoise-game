
public class Tortoise {

	// Make an object for the position and finishPosition of the tortoise
	private int position;
	private int finishPosition;

	// Make a constructor for the tortoise
	public Tortoise(int finalPosition) {
		position = 1;
		this.finishPosition = finalPosition;

	}

	// Use a getter method to get the position of the tortoise
	public int getPosition() {
		return position;
	}

	// Use a setter method to set the position of the tortoise
	public void setPosition(int position) {
		this.position = position;
	}

	// Make methods for the different types of moves of the tortoise and its effect on the tortoise's position
	public void FastPlod() {
		position += 3;

		// Indicate that if the position becomes more than 50, than return it to position 50 like normal
		if (position > finishPosition) {
			position = finishPosition;
		}

	}

	public void SlowPlod() {
		position += 1;
		if (position > finishPosition) {
			position = finishPosition;
		}
	}

	public void Slip() {
		position -= 6;

		// Indicate that if the position becomes less than 1, than return it to
		// position 1 like normal
		if (position < 1) {
			position = 1;
		}
	}

	// Indicate the options for the next move the tortoise makes
	public void NextMove() {

		// The choices are random from integers 1-10
		int choice = (int) (Math.random() * 10 + 1);
		if (choice <= 5) {
			FastPlod();
		} else if (choice <= 8) {
			SlowPlod();
		} else
			Slip();
	}
}
