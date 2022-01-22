# Shortest path finding algorithm comparison between IDA* and Dijkstra
This is a project for datastructures and algorithms practical course where I will be comparing two algorithms on their efficiency to find the shortest path between a given start point and end point in a visualized map. 
- The project is done using Java but I am capable of doing peer reviews on python as well. 
- I will be using Iterative Deepening A* (IDA*) and Dijkstra because they can both find the shortest path to a goal node from a start node in a weighted graph. This is important as weights will symbolize distance in the map. I'm using IDA* instead of A* because it uses less memory due to not keeping track of visited nodes (although this could mean a longer processing time for the cost of less memory used). Dijkstra on the other hand stores data on path distances at every node. Dijkstra cannot work with edges that have a negative weight but as in this case weights are distances travelled, they won't be negative and it can be used.
- The program will ask to input a starting node and an ending node as city names which it will then translate in to nodes and draw them on a map to visualize the function of the algorithm. It will also look up all other nodes (cities) that are on the way there and put those as nodes in the map which the algorithm will then have to go through to find the end node.

- Time complexity for IDA*: O(n^d) where n is the branching factor and d is the depth of the shallowest goal node
- Space complexity for IDA*: O(d) 
- Time complexity for Dijkstra: O(n + m log m) where n is the number of nodes and m is the number of edges (if using the min-priority queue)
- Space complexity for Dijkstra: O(n2) 

- Project language will be english, I am capable of doing peer reviews in Finnish as well.

(Opinto-ohjelma: Tietojenkäsittelytieteen kandidaatti)
