public class DLLNode {
    String name;
    String num;
    DLLNode next; 
    DLLNode prev; 

    public DLLNode(String name,String num) {
        this.num = num;
        this.name = name;
        
        next = null;
        prev = null;
    }

    
    
}
