package at.szf.java.Cinema;

public class Cinemahall {
    private Seat[][] seats = null;
    private String name;
    private int rows = 10;
    private int columns = 10;

    public Cinemahall(String name, int rows, int columns) {
        this.name = name;
        if(rows > 0){
            this.rows = rows;
            //assert(rows!=10) :"ROWS ist 10";            // -ea als parameter in der vm intellij run/debug section
        }
        if(columns > 0){
            this.columns = columns;
        }

        seats = new Seat[rows][columns];

        for(int row = 0; row < seats.length; row++){
            for(int column = 0; column < seats[row].length; column++){
                seats[row][column] = new Seat();
            }
        }

    }

    public String getName() {
        return name;
    }
}
