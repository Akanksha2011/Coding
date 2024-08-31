class Solution {
    public double maxProbability(int n, int[][] edges, double[] succProb, int start_node, int end_node) { Map<Integer, List<Pair>> graph = new HashMap<>();
        
        // Initialize the graph
        for (int i = 0; i < n; i++) {
            graph.put(i, new ArrayList<>());
        }
        
        // Populate the graph with edges and probabilities
        for (int i = 0; i < edges.length; i++) {
            int u = edges[i][0];
            int v = edges[i][1];
            double prob = succProb[i];
            
            graph.get(u).add(new Pair(v, prob));
            graph.get(v).add(new Pair(u, prob));
        }
        
        // Priority queue to maximize the probability (max heap)
        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> Double.compare(b.probability, a.probability));
        pq.add(new Pair(start_node, 1.0));
        
        // Array to store the maximum probability to reach each node
        double[] probabilities = new double[n];
        probabilities[start_node] = 1.0;
        
        // Process the nodes
        while (!pq.isEmpty()) {
            Pair current = pq.poll();
            int currentNode = current.node;
            double currentProb = current.probability;
            
            // If we've reached the end node, return the probability
            if (currentNode == end_node) {
                return currentProb;
            }
            
            // Check neighbors
            for (Pair neighbor : graph.get(currentNode)) {
                int nextNode = neighbor.node;
                double nextProb = neighbor.probability;
                
                // Calculate new probability
                double newProb = currentProb * nextProb;
                
                // If the new probability is higher, update and add to queue
                if (newProb > probabilities[nextNode]) {
                    probabilities[nextNode] = newProb;
                    pq.add(new Pair(nextNode, newProb));
                }
            }
        }
        
        // If no path found, return 0
        return 0.0;
    }
    
    // Helper class to store node and probability
    class Pair {
        int node;
        double probability;
        
        Pair(int node, double probability) {
            this.node = node;
            this.probability = probability;
        }
    }
}