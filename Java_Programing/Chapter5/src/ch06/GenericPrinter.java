package ch06;

// 제너릭 타입을 쓰기 위해서 <T>를 붙혀준다.
public class GenericPrinter<T> {

	private T material;

	public T getMaterial() {
		return material;
	}

	public void setMaterial(T material) {
		this.material = material;
	}
	
	public String toString()
	{
		return material.toString();
	}
}
