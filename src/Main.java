class RepeatFront {
    public static void main(String[] args) {
        RepeatFront julian = new RepeatFront();
        String output = julian.repeatFront("Julian", 4);
        System.out.println(output);


        RepeatFront a = new RepeatFront();
        String output1 = a.repeatFrontForLoop("Steven", 5);
        System.out.println(output1);


        RepeatFront b = new RepeatFront();
        String output2 = b.repeatFrontDoWhile("Skylar", 5);
        System.out.println(output2);

    }
    public String repeatFront (String str,int n){
        String newString = "";
        for (int i = n; i >= 0; i--) {
            newString += str.substring(0, i);
        }
        return newString;
    }

    public String repeatFrontForLoop (String y, int p) {
        String newString = "";
        int i = p;
        while (i >= 0) {
            newString += y.substring(0, i);
            i--;
        }
        return newString;
    }

    public String repeatFrontDoWhile(String str, int n){
        String newString = "";
        int i = n;
        do{
            newString += str.substring(0,i);
            i--;
        }
        while (i >= 0);
        return newString;
    }

}
