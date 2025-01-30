// getting 100 % total abstraction using interface

interface chessplayer{
         public void moves();
}


class queen implements chessplayer{
    public void moves(){
        System.out.println("queen can moves in all direction");
    }
}

class king implements chessplayer{
    public void moves(){
        System.out.println("king can moves only one step");
    }
}

class rook implements chessplayer{
   public void moves(){
    System.out.println(" move right , left, up , down");
   }
} 


public class B52 {
  public static void main(String[] args) {

    queen q = new queen();// object of queen
    q.moves();

    king k = new king();// object of king
    k.moves();
    
  }
    
}
