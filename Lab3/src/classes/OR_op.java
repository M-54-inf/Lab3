package classes;

public class OR_op implements LogOperation{
	
	@Override
	public String getOper() {
		return "|";
	}
	
	@Override
	public String getName(){
		return "OR";
	}
	
	@Override
	public boolean calculation(boolean a, boolean b) {
		return a|b;
	};
}
