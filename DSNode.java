/**
 * DSNode class
 *
 * Holds some fields like winner, children
 *
 * used to build a game tree, and maybe other uses, too.
 *
 * Author DS2016 
 */

package ds2016;

class DSNode{
    // The winner of the tree that has this node as root
    private int winner;    // 0 = tie, 1, 2, 3, ... = the wining player    
    private Object   board;
    private DSNode[] children = new DSNode[10];
    private int      numChildren = 0;

    public void setBoard(Object b){
        board = b;
    }

    public DSNode[] getChildren(){
        return children;
    }

    public void setChildren(DSNode[] ch){
        children = ch;
    }

    public void addChild(DSNode ch){
        if(numChildren >= 10)
            return;
        children[numChildren] = ch;
        numChildren++;
    }
    // a getter for the numChildren variable
    public int getNumChildren(){
        return numChildren;
    }

    // a getter for the board
    public Object getBoard(){
        return board;
    }

    public int getWinner(){
        return winner;
    }


    public void setWinner(int w){
        this.winner = w;
    }
}
