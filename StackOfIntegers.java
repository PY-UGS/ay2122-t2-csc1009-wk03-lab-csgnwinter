

public class StackOfIntegers {
    private int elements[] = new int[0];     //bottom is on the left most and top is right most
    private int size = this.elements.length;

    public StackOfIntegers(int capacity){
        this.elements = new int[capacity];
    }

    public StackOfIntegers(){
        this.elements = new int[16];
    }

    public boolean empty(){
        if (this.size == 0){
            return true;
        }
        else {
            return false;
        }
    }

    public int peek(){
        return this.elements[this.size -1];
    }

    public void push(int value){
        this.elements[this.size] = value;
        this.size +=1;
    }

    public int pop(){       //Stack pointer will decrease but the value at the og SP position will still remain. When need to push the value above will just be overwritten into
        int popped = this.elements[this.size -1];
        this.size -= 1;
        return popped;
    }

    public int getSize(){
        return this.size;
    }
}
