
// Find the Shortest Path
//
// Given a route containing 4 direction (E,W,N,S),
// find the shortest path to reach destination.
//          N
//          ↑
//     W ←  .  → E
//          ↓
//          S
//
// Time Complexity -> O(n)
// Space Complexity -> O(1)

public class ShortestPath{
    public static void main(String args[]){
        String path = "WWEENESENNN";
        float shortestDistance = getShortestPath(path);
        System.out.println("Shortest Distance: " + shortestDistance);
    }
    public static float getShortestPath(String path){
        int x = 0;
        int y = 0;

        for(int i = 0; i < path.length(); i++){
            char dir = path.charAt(i);

            //SOUTH
            if(dir == 'S'){
                y--;
            }
            //NORTH
            else if(dir == 'N'){
                y++;
            }
            //WEST
            else if(dir == 'W'){
                x--;
            }
            //EAST
            else {
                x++;
            }
        }

        int x2 = x * x;
        int y2 = y * y;
        return (float)Math.sqrt(x2+y2);
    }
}