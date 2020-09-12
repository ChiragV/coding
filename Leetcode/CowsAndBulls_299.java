import static org.junit.Assert.assertEquals;

public class CowsAndBulls {

	public static void main(String args[]) {
		assertEquals("1A3B", getHint("1807","7810"));
		assertEquals("1A1B", getHint("1123","0111"));
		assertEquals("2A2B", getHint("6244988279","3819888600"));
		
	}
	 public static String getHint(String secret, String guess) {
	       
		 int size=secret.length();
		 int cow=0;
		 int bulls=0;
		 for(int i=0;i<size;i++)
		 {
			 char ch=secret.charAt(i);
			 char ch2=guess.charAt(i);
			 
			 if(ch==ch2)
			 {
				 cow=cow+1;
				 StringBuffer sb=new StringBuffer(secret);
				 secret=sb.replace(i, i+1, "$").toString();
			 }
			 else if(secret.contains(ch2+""))//it can be bull or cow
			 {
				 
				 //find index of this character such way that corresponding secrect chr
				 boolean flag=false;
				 for(int j=secret.indexOf(ch2);j<secret.length();j++)
				 {
					 if(secret.charAt(j)==guess.charAt(j))
						 continue;//trying
					 else if(secret.charAt(j)==ch2)
					 {
						 bulls=bulls+1;
						 StringBuffer sb=new StringBuffer(secret);
						 secret=sb.replace(j, j+1, "$").toString();
						 break;
					 }
				 }
				 
				 
			 }
			 
		 }
		 return cow+"A"+bulls+"B";
	    }
}
