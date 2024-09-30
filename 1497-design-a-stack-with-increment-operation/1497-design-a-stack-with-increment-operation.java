class CustomStack {
    private int[] stack;
    private int size;
    private int maxSize;
    public CustomStack(int maxSize) {
        this.stack = new int[maxSize];
        this.size = 0;
        this.maxSize = maxSize;
    } 
    public void push(int x) {
        if(size < maxSize)
        {
            stack[size] = x;
            size++;
        }
    }
    public int pop() {
        if(size == 0)
        {
            return -1;
        }
        int top = stack[size-1];
        size--;
        return top;
    } 
    public void increment(int k, int val) {
        int limit = Math.min(k,size);
        for(int i=0; i<limit; i++)
        {
            stack[i] += val;
        }
    }
}