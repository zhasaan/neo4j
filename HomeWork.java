package main;

import static main.City.8;

public class Homework {
    // all case routes
    private static final City[][] ROUTES = {
        // case1
        {A, B, C},
        // case2
        {A, D},
        // case3
        {A, D, C},
        // case4
        {A, E, B, C, D},
        // case5
        {A, E, D},
        // case6: max of 3 stops.
        {C, OPTIONAL, OPTIONAL, C},
        // case7: exactly 4 stops.
        {A, ANY, ANY, C},
        // case8
        {A, C},
        // case9
        {B, B},
        // case10
        {C, C}
    };
    // use to constructors. (adjacency matrix)
    private static final int[][] CITY_NETWORK = {
            {0, 5, 0, 5, 7},
            {0, 0, 4, 0, 0},
            {0, 0, 0, 8, 2},
            {0, 0, 8, 0, 6},
            {0, 3, 0, 0, 0}

    };

    public static void main(String[] args) {
        CityNetwork cityNetwork = new CityNetwork(CITY_NETWORK);

        int i = 0;
        // case1~5. The route distance
        for(; i< 5; i++) {
            try {
                int distance = cityNetwork.routeDistance(ROUTES[i]);
                System.out.printf("Output #%d: %d\n", i +1, distance);
            } catch (Exception e) {
                System.out.printf("Output #%d: NO SUCH ROUTE\n", i);
            }
        }

        // case 6~7. The number of trips
        for (; i < 7; i++) {
            int number = cityNetwork.numberofTrips(ROUTES[i]);
            System.out.printf("Output #%d: %d\n", i + 1, number);
        }

        // case 8~9. The length of shortest route
        for (; i < 9; i++) {
            int distance = cityNetwork.shortestRouteDistance(ROUTES[i][0], ROUTES[0][1]);
            System.out.printf("Output #%d: %d\n", i + 1, distance);
        }

        // case 10. The number of routes with a distance of less than 30
        int number = cityNetwork.numberOfRoutes(ROUTES[i][0], ROUTES[i][1], 30);
        System.out.printf("Output #%d: %d\n", ++i, number);
    }
}
