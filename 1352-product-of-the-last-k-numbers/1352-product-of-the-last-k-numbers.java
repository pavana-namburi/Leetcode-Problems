class ProductOfNumbers {
    
    private List<Integer> pre=new ArrayList<>();

    public ProductOfNumbers() {
        pre.add(1);
    }
    
    public void add(int num) {
        if(num==0){
            pre.clear();
            pre.add(1);
        }
        else
           pre.add(pre.get(pre.size()-1)*num);
    }
    
    public int getProduct(int k) {
        int n=pre.size();
        if(k>=n)
            return 0;
        return pre.get(n-1)/pre.get(n-k-1);
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */