public class distributore {

	int credito;
	
	public distributore(int credito) {
		
		this.credito=credito;
		
	}
	
	public void prodotto(int scalasoldi) {
		
		this.credito-=scalasoldi;
		
	}
public  String toString() {
	return ""+credito;
}
public void setcredito(int credito) {
	this.credito=credito;
}
}
