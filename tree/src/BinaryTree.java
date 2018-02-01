public class BinaryTree {
    private Node root;

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    private Node addRecursive(Node current, int data){
        if(current == null){
            return new Node(data);
        }

        if (data < current.getData()){
            current.setSmaller(addRecursive(current.getSmaller(),data));
        } else if (data > current.getData()){
            current.setBigger(addRecursive(current.getBigger(),data));
        }

        return current;
    }

    public void add(int data){
        setRoot(addRecursive(getRoot(),data));
    }

    private String toStringRecursive (Node node){
        String string = "";

        if(node.getSmaller() != null){
            string += toStringRecursive(node.getSmaller());
        }

        string += node.getData() + " ";

        if(node.getBigger() != null){

            string += toStringRecursive(node.getBigger());
        }

        return string;
    }

    @Override
    public String toString (){
        return toStringRecursive(root);
    }

    private boolean containRecursive (Node current, int temp){
        if(current.getData() == temp){
            return true;
        }
        if(current.getData() > temp){
            if(current.getSmaller() == null){
                return false;
            }
            else {
              return containRecursive(current.getSmaller(), temp);
            }
        }
        if(current.getData() < temp){
            if(current.getBigger() == null){
                return false;
            }
            else {
               return containRecursive(current.getBigger(), temp);
            }
        }

        return false;
    }

    public boolean contain (int temp){
        return containRecursive(root, temp);
    }
}
