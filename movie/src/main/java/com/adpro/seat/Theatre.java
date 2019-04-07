package com.adpro.seat;

import java.util.ArrayList;
import java.util.List;

public class Theatre {
    private int theatreNumber;
    private String description;
    private int rowCount;
    private List<RowSeat> rows;

    public Theatre(int theatreNumber, String description) {
        this.theatreNumber = theatreNumber;
        this.description = description;
        rows = new ArrayList<>();
    }

    public void createRow(String type, int rowCount, int seatCount) {
        for (int row = 1; row <= rowCount; row++) {
            rows.add(new RowSeat(type, seatCount, row));
        }
        this.rowCount += rowCount;
    }

    public int getTheatreNumber() {
        return theatreNumber;
    }

    public void setTheatreNumber(int theatreNumber) {
        this.theatreNumber = theatreNumber;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getRowCount() {
        return rowCount;
    }

    public void setRowCount(int rowCount) {
        this.rowCount = rowCount;
    }

    public List<RowSeat> getRows() {
        return rows;
    }

    public void setRows(List<RowSeat> rows) {
        this.rows = rows;
    }
}
