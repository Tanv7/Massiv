import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] massiv0 = new int[5];
        int[] massiv1 = {12, 16, 13, -8, 7, 9};

        int[] massiv2 = inputArray();

    }

    private static void printArray(String message, int[] massiv) {
        System.out.println(message + massiv.length + " чисел");
        for (int i = 0; i < massiv.length; i++) {
            System.out.println(massiv[i]);
        }
    }

    public static void fillArray(int[] m, int filler)
    {
        for (int i = 0; i < m.length; i++) {
            m[i] = filler;
        }
    }

    public static void readArray(int[] m)
    {
        Scanner scanner = new Scanner(System.in);
        int value;
        System.out.println("введите "+m.length+" элементов массива");
        for (int i = 0; i < m.length; i++) {
            value = scanner.nextInt();
            m[i] = value;
        }
    }

    public static int[] inputArray(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите размер массива 2");
        int size = scanner.nextInt();
        int[] m = new int[size];
        readArray(m);
        return m;
    }

    public static int sumArray(int[]m){
        int M=0;

        for(int i= 0;i< m.length ;i++)
            M = M + m[i];
        return M;
    }
    public static int minArray(int[]m){
        int min =m[0];
        for (int i=0;i<m.length;i++)
            if (m[i]<min)
                min = m[i];
    return min;
        }

        public static int maxArray[]m{
        int max= m[0];
        for (int i=0;i< m.length;i++){

        }
        public static int indexOfNearestByModul( int x,int []m){
            int minDif = x - m[0];
            int j = 0;
            for (int i = 1; i < m.length; i++) {
                if ((x - m[i]) < minDif) minDif = x - m[i];
                j = 1;
            }
            return j;
        }
        public static void printBackward(int[]m){
            for (int i = m.length - 1; i >= 0; i--) {
                System.out.print(m[i] + "");
            }
            System.out.println("");
        }
        public static void printFromTO(int i,int j,int[]m){
            for (;i<=j;i++)
        }
        public static int indexOf(int x,int[]m){
            return-1;
        }
        public static int indexOfNearestByModule (int x,int[]m){
            int minDif= x-m[0];
            int j=0;
            for( int i=1;i<minDif) minDif=x-m[i];
            j=1;
        }
        return j;
        }
        public static void printBackward(int[]m){
        for( int i=m.length-1;i>0;i--){
            System.out.printLn("");
        }
        System.out.println("");
        }
        public static void printFromTo(int i,int j,int[]m){
        for (;i<=j;i++)
        }
        public class Main{
        public static int findElNomNearValue(int[]) m,int val){
            }
            public static void printReverseOrderint (int[]m){
System.out.printLn( "Элементы массива в обратном порядке:")
for ( int i=(m.length-1);i>=0;i--)
System.out.print(m[i]+";");
System.out.println();
    }
public static void printElBetweenXY(int[] ,int x,int y){
}
System.out.println( "Элементы массива между "+x+" и "+y);
for (int i=0;i<m.length;i++)
if(m[i]>=x && m[i]<=y)
System.out.println();
}
}