package application.entities;

public class Worker implements Comparable<Worker> {
	private String name;
	private double salary;

	public Worker(String name, double salary)  {
		super();
		this.name = name;
		this.salary = salary;
	}

	public Worker() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public int compareTo(Worker o) {
		// TODO Auto-generated method stub
		return name.compareTo(o.getName());
	}

}
