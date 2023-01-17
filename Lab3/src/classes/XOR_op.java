package classes;

public class XOR_op implements LogOperation{
	
	@Override
	public String getOper() {
		return "^";
	}
	
	@Override
	public String getName(){
		return "XOR";
	}
	
	@Override
	public boolean calculation(boolean a, boolean b) {
		return a^b;
	};
}
