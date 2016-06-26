/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package detective.model;

import java.io.Serializable;
import java.util.Objects;
/**
 *
 * @author 56165320013
 */
public class Scene implements Serializable{
    
        private String description;
        private String blockedLocation;
        private String displaySymbol;

    public Scene() {
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBlockedLocation() {
        return blockedLocation;
    }

    public void setBlockedLocation(String blockedLocation) {
        this.blockedLocation = blockedLocation;
    }

    public String getDisplaySymbol() {
        return displaySymbol;
    }

    public void setDisplaySymbol(String displaySymbol) {
        this.displaySymbol = displaySymbol;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + Objects.hashCode(this.description);
        hash = 41 * hash + Objects.hashCode(this.blockedLocation);
        hash = 41 * hash + Objects.hashCode(this.displaySymbol);
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
        final Scene other = (Scene) obj;
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.blockedLocation, other.blockedLocation)) {
            return false;
        }
        if (!Objects.equals(this.displaySymbol, other.displaySymbol)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Scene{" + "description=" + description + ", blockedLocation=" + blockedLocation + ", displaySymbol=" + displaySymbol + '}';
    }
        
        private static Scene[] createScenes() {
            
            Scene[] scenes = new Scene[SceneType.values().length];
            
            Scene startingScene = new Scene();
            startingScene.setDescription(
            "You've awoken in your office, but have no memory of what's going on..."
            );
            startingScene.setMapSymbol("ST");
            startingScene.setBlocked(false);
            startingScene.setTravelTime(240);
            scenes[SceneType.start.ordinal()] = startingScene;
            
            Scene finishScene = new Scene();
            finishScene.setDescription(
                    "You've successfully found your gun and badge and made it out of your office.");
            
            finishScene.setMapSymbol("FN");
            finishScene.setBlocked(false);
            finishScene.setTravelTime((int) Double.POSITIVE_INFINITY);
            scenes[SceneType.finish.ordinal()] = finishScene;
            
            
            return scenes;
        }

    private void setMapSymbol(String st) {
        System.out.println("Calls the map symbol");
    }

    private void setBlocked(boolean b) {
        System.out.println("Calls Blocked");
    }

    private void setTravelTime(int i) {
        System.out.println("Calls Travel Time");
    }
    
        public enum SceneType {
            start,
            office,
            outsideEast,
            alleyway,
            sewers,
            uptownMob,
            outsideSouth,
            building,
            uptown,
            irishBar,
            ocean,
            trainStation,
            downtown,
            highway,
            pier,
            fishingDocks,
            chinatown,
            policeStation,
            boardwalk,
            beach,
            diner,
            chinatownMob,
            backAlley,
            warehouse,
            conversation,
            standard,
            combat,
            investigation,
            finish,
            enter,
            exit;
        }
        
        private static void assignScenesToLocations(Map map, Scene[] scenes) {
            Location[][] locations = map.getLocations();
            
            locations[0][0].setScene(scenes[SceneType.office.ordinal()]);
            locations[0][1].setScene(scenes[SceneType.outsideEast.ordinal()]);
            locations[0][2].setScene(scenes[SceneType.alleyway.ordinal()]);
            locations[0][3].setScene(scenes[SceneType.sewers.ordinal()]);
            locations[0][4].setScene(scenes[SceneType.uptownMob.ordinal()]);
            locations[1][0].setScene(scenes[SceneType.outsideSouth.ordinal()]);
            locations[1][1].setScene(scenes[SceneType.building.ordinal()]);
            locations[1][2].setScene(scenes[SceneType.uptown.ordinal()]);
            locations[1][3].setScene(scenes[SceneType.irishBar.ordinal()]);
            locations[1][4].setScene(scenes[SceneType.ocean.ordinal()]);
            locations[2][0].setScene(scenes[SceneType.trainStation.ordinal()]);
            locations[2][1].setScene(scenes[SceneType.downtown.ordinal()]);
            locations[2][2].setScene(scenes[SceneType.highway.ordinal()]);
            locations[2][3].setScene(scenes[SceneType.pier.ordinal()]);
            locations[2][4].setScene(scenes[SceneType.fishingDocks.ordinal()]);
            locations[3][0].setScene(scenes[SceneType.chinatown.ordinal()]);
            locations[3][1].setScene(scenes[SceneType.highway.ordinal()]);
            locations[3][2].setScene(scenes[SceneType.policeStation.ordinal()]);
            locations[3][3].setScene(scenes[SceneType.boardwalk.ordinal()]);
            locations[3][4].setScene(scenes[SceneType.beach.ordinal()]);
            locations[4][0].setScene(scenes[SceneType.diner.ordinal()]);
            locations[4][1].setScene(scenes[SceneType.chinatownMob.ordinal()]);
            locations[4][2].setScene(scenes[SceneType.backAlley.ordinal()]);
            locations[4][3].setScene(scenes[SceneType.warehouse.ordinal()]);
            locations[4][4].setScene(scenes[SceneType.ocean.ordinal()]);
            
        }
}
