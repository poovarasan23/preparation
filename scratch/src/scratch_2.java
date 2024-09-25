class Scratch {
    public static void main(String[] args) {
        int in[]={1,2,3,4,4,5,5,5};

        int c1=0,h1=0,c2=0,h2=0;
        for (int i = 0; i < in.length; i++) {
            if (in[i]>=h1){
                if (in[i]>h1){
                    h2=h1;
                    c2=c1;
                    h1=in[i];
                    c1=1;
                }
                else {
                    c1++;
                }
            }
        }
        System.out.println( h2+" ==> "+c2);
    }
}