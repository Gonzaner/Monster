package monster.controller;

import monster.model.MarshmallowMonster;
import monster.view.MonsterView;

public class MonsterAppController
{
	
	
	private MonsterView myAppView;
	private MarshmallowMonster myMonster;
	private MarshmallowMonster otherMonster;
	
	
	
	public MonsterAppController()
	{
		myAppView = new MonsterView(this);
		myMonster = new MarshmallowMonster ("Vard", 4.0, 2.0, 5, 1, 3, false);
		otherMonster = new MarshmallowMonster ("Deat", 1.3, .1, 3, 2, 0, true);
	}
	
	public MarshmallowMonster getMyMonster()
	{
		return myMonster;
	}
	
	public void start()
	{
		myAppView.displayInformation();
	}

}
