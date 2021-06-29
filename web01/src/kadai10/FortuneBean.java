package kadai10;

public class FortuneBean {

	//誕生月
	private int birthmonth;

	//ラッキーアイテム
	private String item;

	//ラッキーカラー
	private String color;

	//ランク
	private int rank;

	public FortuneBean(int birthmonth, String item, String color, int rank) {
		super();
		this.birthmonth = birthmonth;
		this.item = item;
		this.color = color;
		this.rank = rank;
	}

	public int getBirthmonth() {
		return birthmonth;
	}

	public void setBirthmonth(int birthmonth) {
		this.birthmonth = birthmonth;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}



}
