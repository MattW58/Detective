/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package detective.model;

import java.io.Serializable;

/**
 *
 * @author 56165320013
 */
public class Location implements Serializable {
    
    private int row;
    private int column;
    private int visited;
    private int ammountRemaining;

    public Location() {
    }

    public double getRow() {
        return row;
    }

    public void setRow(double row) {
        this.row = (int) row;
    }

    public double getColumn() {
        return column;
    }

    public void setColumn(double column) {
        this.column = (int) column;
    }

    public double getVisited() {
        return visited;
    }

    public void setVisited(double visited) {
        this.visited = (int) visited;
    }

    public double getAmmountRemaining() {
        return ammountRemaining;
    }

    public void setAmmountRemaining(double ammountRemaining) {
        this.ammountRemaining = (int) ammountRemaining;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.row) ^ (Double.doubleToLongBits(this.row) >>> 32));
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.column) ^ (Double.doubleToLongBits(this.column) >>> 32));
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.visited) ^ (Double.doubleToLongBits(this.visited) >>> 32));
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.ammountRemaining) ^ (Double.doubleToLongBits(this.ammountRemaining) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Location other = (Location) obj;
        if (Double.doubleToLongBits(this.row) != Double.doubleToLongBits(other.row)) {
            return false;
        }
        if (Double.doubleToLongBits(this.column) != Double.doubleToLongBits(other.column)) {
            return false;
        }
        if (Double.doubleToLongBits(this.visited) != Double.doubleToLongBits(other.visited)) {
            return false;
        }
        return Double.doubleToLongBits(this.ammountRemaining) == Double.doubleToLongBits(other.ammountRemaining);
    }

    @Override
    public String toString() {
        return "Location{" + "row=" + row + ", column=" + column + ", visited=" + visited + ", ammountRemaining=" + ammountRemaining + '}';
    }

    public void setLocation(String first_Location) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
