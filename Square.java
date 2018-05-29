public class Square{

   private boolean visited;
   private int step;

   public Square(){
      visited = false;
   }
   public Square(boolean v){
      visited = v;
   }
   public boolean hasVisited(){
      return visited;
   }
   public void visit(int s){
      visited = true;
      step = s;
   }
   public void unvisit(int s){
      visited = false;
      step = 0;
   }
   public int getStep(){
      return step;
   }
   public String printSquare(){
      if(step<10)return "[0"+step+"]";
      else return "["+step+"]";
   }
}
