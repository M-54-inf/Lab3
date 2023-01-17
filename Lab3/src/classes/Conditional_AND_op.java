package classes;

public class Conditional_AND_op implements LogOperation{
	
	@Override
	public String getOper() {
		return "&&";
	}
	
	@Override
	public String getName(){
		return "Conditional_AND";
	}
	
	@Override
	public boolean calculation(boolean a, boolean b) {
		return a&&b;
	};
}