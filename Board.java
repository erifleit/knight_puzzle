public class Board{

   private int size,x,y,step;
   private Square[][] board;

   public Board(){}
   public Board(int s){
      size = s;
      x = 0;
      y = 0;
      step = 1;
      board = new Square[size][size];
      for(int i = 0 ; i < size ; i++){
         for(int j = 0 ; j < size ; j++){
            board[i][j] = new Square();
         }
      }
   }

   public String start(){
      board[x][y].visit(step);
      if (move(x,y,step)){
         return printBoard()+"\nSuccess!";
      }
      return "failed";
   }

   private boolean move(int fx, int fy, int st){
      board[fx][fy].visit(st);
      if(st == size*size){
         return true;
      }
      //move 1
      int xx = fx+1;
      int yy = fy+2;
      if (xx >= 0 && xx < size && yy >= 0 && yy < size){
         if (board[xx][yy].hasVisited()==false){
            if (move(xx,yy,st+1)) return true;
         }
      }
      //move 2
      xx = fx+2;
      yy = fy+1;
      if (xx >= 0 && xx < size && yy >= 0 && yy < size){
         if (board[xx][yy].hasVisited()==false){
            if (move(xx,yy,st+1)) return true;
         }
      }
      //move 3
      xx = fx+2;
      yy = fy-1;
      if (xx >= 0 && xx < size && yy >= 0 && yy < size){
         if (board[xx][yy].hasVisited()==false){
            if (move(xx,yy,st+1)) return true;
         }
      }
      //move 4
      xx = fx+1;
      yy = fy-2;
      if (xx >= 0 && xx < size && yy >= 0 && yy < size){
         if (board[xx][yy].hasVisited()==false){
            if (move(xx,yy,st+1)) return true;
         }
      }
      //move 5
      xx = fx-1;
      yy = fy-2;
      if (xx >= 0 && xx < size && yy >= 0 && yy < size){
         if (board[xx][yy].hasVisited()==false){
            if (move(xx,yy,st+1)) return true;
         }
      }
      //move 6
      xx = fx-2;
      yy = fy-1;
      if (xx >= 0 && xx < size && yy >= 0 && yy < size){
         if (board[xx][yy].hasVisited()==false){
            if (move(xx,yy,st+1)) return true;
         }
      }
      //move 7
      xx = fx-2;
      yy = fy+1;
      if (xx >= 0 && xx < size && yy >= 0 && yy < size){
         if (board[xx][yy].hasVisited()==false){
            if (move(xx,yy,st+1)) return true;
         }
      }
            //move 8
      xx = fx-1;
      yy = fy+2;
      if (xx >= 0 && xx < size && yy >= 0 && yy < size){
         if (board[xx][yy].hasVisited()==false){
            if (move(xx,yy,st+1)) return true;
         }
      }
      board[fx][fy].unvisit();
      return false;
   }
   public String printBoard(){
      String rs = "";
      for(int i = 0 ; i < size ; i++){
         for(int j = 0 ; j < size ; j++){
            rs += board[i][j].printSquare();
         }
         rs+="\n";
      }
      return rs;
   }
   public int getSize(){
      return size;
   }
}
