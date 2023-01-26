class PathApp
{
public static void main(String[] args)
{
Graph theGraph = new Graph();
theGraph.addVertex('Бишкек'); // 0 (исходная вершина)
theGraph.addVertex('Каракол'); // 1
theGraph.addVertex('Токмок'); // 2
theGraph.addVertex('Талас'); // 3
theGraph.addVertex('Ош'); // 4
theGraph.addVertex('Каракол'); // 1
theGraph.addVertex('Токмок'); // 2
theGraph.addVertex('Талас'); // 3
theGraph.addVertex('Ош'); // 4
theGraph.addVertex('Каракол'); // 1
theGraph.addVertex('Токмок'); // 2
theGraph.addEdge(0, 1, 450); // Бишкек-Каракол 50
theGraph.addEdge(0, 2, 72); // Бишкек - Талас  80
theGraph.addEdge(0, 3, 460); // Каракол - Токмок 60
theGraph.addEdge(0, 4, 90); // Каракол -  Талас 90
theGraph.addEdge(0, 5, 40); // Токмок - Ош 40
theGraph.addEdge(0, 6, 20); // Талас-  Токмок 20
theGraph.addEdge(0, 7, 70); // Талас - Ош70
theGraph.addEdge(0, 8, 50); // Ош-Каракол 50
theGraph.addEdge(0, 9, 20); // Талас-  Токмок 20
theGraph.addEdge(0, 10, 70); // Талас - Ош70
theGraph.addEdge(0, 11, 50); // Ош-Каракол 50
System.out.println("Shortest paths");
theGraph.path(); // Кратчайшие пути
System.out.println();
}
} //