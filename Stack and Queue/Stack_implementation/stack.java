public class stack {
    protected int[] arr = null;
    protected int capacity = 0;
    protected int  elementCount = 0;
    protected int tos = -1;

    //==================Constructor=======================================

    protected void initializeVariables(int capacity){
        this.capacity = capacity;
        this.arr = new int[this.capacity];
        this.elementCount = 0;
        int tos = -1;
    }

    public stack(){
        this.capacity = 10;
        initializeVariables();
    }

    public stack(int size){
        initializeVariables(size);
    }

    //=================basic function =======================================

    public int size(){
        return this.elementCount;
    }
    public boolean isEmpty(){
        return this.elementCount == 0;
    }
    public void display{

    }

    //=============Exception Handling =======================================

    private void overflowException() throws Exception{
        
    }
}