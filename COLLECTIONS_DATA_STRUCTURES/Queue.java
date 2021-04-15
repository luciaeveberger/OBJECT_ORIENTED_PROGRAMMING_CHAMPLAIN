package COLLECTIONS_DATA_STRUCTURES;

class Queue {
    QNode front, rear;

    public Queue()
    {
        this.front = this.rear = null;
    }

    // Method to add an key to the queue.
    void enqueue(int key)
    {

        // Create a new LL node
        QNode temp = new QNode(key);

        // If queue is empty, then new node is front and rear both
        if (this.rear == null) {
            this.front = this.rear = temp;
            return;
        }

        // Add the new node at the end of queue and change rear
        this.rear.next = temp;
        this.rear = temp;
    }

    // Method to remove an key from queue.
    void dequeue()
    {
        // If queue is empty, return NULL.
        if (this.front == null)
            return;

        // Store previous front and move front one node ahead
        QNode temp = this.front;
        this.front = this.front.next;

        // If front becomes NULL, then change rear also as NULL
        if (this.front == null)
            this.rear = null;
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(50);
        q.dequeue();
        System.out.println("This value is returned!");
        System.out.println("Queue Front : " + q.front.key);
        System.out.println("Queue End : " + q.rear.key);

            int rows = 5, i = 1, j = 1;

            while (i <= rows) {
                while (j <= i) {
                    System.out.print("*");
                    j++;

                }
                System.out.print("\n");
                i++;
                j = 1;
            }

    }
}
