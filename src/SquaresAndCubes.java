public class SquaresAndCubes {
    public void print(){
        for (int i =0; i < 11; i ++){
            System.out.println(i+"\t"+square(i)+"\t"+cube(i));
        }
    }

    public int square(int n){
        return n*n;
    }

    public int cube(int n ){
        return n* n * n;
    }
}
