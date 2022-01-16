package ch04.graph;

public class UndirectedGraph {
	
	private int count;
	private int[][] vertexMatrix;
	
	public UndirectedGraph(int count)
	{
		this.count = count;
		vertexMatrix = new int[count][count];
	}
	
	// UndirectedGraph���� from�� to�� �ٲ��� ���� �Ȱ���.
	public void addEdges(int from, int to, int weight)
	{
		vertexMatrix[from][to] = weight;
		vertexMatrix[to][from] = weight;
	}
	
	// 2���� �迭�� ������ ���� �ְ�
	public int[][] getMatrix()
	{
		return vertexMatrix;
	}
	
}
