package grosirkosmetik;

public class Node {
    Node next;
    String[] data;
    
    Node(){
        next = null;
        data = null;
    }
    
    Node(String[] _data){
        next = null;
        data = _data;
    }
    
    Node(String[] _data, Node _next){
        next = _next;
        data = _data;
    }
}
