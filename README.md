# knight_puzzle
Java based recursive solution for the classic puzzle of a knight piece traveling through all squares of a chess board without landing on a previously visited square. This solution is a little interesting since its recursion occurs within an if statement. 

By: Eric Fleith

Due to the nature of 2D arrays and how to print them, the X and Y axis are rotated 90 degrees clockwise, meaning the X axis is vertical and values increment from top to bottom, and the Y axis is horizontal and increments from left to right.

[x,y]

[0,0] [0,1] [0,2] [0,3]...

[1,0] [1,1] [1,2] [1,3]...

[2,0] [2,1] [2,2] [2,3]...

...

The moves# found in the move method are mapped as follows:

[-] [6] [-] [7] [-]

[5] [-] [-] [-] [8]

[-] [-] [k] [-] [-]

[4] [-] [-] [-] [1]

[-] [3] [-] [2] [-]


The only thing you should change in the main method is the board size number, the board will be the square of the size you pick.
Choosing a size greater than 8 might take several hours to finish, though with proper alterations it's possible to greatly reduce the solution time. For size less or equal to 8 the solution is done very fast. 
