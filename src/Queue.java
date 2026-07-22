public class Queue {
    private String[] elements;
    private int front;
    private int rear;
    private int size;
    private int capacity;
    
    public Queue(int capacity) {
        this.capacity = capacity;
        this.elements = new String[capacity];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    public void enqueue(String element) {
        if (isFull()) {
            throw new IllegalStateException("Queue is full");
        }
        rear = (rear + 1) % capacity;
        elements[rear] = element;
        size++;
    }

    public String dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        String element = elements[front];
        front = (front + 1) % capacity;
        size--;
        return element;
    }

    public String peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return elements[front];
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public void clear() {
        front = 0;
        rear = -1;
        size = 0;
    }
    
    public String printMenu() {
    	

    	return "";
    }
}