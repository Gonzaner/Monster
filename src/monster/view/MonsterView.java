package monster.view;

import javax.swing.JOptionPane;

import monster.controller.MonsterAppController;

public class MonsterView
{
	
	private MonsterAppController baseController;
	
	public MonsterView(MonsterAppController baseController)
	{
		this.baseController = baseController;
		
	}
	
	public void displayInformation() 
	{
		JOptionPane.showMessageDialog(null, "I made a monster ");
		JOptionPane.showMessageDialog(null, " It's name is " + baseController.getMyMonster().getName());
		JOptionPane.showMessageDialog(null, " It has this many legs " + baseController.getMyMonster().getNumberOfLegs());
		JOptionPane.showMessageDialog(null, " It has this much hair" + baseController.getMyMonster().getHairCount());
		JOptionPane.showMessageDialog(null, " It sees through this many eyes" + baseController.getMyMonster().getEyeCount());
		JOptionPane.showMessageDialog(null, " It has a nose " + baseController.getMyMonster().getNoseCount());
		JOptionPane.showMessageDialog(null, " It has this many arms " + baseController.getMyMonster().getArmCount());
		JOptionPane.showMessageDialog(null, "I used the smores icing to stick it together it tasted odd");
		JOptionPane.showMessageDialog(null, "Yes I ate my monster, he was delcious");
		JOptionPane.showMessageDialog(null, "I espically enjoyed his legs ");
		
	}
}
