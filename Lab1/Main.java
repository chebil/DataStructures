import java.util.Random;
class Main {
  public static void main(String[] args) {
    int size =100000;
    Random rd = new Random();
    int[] A = new int [size];
    int[] B = new int [size];
    int[] C = new int [size];
    long start_time = System.currentTimeMillis();
    for(int i= 0; i< A.length;i++){
      A[i]= rd.nextInt(100);
      B[i]= rd.nextInt(100);
      for(int j= i;j<B.length;j++){
        C[i] = A[i]+B[j];
      }
    }
    long end_time = System.currentTimeMillis();// The time the algorithm ended
    System.out.println("The algorithm took " + (end_time-start_time) + 
                        " milliseconds.");
  }
}