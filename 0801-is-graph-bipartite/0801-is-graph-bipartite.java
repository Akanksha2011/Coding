class Solution {
    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        int[] color = new int[n];
        Queue<Integer> q = new LinkedList<>();
        for(int i=0; i<n; i++)
        {
            if(color[i] == 0)
            {
               
               q.offer(i);
               color[i] = 1;     
            }
            while(!q.isEmpty())
            {
                int node = q.poll();
                for(int neighbour : graph[node])
                {
                    if(color[neighbour] == 0)
                    {
                        color[neighbour] = -color[node];
                        q.offer(neighbour);
                    }
                    else if(color[neighbour] == color[node])
                    {
                        return false;
                    }
                }
            }
        }
        return true;
    }
    }
