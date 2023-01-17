package classes;

public class AND_op implements LogOperation{
	
	@Override
	public String getOper() {
		return "&";
	}
	
	@Override
	public String getName(){
		return "AND";
	}
	
	@Override
	public boolean calculation(boolean a, boolean b) {
		return a&b;
	};
}
