class Population
{
	public static void main(String[] args) {
		long currentPopulation = 312032486;
		long secondsInYear = 365*24*60*60;
		long birthPerYear = secondsInYear/7;
		long deathPerYear = secondsInYear/13;
		long immigrantsPerYear = secondsInYear/45;
		long fiveYearPopulation = currentPopulation+((birthPerYear-deathPerYear+immigrantsPerYear)*5);
		System.out.println("Current Population is  - "+ currentPopulation);
		System.out.println("After five year Population is - "+ fiveYearPopulation);
	}
}