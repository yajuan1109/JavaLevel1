import java.util.Scanner;

public class Client {
	
	private String name;
	private int clientNumber;
	
	Scanner input = new Scanner(System.in);
	
	public Client() {
		this.name = "unassigned";
		this.clientNumber = -1;
	}
	
	public Client(String name, int clientNumber) {
		this.name = name;
		this.clientNumber = clientNumber;
	}

	public void keyboardClientInfo() {
		System.out.println();
		System.out.print("\nClient name: ");
		name = input.nextLine();
		System.out.print("Client number: ");
		clientNumber = input.nextInt();
		System.out.println();
	}
	
	public void displayClientInfo() {
		System.out.printf("Client Name:     %-15s\t Clinent Number: %10s", name, clientNumber +"\n");
	}
	
	public static void main(String[] args) {
		
		final int numberOfClients = 2;
		Client clients[] = new Client [numberOfClients];
				
		for (int i = 0; i<numberOfClients; i++) {
            clients[i] = new Client();
            System.out.print("Enter information for Client " + (i+1));
            clients[i].keyboardClientInfo();
		}
		
		System.out.println("List of Clients: ");
		for  (int i = 0; i<numberOfClients; i++) {
            clients[i].displayClientInfo();
		}
	}

}
