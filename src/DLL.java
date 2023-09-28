
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class DLL {
    DLLNode head;
    DLLNode tail;
    
    ArrayList<String> searchList = new ArrayList<>();
    
    public DLL() {
        head = null;
        tail = null;
    }
    
    public boolean isEmpty(){
        if(head == null){
            return true;
        }
        else{
            return false;
        }
    }
    
    public int noOfNodes(){
        int count = 0;
        DLLNode temp = head;
        while(temp != null){
            temp = temp.next;
            count++;
        }
        return count;
    }
    
    public String[] nodeAt(int num){
        int count = 0;
        DLLNode temp = head;
        while(count < num){
            temp = temp.next;
            count++;
        }
        String[] nameNum = {"",""};
        
        nameNum[0] = temp.name;
        nameNum[1] = temp.num;
        return nameNum;
    }
    
    public void insertFirst(String name,String num){
        DLLNode newNode = new DLLNode(name,num);
        if(head == null){
            head = tail = newNode;

        }
        else{
            head.prev = newNode;
            newNode.next = head;
            head = newNode;
        }
    }
    
    public void insertEnd(String name,String num){
        DLLNode newNode = new DLLNode(name,num);
        if(head == null){
            head = tail = newNode;
        }
        else{
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }
    
    public void printLast(){
        DLLNode temp = tail;
        System.out.println(temp.next);
    }
    
    public void deleteEnd(){
        tail = tail.prev;
    }
    
    public void deleteIndex(int n){
        if (head == null || n <= 0){
            return;
        }
        DLLNode temp = head;
        int i;
        for (i = 1; temp != null && i < n; i++){
            temp = temp.next;
        }
        // if n>no. of nodes
        if (temp == null)
            return;
 
        deleteNode(temp);
    }
    
    public DLLNode deleteNode(DLLNode temp) {
        if (head == null || temp == null){
            return null;
        }
        // if node == first node
        if (head == temp){
            head = temp.next;
        }
        //if node == tail node
        if(tail == temp){
            tail = temp.prev;
        }
        // if node != last node
        if (temp.next != null){
            temp.next.prev = temp.prev;
        }
        // if node != first node
        if (temp.prev != null){
            temp.prev.next = temp.next;
        }
        temp = null;
        
        return head;
    }
    
    
    public ArrayList SearchAdvanced(String key){
        key = key.trim();
        DLLNode temp = head;
        int keySize = key.length();
        String name;
        

        
        while(temp != null){
            name = temp.name;
            int contactNameSize = name.length();
            
            if(contactNameSize > keySize){      // if the inputted key is smaller than the name of contact in linked list, the contact name will be shortened.
                name = name.substring(0, keySize);
            }
            
            if(key.equalsIgnoreCase(name)){
                System.out.println(temp.name+" "+temp.num);
                searchList.add(temp.name);
                searchList.add(temp.num);
            }
            temp = temp.next;
        }

        return searchList;
    }
    
    public String search(String key){
        key = key.trim();
        DLLNode temp=head;
        boolean found = false;
        if(head==null){
            System.out.println("List is empty.");
        }
        String num = null, name = null;
        while(temp.next != null){

            if(temp.num.equals(key) || temp.name.equalsIgnoreCase(key)){
                name = temp.name;
                num = temp.num;
                found = true;
                break;
            }
            else{
                temp = temp.next;
            }
        }
        if(found){
            return("Name:\t"+name+"\nNumber:\t"+num);
        }
        else{
            return"Not found";
        }
    }
    
    
    
    public void traverseForward(){
        DLLNode temp;
        temp = head;
        System.out.print("[");
        while(temp != null){
            System.out.print("{" +temp.name+", "+temp.num + "}");
            if(temp.next != null){
                System.out.print(", ");
            }
            temp = temp.next;
        }
        System.out.println("]");
    }
    
    public void traverseBackward(){
        DLLNode temp;
        temp = tail;
        System.out.print("[");
        while(temp != null){
            System.out.print("{"+temp.name+", "+temp.num+"}");
            if(temp.prev != null){
                System.out.print(", ");
            }
        temp = temp.prev;
        }
        System.out.println("]");
    }
    
    public void printFile(String location){
        DLLNode temp = head;
        try {
            PrintWriter pw = new PrintWriter(new FileOutputStream(location));
            while(temp != null){
                pw.println(temp.name+","+temp.num);
                temp = temp.next;
            }
            pw.close();
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
