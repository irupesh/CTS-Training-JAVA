import java.util.Comparator;

public class PlayerComparator implements Comparator<Player> {

	@Override
	public int compare(Player o1, Player o2) {
		int i = o1.getSkill().compareTo(o2.getSkill());
		if(i != 0)
			return i;
		
		i = o1.getName().compareTo(o2.getName());
		return i;
	}
}
