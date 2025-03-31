import com.sun.jdi.Value;
import org.w3c.dom.Node;

public class LinkedList {
    // public LinkedList(int value)
    //create new node
    // public void append(int value)
    //create a new node
    // add node to end
    // public  void  prepend(int value)
    //create a new node
    // add node to beginning
    // public boolean insert(int index, int value)
    //create new node
    // insert node
   public Node removeLast(){
   if (length == 0) return null;
   Node temp = head ;
   Node pre = head;
   while (temp.next!=null){
     pre = temp;
     temp=temp.next;
   }
   tail = pre;
   tail.next=null;
   length--;
   if (length == 0){
       head = null;
       tail = null;
   }
   return temp;
   }
}












