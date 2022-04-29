package treeTest;

class Node {
    Node left;
    Node right;
    int value;
    public Node (int data) {
        this.value = data;
        this.left = null;
        this.right = null;
    }
}

public class NodeMgmt {
    Node head = null;

    public boolean insertNode(int data) {
        // CASE1: Node 가 하나도 없을 때
        if (this.head == null)  this.head = new Node(data);
        else
        {
            // CASE2: Node 가 하나 이상 들어가 있을 때
            Node findNode = this.head;
            while (true)
            {
                // CASE2-1: 현재 Node 의 왼쪽에 Node 가 들어가야할 때
                if (data < findNode.value)
                {
                    if (findNode.left != null) findNode = findNode.left;
                    else
                    {
                        findNode.left = new Node(data);
                        break;
                    }
                    // CASE2-2: 현재 Node 의 오른쪽에 Node 가 들어가야할 때
                }
                else
                {
                    if (findNode.right != null) findNode = findNode.right;
                    else
                    {
                        findNode.right = new Node(data);
                        break;
                    }
                }
            }
        }
        return true;
    }

    public Node search(int data) {
        // CASE1: Node 가 하나도 없을 때
        if (this.head == null) return null;
        else
        {
            // CASE2: Node 가 하나 이상 있을 때
            Node findNode = this.head;
            while (findNode != null)
            {
                /* 한번 고민해서 작성해보세요 */
                if (findNode.value == data) return findNode;
                else if (findNode.value > data) findNode = findNode.left;
                else if (findNode.value < data) findNode = findNode.right;
            }
            return null;
        }
    }

    public boolean delete(int value) {
        boolean searched = false;

        Node currParentNode = this.head;
        Node currNode = this.head;

        // 코너 케이스1: Node 가 하나도 없을 때
        if (this.head == null)
        {
            /* 한번 고민해서 작성해보세요 */
            return false;
        }
        else
        {
            // 코너 케이스2: Node 가 단지 하나만 있고, 해당 Node 가 삭제할 Node 일 때
            if (this.head.value == value && this.head.left == null && this.head.right == null) {
                /* 한번 고민해서 작성해보세요 */
                this.head = null;
                return true;
            }

            while (currNode != null) {
                if (currNode.value == value)
                {
                    searched = true;
                    break;
                }
                else if (value < currNode.value)
                {
                    currParentNode = currNode;
                    currNode = currNode.left;
                }
                else
                {
                    currParentNode = currNode;
                    currNode = currNode.right;
                }
            }

            if (searched == false) return false;
            // Case1: 삭제할 Node 가 Leaf Node 인 경우
            if (currNode.left == null && currNode.right == null) {
                if (value < currParentNode.value)
                {
                    /* 한번 고민해서 작성해보세요 */
                    currParentNode.left = null;
                    currNode = null;
                }
                else
                {
                    /* 한번 고민해서 작성해보세요 */
                    currParentNode.right = null;
                    currNode = null;
                }
                return true;
            }
            // Case2-1: 삭제할 Node 가 Child Node를 한 개 가지고 있을 경우 (왼쪽에 Child Node 가 있을 경우)
            else if (currNode.left != null && currNode.right == null)
            {
                if (value < currParentNode.value)
                {
                    /* 한번 고민해서 작성해보세요 */
                    currParentNode.left = currNode.left;
                    currNode = null;
                }
                else
                {
                    /* 한번 고민해서 작성해보세요 */
                    currParentNode.right = currNode.left;
                    currNode = null;
                }
                return true;
                // Case2-2: 삭제할 Node 가 Child Node를 한 개 가지고 있을 경우 (오른쪽에 Child Node 가 있을 경우)
            }
            else if (currNode.left == null && currNode.right != null) {
                if (value < currParentNode.value)
                {
                    /* 한번 고민해서 작성해보세요 */
                    currParentNode.left = currNode.right;
                    currNode = null;
                }
                else
                {
                    /* 한번 고민해서 작성해보세요 */
                    currParentNode.right = currNode.right;
                    currNode = null;
                }
            }
        }
        // 여기까지 실행되면,
        // currNode 에는 해당 데이터를 가지고 있는 Node,
        // currParentNode 에는 해당 데이터를 가지고 있는 Node 의 부모 Node
        return true;
    }

    public static void main(String[] args) {
        NodeMgmt myTree = new NodeMgmt();
        myTree.insertNode(10);
        myTree.insertNode(15);
        myTree.insertNode(5);
        myTree.insertNode(3);
        myTree.insertNode(12);

        System.out.println(myTree.delete(5));
        System.out.println(myTree.search(5));
    }
}
