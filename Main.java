package VirtualKeyForRepositories;

public class Main {

	public static void main(String[] args) {
		
		// Create "main" folder if not present in current folder structure
		FileOperations.createMainFolderIfNotPresent("main");
		
		MenuOptions.printWelcomeScreen("LockedMe","Akhil Raja");
		
		HandleOptions.handleWelcomeScreenInput();
	}

	
}