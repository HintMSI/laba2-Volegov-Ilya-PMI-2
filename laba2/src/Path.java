public class Path {
    private City destination; // Город назначения
    private int cost;         // Стоимость пути

    public Path(City destination, int cost) {
        this.destination = destination;
        this.cost = cost;
    }

    public City getDestination() {
        return destination;
    }

    public int getCost() {
        return cost;
    }
}