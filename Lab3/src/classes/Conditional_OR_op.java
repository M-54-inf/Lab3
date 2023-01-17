package classes;

public class Conditional_OR_op implements LogOperation{
	
	@Override
	public String getOper() {
		return "||";
	}
	
	@Override
	public String getName(){
		return "Conditional_OR";
	}
	
	@Override
	public boolean calculation(boolean a, boolean b) {
		return a||b;
	};
}
