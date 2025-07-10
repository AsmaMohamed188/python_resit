/**
 * Class whose objects represent action nodes in flow charts
 * @author p0073862
 */

 // ActionNode is a sublass of Node 
public class ActionNode  {
    //TODO Add appropriate (private) attributes

    public ActionNode(String title, double displayX, double displayY) {
        //NOTE: If you have implemented the superclass constructor correctly, then you just need to call
        //the constructor of the super class
       
    }

    
    public Node getNext(boolean choice) {
        //TODO: Implement this method correctly
        return null;
    }
    /**
     * Set the node that follows this one in the flow chart. That is to say
     * the node to which we advance when this node is completed
     * @param nextNode the next node
     */
    public void setNext(Node nextNode) {
        //TODO: Implement this method correctly
    }    

}
