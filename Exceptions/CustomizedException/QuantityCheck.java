package customizedexception;

/*
 * Exceptions of our own
 */
public class QuantityCheck extends Exception{

	public QuantityCheck(String information) {
		super(information);
	}
}
