/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package detective.model;

import detective.control.GameControl;
import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Matt
 */
public class Map implements Serializable{

    private static Scene[] createScenes() {
        System.out.println("sceneamabob"); 
        return scenes;
    }
    
    private int rowCount;
    private int columnCount;
    private Location[][] locations;

    public Map(int rowCount, int columnCount) {
        if (rowCount < 1 || columnCount < 1 || rowCount > 5 || columnCount > 5) {
        System.out.println("the rows and columns must be greater than 0 and less than 5.");
        return;
        }
        
        this.columnCount = columnCount;
        this.rowCount = rowCount;
        this.locations = new Location[rowCount][columnCount];
        
        for (int row = 0; row < rowCount; row++){
          for (int column = 0; column < columnCount; column++) {
             Location location = new Location();
             location.setColumn(column);
             location.setRow(row);
             location.setVisited(false);
             locations[row][column] = location;
          }
        }
    }

    public int getRowCount() {
        return rowCount;
    }

    public void setRowCount(int rowCount) {
        this.rowCount = rowCount;
    }

    public int getColumnCount() {
        return columnCount;
    }

    public void setColumnCount(int columnCount) {
        this.columnCount = columnCount;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + this.rowCount;
        hash = 79 * hash + this.columnCount;
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
        final Map other = (Map) obj;
        if (this.rowCount != other.rowCount) {
            return false;
        }
        if (this.columnCount != other.columnCount) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Map{" + "rowCount=" + rowCount + ", columnCount=" + columnCount + '}';
    }
    
    private static Map createMap() {
        Map map = new Map(5, 5);
        
        Scene[] scenes = createScenes();
        
        GameControl.assignScenesToLocations(map, scenes);
        
        return map;
    }

    Location[][] getLocations() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
