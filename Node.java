// Copy and Paste here your implementation of the Node Class 
public class Node {

    //TODO: Add suitable (private) attributes

    public Node(String title, double displayX, double displayY) {
      //TODO: Implement this constructor
    }
/*
 * Resit Assingment Exercise 1,
 * Node.java
 * 
 */

/**
 * Class whose objects represent nodes in a flow chart
 *
 * @author 19270589
 * This is the file part of the resit test bed for implementing the Node class
 */
public class Node {
    private String title;
    private double displayX;
    private double displayY;

    public Node(String title, double displayX, double displayY) {
    
      this.title = title;
      this.displayX = displayX;
      this.displayY = displayY;
    }

}    
    public String getTitle() {
      return title;
    }

    /**
     * Return a value indicating the horizontal position of the node when
     * displayed in a GUI. Should be in range 0 (extreme left of display area)
     * to 1 (extreme right). 
     *
     * @return horizontal position
     */
    public double getDisplayX() {
      if (displayX<0||displayX>1){
        throw new IllegalArgumentException("Display X coordinate is not valid");
      }
      return displayX;
    }

    /**
     * Return a value indicating the vertical position of the node when
     * displayed in a GUI. Should be in range 0 (top of display area) to 1
     * (bottom).
     *
     * @return vertical position
     */
    public double getDisplayY() {
      if (displayY<0||displayY>1){
        throw new IllegalArgumentException("Display Y coordinate is not valid");
      }
      return displayY;
    }

    /**
     * Return a node that follows this one in the flow chart. If this node is an
     * ActionNode the method returns its 'next node', and the choice parameter
     * is ignored. If this node is a DecisionNode, then the method returns
     * either the next node on the "Yes" branch of the decision (if choice is
     * true) or on the "No" branch (if choice is false).
     *
     * @param choice If this node is a DecisionNode then the choice parameter
     * specifies whether the "Yes" branch or the "No" branch is to be returned.
     * It is ignored if the current node is an ActionNode.
     * @return the next node along the specified branch.
     */
    public Node getNext(boolean choice) {
      //N.B. You do NOT need to change the implementation below.
      //You will override it in subclasses
      return null;
    }
}
}
