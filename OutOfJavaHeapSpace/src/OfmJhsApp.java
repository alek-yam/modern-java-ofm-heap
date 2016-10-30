import java.util.logging.Logger;


public class OfmJhsApp {
	
	private static Logger log = Logger.getLogger(OfmJhsApp.class.getName());
	
	private static MemConsumer root;

	public static void main(String[] args) {
		
		try {
			root = new MemConsumer();
			MemConsumer curr = root;
			MemConsumer next;
	
			while (true) {
				next = new MemConsumer();
				curr.setNext(next);
				
				//log.log(Level.INFO, curr.getId() + "->" + curr.getNext().getId());
				
				curr = next;
			}
		} catch (Throwable e) {
			log.severe(e.getMessage());
		}

	}

}
