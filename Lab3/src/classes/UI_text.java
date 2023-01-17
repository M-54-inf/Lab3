package classes;

public class UI_text {

	public static void main(String[] args) {
		LogOperation[] operations = {
			new AND_op(),
			new Conditional_AND_op(),
			new OR_op(),
			new Conditional_OR_op(),
			new XOR_op()
		};
		boolean a = true, b = false;
		for(LogOperation op : operations) {
			System.out.println(op.getName());
			System.out.printf("%b %s %b = %b \n\n",
				a, op.getOper(), b, op.calculation(a, b)		
			);
		}
	}
}