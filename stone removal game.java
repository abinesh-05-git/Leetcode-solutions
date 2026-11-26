class Solution {
    public boolean canAliceWin(int n) {
        int bob = 0;
        int alice = 0;
        int sub = 10;
        while(n>0){
            if((n-sub)>=0)   alice+=1;
            n = n-sub;
            sub--;
            if(n-sub>=0)     bob+=1;
            n = n-sub;
            sub--;
            if(n<0) break;
        }
        if(alice>bob)   return true;
        return false;
    }
}
