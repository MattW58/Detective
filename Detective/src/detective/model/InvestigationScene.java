/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package detective.model;
/**
 *
 * @author 56165320013
 */
public class InvestigationScene extends Scene {

        private int noOfPeople;
        private int noOfItems;

    public InvestigationScene() {
    }

    public int getNoOfPeople() {
        return noOfPeople;
    }

    public void setNoOfPeople(int noOfPeople) {
        this.noOfPeople = noOfPeople;
    }

    public int getNoOfItems() {
        return noOfItems;
    }

    public void setNoOfItems(int noOfItems) {
        this.noOfItems = noOfItems;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + this.noOfPeople;
        hash = 53 * hash + this.noOfItems;
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
        final InvestigationScene other = (InvestigationScene) obj;
        if (this.noOfPeople != other.noOfPeople) {
            return false;
        }
        if (this.noOfItems != other.noOfItems) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "InvestigationScene{" + "noOfPeople=" + noOfPeople + ", noOfItems=" + noOfItems + '}';
    }
        
        
    
}
