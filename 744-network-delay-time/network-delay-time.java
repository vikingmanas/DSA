class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        // ok in exzmple i get it that k is the source node.
        //[1,2,1] it means it goes from 1 to 2 with weight 1.
        // if k  is 1 return 1 
        // if k is 2 return -1 beacuse the direction is 1,2,1 ie from 1 to 2

        int INF=(int)1e9;
        int[] d=new int[n+1];
        Arrays.fill(d,INF);
        d[k]=0;

        for(int i=1;i<=n-1;i++){
            boolean change=false;

            for(int[]e :times){
                int u=e[0];
                int v=e[1];
                int w=e[2];

                if(d[u] !=INF && d[v]>d[u]+w){
                    d[v]=d[u]+w;
                    change=true;
                }
            }
            if(!change) break;
        }
        int ans=0;
        for(int i=1;i<=n;i++){
            if(d[i]==INF)return -1;
            ans=Math.max(ans,d[i]);
        }
        return ans;

    }
}