public class Node {

    public int key; //ключ узла
    public String data; //некоторые данные в узле
    public Node leftChild; //левый потомок
    public Node rightChild; //правый потомок

    public Node() {          //конструктор
    }


    /**
     * Метод который выводит на экран содержимое узла
     */
    public void printNode(){
        System.out.println("Номер " + key + " Имя: " + data);
    }
}
