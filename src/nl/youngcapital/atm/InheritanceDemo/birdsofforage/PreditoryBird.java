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
		int rint = r.nextInt(7) + r.nextInt(7); // including 0 excluding variable (in this case 7)

		target = (rint == 10) ? null : target; 

		if (target == null) {
			System.out.println("Bird is dead! hunt succesful");
			this.setSize(this.getSize() + 1);

		} else {
			System.out.println("hunt failed target flew away");
			this.setSize(this.getSize() - 1);

		}
		

	}

	public void superTest(){
		
		Bird b = new ForagingBird();
		Bird c = this;
		
		System.out.println("this");
		System.out.println(this.dirk);
		
		System.out.println("super");
		System.out.println(super.dirk);
		
		System.out.println("bird b = new foragingbird() ");
		System.out.println(b.dirk);
		
		this.dirk = 4;
		
		System.out.println("this");
		System.out.println(this.dirk);
		
		System.out.println("super");
		System.out.println(super.dirk);		
		
		System.out.println("bird b = new foragingbird() ");
		System.out.println(b.dirk);
		
		System.out.println("this");
		System.out.println(this.dirk);
		
		StringBuilder sb = new StringBuilder();
		
		System.out.println("super");
		System.out.println( super.dirk);	
		System.out.println(super.equals(this));
		System.out.println(c.dirk);
	}
	
	public static void main(String args[]) {
		PreditoryBird p = new PreditoryBird(565, 2);
		Bird b = new ForagingBird();
		
		p.superTest();
		
		p.hunt(b);
		System.out.println(p.getSize());
		
		System.out.println(p);
	}
	
	
	public String toString(){
		return "bird: [ dirk: " + this.dirk + " age: "+this.getAge() + " size: " + this.getSize() + " ]";
		
		
	}
}
