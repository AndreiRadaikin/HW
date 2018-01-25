 class Node {
    private int data;
    private Node bigger;
    private Node smaller;

    public Node(int data, Node bigger, Node smaller) {
        this.data = data;
        bigger = null;
        smaller = null;
    }

     public int getData() {
         return data;
     }

     public void setData(int data) {
         this.data = data;
     }

     public Node getBigger() {
         return bigger;
     }

     public void setBigger(Node bigger) {
         this.bigger = bigger;
     }

     public Node getSmaller() {
         return smaller;
     }

     public void setSmaller(Node smaller) {
         this.smaller = smaller;
     }
 }
