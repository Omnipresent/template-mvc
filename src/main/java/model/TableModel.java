package model;

import java.util.List;

public class TableModel <T> {

    private int pgNumber;
    private int pgAmount;
    private int totalRecords;
    private int from;
    private int to;
    private List <T> rows;
    
    public TableModel (int pgNumber, int maxRows, int totalRecords, String sortedIndex, String sortOrder) {
        this.totalRecords = totalRecords;
        
        if (this.totalRecords > 0 && maxRows > 0) {
            this.pgAmount = ((Double) Math.ceil((double)this.totalRecords/maxRows)).intValue();
        }         
        
        this.pgNumber = pgNumber;
        // if for some reasons the requested page is greater than the total 
        // set the requested page to total page
        if (this.pgNumber > this.pgAmount) {
            this.pgNumber = this.pgAmount;
        }
        
        // calculate the starting position of the rows
        this.from = (this.pgNumber - 1) * maxRows;
        // if for some reasons start position is negative set it to 0
        // typical case is that the user type 0 for the requested page
        if (this.from < 0) {
            this.from = 0;
        }
        this.to = this.from + maxRows;

        if (this.to > this.totalRecords) {
            this.to = this.totalRecords;
        }
    }
    
    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }

    public int getFrom() {
        return from;
    }

    public int getPgAmount() {
        return pgAmount;
    }

    public int getPgNumber() {
        return pgNumber;
    }

    public int getTo() {
        return to;
    }

    public int getTotalRecords() {
        return totalRecords;
    }    
}
