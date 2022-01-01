package ch06;

import java.util.ArrayList;

class Animal
{
	public void move()
	{
		System.out.println("������ �����Դϴ�.");
	}
}

class Human extends Animal
{

	@Override
	public void move() {
		System.out.println("����� �� �߷� �Ƚ��ϴ�.");
	}
	
	public void readBook()
	{
		System.out.println("����� å�� �н��ϴ�.");
	}
}

class Tiger extends Animal
{

	@Override
	public void move() {
		System.out.println("ȣ���̰� �� �߷� �Ƚ��ϴ�.");
	}
	
	public void hunting()
	{
		System.out.println("ȣ���̰� ����� �մϴ�.");
	}
}

class Eagle extends Animal
{

	@Override
	public void move() {
		System.out.println("�������� �ϴ��� ���� �ٴմϴ�.");
	}
	
	public void flying()
	{
		System.out.println("�������� �糯���� �� ��� ���ƴٴմϴ�.");
	}
}

public class AnimalTest {

	public static void main(String[] args)
	{
		Animal hAnimal = new Human();
		Animal tAnimal = new Tiger();
		Animal eAnimal = new Eagle();
		
		AnimalTest test = new AnimalTest();
		test.moveAnimal(hAnimal);
		test.moveAnimal(tAnimal);
		test.moveAnimal(eAnimal);
		
		ArrayList<Animal> animalList = new ArrayList<>();
		animalList.add(hAnimal);
		animalList.add(tAnimal);
		animalList.add(eAnimal);
		
		for(Animal animal : animalList)
		{
			animal.move();
		}
	}
	
	public void moveAnimal(Animal animal)
	{
//		animal.move();
		// �̰��� �����ϱ� ���ؼ��� �ٿ�ĳ������ �ؾ��Ѵ�.
		// animal.flying();
	}
}