
public class Cards {

	public Cards() {
		// TODO Auto-generated constructor stub
	}

	  public static void main(String[] args) {
	    final int numberCards = 20;
	    int cl, rank;
	    String card="";
	    String [] crds = new String [numberCards];
	    boolean equal;
	    for(int i=0; i<numberCards; i++){
	      equal = true;
	      cl = (int)(Math.random()*4) + 1;
	      rank = (int)(Math.random()*13) + 1;
	      switch(cl){
	        case 1:  card=  "Spades";break;
	        case 2:  card=  "Hearts";break;
	        case 3:  card = "Diamonds";break;
	        case 4:  card = "Clubs";break;
	      }
	      switch(rank){
	        case 1:  card += "A";break;
	        case 11: card += "J"; break;
	        case 12: card += "Q";  break;
	        case 13: card += "K"; break;
	        default : card += rank;break;
	      }
	      for(int j = 0; j< i; j++){
	         if (card.equals(crds[j])){
	           equal = false;
	          break;
	         }
	      }
	     if( equal){
	       crds[i] = card;
	       System.out.println( card);
	     }else{
	       i--;
	     }

	    }

	  }
}
	