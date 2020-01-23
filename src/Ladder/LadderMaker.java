package Ladder;

public class LadderMaker {

	public static void main(String[] args) {
		LadderParameters firstLadder = new LadderParameters("Ladder enterprise", 2.5, 80, "plastic", "Lviv", 5.30,
				"grey", 2.30);
		LadderParameters secondLadder = new LadderParameters("ioT Corporation", 4, 100, "wood");
		LadderParameters thirdLadder = new LadderParameters();

		System.out.println(firstLadder.toString());
		System.out.println(secondLadder.toString());
		System.out.println(thirdLadder.toString());

		System.out.println(LadderParameters.printStaticId());
		System.out.println(firstLadder.printId());

		LadderParameters loopLadder = null;
		LadderParameters arrayOfLadders[] = new LadderParameters[4];

		int i = 0;
		while (i < 4) {
			loopLadder = new LadderParameters("Looping Corporation", (5 + i), 120, "plastic", "Chervonograd",
					(7 + (i * 2)), "white", (4 + i));
			arrayOfLadders[i] = loopLadder;
			++i;
		}

		for (LadderParameters loopIterator : arrayOfLadders) {
			System.out.println(loopIterator.toString());
		}

	}

}