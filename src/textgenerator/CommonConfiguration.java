package textgenerator;

public class CommonConfiguration {
	private int numOfMasters;
	private int numOfSlaves;
	/**
	 * @return numOfSlaves
	 */
	public int getNumOfSlaves() {
		return numOfSlaves;
	}
	/**
	 * @param numOfSlaves セットする numOfSlaves
	 */
	public void setNumOfSlaves(int numOfSlaves) {
		this.numOfSlaves = numOfSlaves;
	}
	/**
	 * @return numOfMasters
	 */
	public int getNumOfMasters() {
		return numOfMasters;
	}
	/**
	 * @param numOfMasters セットする numOfMasters
	 */
	public void setNumOfMasters(int numOfMasters) {
		this.numOfMasters = numOfMasters;
	}
}
