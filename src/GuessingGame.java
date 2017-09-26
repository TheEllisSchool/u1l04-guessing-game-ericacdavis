import javax.swing.JOptionPane;

public class GuessingGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int userNum;
		int computerNum = (int) (Math.random()*100) +1;
		do {
			String input = JOptionPane.showInputDialog(null, "Enter a guess between 0 and 100. Enter -1 to be a quitter :(");
			userNum= Integer.parseInt(input);
		}while (userNum != computerNum && userNum != -1 && userNum<=100 && userNum>=0);
		if(userNum>100 || userNum<-1) {
			JOptionPane.showMessageDialog(null, "can you follow simple directions?");
		}
		if(userNum== computerNum) {
			JOptionPane.showMessageDialog(null, "You guessed it! The number was:" + computerNum);
		}
		else if(userNum == -1) {
			JOptionPane.showMessageDialog(null, "You are such a quitter");
		}
	}

}
