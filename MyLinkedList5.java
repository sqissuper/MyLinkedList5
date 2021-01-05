    class Node{
    public Node next;
    public int val;
    //默认构造方法
    public Node(){

    }
    public Node(int val){
        this.val = val;
    }
}
public class MyLinkedList {
    //打印链表
    public void disPlay1(){
        Node ret = this.head;
        while(ret != null){

            System.out.print(ret.val + " ");
            ret = ret.next;
        }
    }

    public void display2(){
        Node ret = this.head1;
        while(ret != null){

            System.out.print(ret.val + " ");
            ret = ret.next;
        }
    }

    //判断是链表空否
    public boolean isFull(){
        if(this.head == null){
            return true;
        }
        return false;
    }
    //删除链表重复
    public Node deleteDuplication()
    {
        if(this.head == null)
            return null;
        Node newHead = new Node();
        Node tmp = newHead;
        Node cur = this.head;
        while(cur != null) {
            if(cur.next != null && cur.val == cur.next.val) {
                while(cur.next != null && cur.val == cur.next.val){
                    cur = cur.next;
                }
                cur = cur.next;
            }else{
                tmp.next = cur;
                tmp = tmp.next;
                cur = cur.next;
            }
            tmp.next = null;
        }
        return newHead.next;
    }
    
    //给一定值x，编写一段代码将所有小于x的结点排在其余结点之前，且不能改变原来的数据顺序，返回重新排列后的链表的头指针。
    public Node partition(int x) {
        //定义在x前的节点
        Node Bs = null;
        Node Be = null;
        //定义在x后的节点
        Node As = null;
        Node Ae = null;
        if(this.head == null){
            return null;
        }
        Node cur = this.head;
        while(cur != null){
            if(cur.val < x){
                if(Bs == null){
                    Bs = cur;
                    Be = cur;
                }else{
                    Be.next = cur;
                    Be = Be.next;
                }
            }else{
                if(As == null){
                    As = cur;
                    Ae = cur;
                }else{
                    Ae.next = cur;
                    Ae = Ae.next;
                }
            }
            cur = cur.next;
        }
        //第一段为空返回As
        if(Bs == null){
            return As;
        }
        //若最后节点不为空，则置为空
        if(As != null){
            Ae.next = null;
        }
        Be.next = As;
        return Bs;
    }

    public Node head;//头节点
    //创建链表
    public void creatList1(){
        this.head = new Node(1);
        Node node2 = new Node(9);
        Node node3 = new Node(9);
        Node node4 = new Node(2);
        Node node5 = new Node(12);
        this.head.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
    }
//        Node ret = myList.partition(3);//分割
//        while(ret != null){
//            System.out.print(ret.val + " ");
//            ret = ret.next;
//        }
//        Node ret = myList.deleteDuplication();删除重复链表
//        while(ret != null){
//            System.out.print(ret.val + " ");
//            ret = ret.next;
//        }
        }
    }
