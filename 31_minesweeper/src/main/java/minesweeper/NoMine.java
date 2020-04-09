package minesweeper;

public class NoMine implements Field {

	@Override
	public void check(Player player) {
		// nothing
	}

	@Override
	public String getToken() {
		return " ";
	}

}
