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
		
		int i  = 0;
		int total =0;
		i = 1+3+3+1+2+1+1+2+4+3+2+1+2+1+3+3; // klopt C
		System.out.println("aantal C: " + i);
		total += i;
		i = 2+1+4+2+4+3+2+3+3+1+1+3+1+2+2+2; // klopt I
		System.out.println("aantal I: " + i);
		total += i;
		i = 4+4+1+4+3+4+3+4+2+2+4+4+3+3+4+1;
		System.out.println("aantal I: " + i);
		total += i;
		i = 3+2+2+3+1+2+4+1+1+4+3+2+4+4+1+4;
		System.out.println("aantal S: " + i);
		total += i;
		
		System.out.println(total);
		String[] iArr = "2+1+4+2+4+3+2+3+3+1+1+3+1+2+2+2".split("\\+");
		System.out.println("length is:" + iArr.length);
		
	}
}
