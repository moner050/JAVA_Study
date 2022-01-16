package ch04.graph;

public class UndirectedGraph {
	
	private int count;
	private int[][] vertexMatrix;
	
	public UndirectedGraph(int count)
	{
		this.count = count;
		vertexMatrix = new int[count][count];
	}
	
	// UndirectedGraph여서 from과 to가 바껴도 값은 똑같다.
	public void addEdges(int from, int to, int weight)
	{
		vertexMatrix[from][to] = weight;
		vertexMatrix[to][from] = weight;
	}
	
	// 2차원 배열의 정보를 쓸수 있게
	public int[][] getMatrix()
	{
		return vertexMatrix;
	}
	
}
