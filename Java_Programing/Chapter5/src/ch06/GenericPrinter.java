package ch06;

// ���ʸ� Ÿ���� ���� ���ؼ� <T>�� �����ش�.
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
