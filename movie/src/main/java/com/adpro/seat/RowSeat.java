package com.adpro.seat;

import java.util.ArrayList;
import java.util.List;

public class RowSeat {
    private int rowNumber;
    private String rowType;
    private int seatCount;
    private List<Seat> seatList;

    public RowSeat(String rowType, int seatNumber, int rowNumber) {
        this.rowType = rowType;
        this.rowNumber = rowNumber;
        this.seatCount = seatNumber;
        seatList = new ArrayList<>();
        buildSeat(this.seatCount);
    }

    public void buildSeat(int seatCount) {
        for (int num = 1; num <= seatCount; num++) {
            seatList.add(new Seat(false, num));
        }
    }

    public int getRowNumber() {
        return rowNumber;
    }

    public void setRowNumber(int rowNumber) {
        this.rowNumber = rowNumber;
    }

    public String getRowType() {
        return rowType;
    }

    public void setRowType(String rowType) {
        this.rowType = rowType;
    }

    public int getSeatCount() {
        return seatCount;
    }

    public void setSeatCount(int seatCount) {
        this.seatCount = seatCount;
    }

    public List<Seat> getSeatList() {
        return seatList;
    }

    public void setSeatList(List<Seat> seatList) {
        this.seatList = seatList;
    }
}
