package mock;

public class Tool {

	private Cat c = new Cat("Default");

	public void saveCat(Cat c) {
		System.out.println(c.getName());
	}

	public void updateCatName(String name) {
		c.setName(name);
		System.out.println(c.getName());
	}

	public void aboutException(Cat c) throws Exception {
		System.out.println(c.getName());
	}

	public Cat findCat(Cat c) {
		return new Cat(c.getName() + "cc");
	}

	public String getDefaultName() {
		return this.c.getName();
	}

	public int sum(int... num) {
		int sum = 0;
		for (int n : num) {
			sum += n;
		}
		return sum;
	}

	public Cat getCat(String name) {
		return new Cat(name);
	}
}
