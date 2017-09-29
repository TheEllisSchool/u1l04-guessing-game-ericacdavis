import javax.swing.JOptionPane;

public class GuessingGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int userNum;
		int score=0;
		int computerNum = (int) (Math.random()*100) +1;
		JOptionPane.showMessageDialog(null, computerNum);
		do {
			String input = JOptionPane.showInputDialog(null, "Enter a guess between 0 and 100. Enter -1 to be a quitter :(");
			userNum= Integer.parseInt(input);
			score+=1;
			if (userNum >= computerNum -10 && userNum<= computerNum+10 && userNum != computerNum) {
				JOptionPane.showMessageDialog(null,"You are within 10 points" );
			}
			else if(userNum >computerNum+10) {
				JOptionPane.showMessageDialog(null, "Your guess was too high");
			}
			else if(userNum < computerNum){
				JOptionPane.showMessageDialog(null, "your guess was too low!");
			}
		}while (userNum != computerNum && userNum != -1 && userNum<=100 && userNum>=0);
		if(userNum>100 || userNum<-1) {
			JOptionPane.showMessageDialog(null, "can you follow simple directions?");
		}
		if(userNum== computerNum) {
			JOptionPane.showMessageDialog(null, "You guessed it! The number was:" + computerNum + ". You took " + score +" guess/es");
		}
		else if(userNum == -1) {
			JOptionPane.showMessageDialog(null, "You are such a quitter");
		}
	}

}
