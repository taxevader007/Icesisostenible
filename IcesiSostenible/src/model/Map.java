package model;

/**
 * The Map class is a blueprint for creating objects that represent a map.
 */
public class Map {

    private PointInterest[][] pointInterest = new PointInterest[20][20];

    public Map() {
    }

    public Map(PointInterest[][] pointInterest) {
        this.pointInterest = pointInterest;
    }

    public void initializeMap(int x, int y) {
        this.pointInterest = new PointInterest[x][y];
    }

    public PointInterest[][] getPointInterest() {
        return pointInterest;
    }

    public boolean isValid(int x, int y) {
        return pointInterest[x][y] == null;
    }

    public boolean isValidForDelete(int x, int y) {
        return pointInterest[x][y] != null;
    }

    public void setPointInterest(int x, int y, PointInterest pointInterest) {
        this.pointInterest[x][y] = pointInterest;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < pointInterest.length; i++) {
            for (int j = 0; j < pointInterest[i].length; j++) {
                result.append(pointInterest[i][j] != null ? "[X]" : "[ ]");
            }
            result.append("\n");
        }
        return result.toString();
    }

    public PointInterest returnPointInterest(int option) {
        PointInterest pointInterest = null;
        for (PointInterest[] row : getPointInterest()) {
            for (PointInterest point : row) {
                option--;
                if (option == 0) {
                    pointInterest = point;
                    break;
                }
            }
            if (pointInterest != null) {
                break;
            }
        }
        return pointInterest;
    }

    public void removePointInterest(int x, int y) {
    }
}
