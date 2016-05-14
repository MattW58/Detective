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

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public int getVisited() {
        return visited;
    }

    public void setVisited(int visited) {
        this.visited = visited;
    }

    public int getAmmountRemaining() {
        return ammountRemaining;
    }

    public void setAmmountRemaining(int ammountRemaining) {
        this.ammountRemaining = ammountRemaining;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + this.row;
        hash = 97 * hash + this.column;
        hash = 97 * hash + this.visited;
        hash = 97 * hash + this.ammountRemaining;
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
        if (this.row != other.row) {
            return false;
        }
        if (this.column != other.column) {
            return false;
        }
        if (this.visited != other.visited) {
            return false;
        }
        if (this.ammountRemaining != other.ammountRemaining) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Location{" + "row=" + row + ", column=" + column + ", visited=" + visited + ", ammountRemaining=" + ammountRemaining + '}';
    }

    
    
}
