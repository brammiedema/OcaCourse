package nl.youngcapital.atm.InheritanceDemo.birdsofforage;

import java.util.Random;

import nl.youngcapital.atm.InheritanceDemo.Bird;
import nl.youngcapital.atm.InheritanceDemo.birdsofprey.ForagingBird;

public class PreditoryBird extends Bird {

	public PreditoryBird() {

	}

	public PreditoryBird(int size, int age) {
		this.setAge(age);
		this.setSize(size);

	}

	public void fly() {
		System.out.println("flying like a preditory bird");

	}

	public void hunt(Bird target) {
		System.out.println("Hunting for prey!");
		Random r = new Random();
		int rint = r.nextInt(7) + r.nextInt(7); // including 0 excluding
												// variable (in this case 7)

		target = (rint == 10) ? null : target;

		if (target == null) {
			System.out.println("Bird is dead! hunt succesful");
			this.setSize(this.getSize() + 1);

		} else {
			System.out.println("hunt failed target flew away");
			this.setSize(this.getSize() - 1);

		}
		

	}

	public static void main(String args[]) {
		PreditoryBird p = new PreditoryBird(565, 2);
		Bird b = new ForagingBird();
		p.hunt(b);
		System.out.println(p.getSize());
	}
}
