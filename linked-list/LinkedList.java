import java.util.List;

public class LinkedList {

  public static void main(String args[]) {
    MyLinkList list=new MyLinkList();
    list.add("balu", "balwinder");
    list.add("david", "Davinder");
    list.add("parash", "kaundal");
    list.add("rahul", "rahul");
    list.add("rahuldd", "rahul");

    System.out.println(list.find("david"));
    System.out.println(list.find("balu"));
    System.out.println(list.find("sss"));
    System.out.println(list.find("rahul"));
    System.out.println(list.size);
  }
}

class MyNode {

  String key;
  Object value;
  MyNode next;

  public MyNode(String key, Object value, MyNode next) {
    this.key = key;
    this.value = value;
    this.next = next;
  }
}

class MyLinkList {

  int size = 0;
  MyNode first;
  MyNode last;

  public void add(String key, Object value) {
    if (first == null) {
      first = new MyNode(key, value, null);
    } else if (last == null) {
      last = new MyNode(key, value, null);
      first.next = last;
    } else {
      MyNode _last = last;
      last = new MyNode(key, value, null);
      _last.next = last;
    }

    size++;
  }

  public Object find(String key) {
    // if(first==null) return null;
    MyNode node = first;
    while (node != null) {
      if (node.key.equals(key)) {
        return node.value;
      }
      node = node.next;
    }

    return null;
  }
}
