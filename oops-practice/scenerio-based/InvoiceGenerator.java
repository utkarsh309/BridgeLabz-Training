package scenerioBased2;
//Create InvoiceGenerator class to generate invoice

public class InvoiceGenerator {

	public static void main(String[] args) {
		
		String input="Logo Design - 3000 INR, Web Page - 4500 INR";
		
		String[][]taskAndAmount= parseInvoice(input);
		
		System.out.println("Total Amount: "+getTotalAmount(taskAndAmount[1]));
	}
	
	//Method to Separate task and amount
	public static String[][] parseInvoice(String input){
		
		String[] tasks = input.trim().split(",");

        // Dynamic array size based on number of tasks
        String[][] taskAndAmount = new String[2][tasks.length];
        
		int index=0;
		for(String task:tasks) {
			
			String[]taskName=task.trim().split("-");
			taskAndAmount[0][index]=taskName[0];
			
			String []amount=taskName[1].trim().split(" " );
			taskAndAmount[1][index]=amount[0];
			index++;
		}
		
		return taskAndAmount;
	}
	
	//Method to calculate total Amount
	public static int getTotalAmount(String [] amounts) {
		
		int totalAmount=0;
		for(String amount:amounts) {
			int value=Integer.parseInt(amount);
			totalAmount+=value;
			
		}
		return totalAmount;
	}
	

}
