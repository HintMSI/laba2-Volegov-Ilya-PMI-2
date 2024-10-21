public class City {
    private String name;
    private Path[] paths;
    private int pathCount;

    private static final int MAX_PATHS = 10;

    public City(String name) {
        this.name = name;
        this.paths = new Path[MAX_PATHS];
        this.pathCount = 0;
    }

    // Метод для добавления пути к другому городу
    public void addPath(City destination, int cost) {
        if (pathCount < MAX_PATHS) {
            paths[pathCount] = new Path(destination, cost);
            pathCount++;
        } else {
            System.out.println("Достигнуто максимальное количество путей для города " + name);
        }
    }

    // Метод для получения текстового представления города
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name).append(": ");

        for (int i = 0; i < pathCount; i++) {
            sb.append(paths[i].getDestination().getName())
                    .append(" (")
                    .append(paths[i].getCost())
                    .append("), ");
        }

        // Удаление последней запятой и пробела
        if (sb.length() > 2) {
            sb.setLength(sb.length() - 2);
        }

        return sb.toString();
    }

    public String getName() {
        return name;
    }
}