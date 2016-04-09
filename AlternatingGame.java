/**
 * AlternatingGame class
 *
 * Defines functionality for games where two players take turns
 */

package ds2016;

abstract class AlternatingGame extends TurnTakingGame {
    int whoseTurn = 1;        // The player whose turn it is.

    // isHuman[1] is true if Player 1 is a human, false otherwise
    boolean[] isHuman = {false, false, false}; // initialize to human vs. computer 

    void playGame(){
        boolean gameOver = false;
        while(!gameOver){
            drawBoard();
            getPlayerMove();
            gameOver = isGameOver();
            if(gameOver)
                doEndgameStuff();
        }
    }

    void getPlayerMove(){
        if(isHuman[whoseTurn] == true)
            getHumanMove();
        else
            getComputerMove();
    }

    /**
     * Simply declares who won, if anybody.
     */
    void doEndgameStuff(){
        int winner = whoWon();
        if(winner == 0)
            System.out.println("It was a tie!");
        else
            System.out.printf("Player %d won the game\n", winner);
    }

    abstract void drawBoard();
    abstract void getHumanMove();
    abstract void getComputerMove();
    abstract int  whoWon();
}
