
public class main {

	public static void main(String[] args) {

		// Initialize the finish position of 50 squares
		int finishPosition = 100;
		Hare hare = new Hare(finishPosition);
		Tortoise tortoise = new Tortoise(finishPosition);

		// Print a line to indicate the start of the race
		System.out.println("AND THEY'RE OFF!!");

		// The iteration would adjust the contender positions, and the loop would terminate when one of the contenders reaches the last square or position 50
		for (; hare.getPosition() < finishPosition && tortoise.getPosition() < finishPosition;) {
			hare.NextMove();
			tortoise.NextMove();

			System.out.print("|");
			for (int i = 1; i <= finishPosition; i++) {

				if (hare.getPosition() == i && tortoise.getPosition() == i)
					System.out.print("OUCH !!");
				else if (hare.getPosition() == i || hare.getPosition() > finishPosition)
					System.out.print("H");
				else if (tortoise.getPosition() == i || tortoise.getPosition() > finishPosition)
					System.out.print("T");

				System.out.print("|");

			}

			System.out.println("");


			// If the tortoise and the hare are in the same position, then print out a line that says OUCH
			if (hare.getPosition() == tortoise.getPosition()) {
				System.out.println("OUCH!!");
			}
		}

		// If the tortoise and hare cross the finishPosition at the same time then it is a tie
		if (hare.getPosition() >= finishPosition && tortoise.getPosition() >= finishPosition) {
			System.out.println("IT’S A TIE!!");
		}

		// If the tortoise crosses the finishPosition first, it wins
		else if (tortoise.getPosition() >= finishPosition) {
			System.out.println("TORTOISE WINS!!");
		}

		// If the hare crosses the finishPosition first, it wins
		else {
			System.out.println("HARE WINS!!");
		}

	}
}
