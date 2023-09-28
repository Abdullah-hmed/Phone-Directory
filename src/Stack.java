public class Stack {
    DLL ll = new DLL();
    int count = 0;
    public void push(String name, String num){
        ll.insertEnd(name, num);
        count++;
    }
    
    public void pop(){
        if(count == 0){
            System.out.println("Stack Empty");
        }
        else{
            ll.deleteIndex(count);
            count--;
        }
    }
    
    public String peek(){
        if(count != 0){
            System.out.println(ll.tail.name+", "+ll.tail.num);
            return ll.tail.name+","+ll.tail.num;
        }
        else{
            return "";
        }
    }
    
    public void display(){
        ll.traverseForward();
    }
}
