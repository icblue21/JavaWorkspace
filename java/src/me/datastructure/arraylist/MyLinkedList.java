package me.datastructure.arraylist;

public class MyLinkedList {
    private MyListNode head;
    int count;

    public MyLinkedList()
    {
        head = null;
        count = 0;
    }

    public MyListNode addElement( String data )
    {

        MyListNode newNode;
        if(head == null){  //맨 처음일때
            newNode = new MyListNode(data);
            head = newNode;
        }
        else{ // 첫번째 노드가 아닌 경우
            newNode = new MyListNode(data);
            MyListNode temp = head; // 처음 노드
            while(temp.next != null) {  //맨 뒤로 가서
                temp = temp.next;
            }
            temp.next = newNode; // 맨 뒤에 새 노드 삽입
        }
        count++;
        return newNode;
    }

    public MyListNode insertElement(int position, String data )
    {
        int i;
        MyListNode tempNode = head; // 처음 노드
        MyListNode newNode = new MyListNode(data);

        if(position < 0 || position > count ){
            System.out.println("추가 할 위치 오류 입니다. 현재 리스트의 개수는 " + count +"개 입니다.");
            return null;
        }

        if(position == 0){  //맨 앞으로 들어가는 경우
            newNode.next = head; // 새로운 노드의 next를 현재 처음 노드로 설정
            head = newNode; // head를 새로운 노드로 변경 -> New node -> head -> ... 이렇게 연결 됨
        }
        else{
            MyListNode preNode = null;
            for(i=0; i<position; i++){
                preNode = tempNode;
                tempNode = tempNode.next;

            }
            newNode.next = preNode.next;
            preNode.next = newNode;
        }
        count++;
        return newNode;
    }

    public MyListNode removeElement(int position)
    {
        int i;
        MyListNode tempNode = head;

        if(position >= count ){
            System.out.println("삭제 할 위치 오류입니다. 현재 리스트의 개수는 " + count +"개 입니다.");
            return null;
        }

        if(position == 0){  //맨 앞을 삭제하는
            head = tempNode.next; // 처음 노드의 다음 노드를 head로 설정
        }
        else{
            MyListNode preNode = null;
            for(i=0; i<position; i++){
                preNode = tempNode; // preNode = 처음 노드
                tempNode = tempNode.next; // tempNode(처음노드) -> 다음 노드로 변경
            }
            preNode.next = tempNode.next; // preNode.next = 처음노드의 다음 노드를 가리키게 함
        }
        count--; // 결국 temp 노드가 사라지게 됨.
        System.out.println(position + "번째 항목 삭제되었습니다.");

        return tempNode;
    }

    public String getElement(int position)
    {
        int i;
        MyListNode tempNode = head;

        if(position >= count ){
            System.out.println("검색 위치 오류 입니다. 현재 리스트의 개수는 " + count +"개 입니다.");
            return new String("error");
        }

        if(position == 0){  //맨 인 경우

            return head.getData();
        }

        for(i=0; i<position; i++){
            tempNode = tempNode.next;

        }
        return tempNode.getData();
    }

    public MyListNode getNode(int position)
    {
        int i;
        MyListNode tempNode = head;

        if(position >= count ){
            System.out.println("검색 위치 오류 입니다. 현재 리스트의 개수는 " + count +"개 입니다.");
            return null;
        }

        if(position == 0){  //맨 인 경우

            return head;
        }

        for(i=0; i<position; i++){
            tempNode = tempNode.next;

        }
        return tempNode;
    }

    public void removeAll()
    {
        head = null;
        count = 0;

    }

    public int getSize()
    {
        return count;
    }

    public void printAll()
    {
        if(count == 0){
            System.out.println("출력할 내용이 없습니다.");
            return;
        }

        MyListNode temp = head;
        while(temp != null){
            System.out.print(temp.getData());
            temp = temp.next;
            if(temp!=null){
                System.out.print("->");
            }
        }
        System.out.println("");
    }

    public boolean isEmpty()
    {
        if(head == null) return true;
        else return false;
    }
}
