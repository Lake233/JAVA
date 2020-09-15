public class MultiplicationTable {
    public static void main(String[] args) {
        int i,j;
        System.out.print("  | ");
        for(i = 1;i <= 12;i++){
            System.out.print("\t" + i);
        }
        System.out.print("\n__+");
        for(i=1;i<52;i++){
            System.out.print("_");
        }
        System.out.println();
        for(i=1;i<=9;i++){
            System.out.print(" " + i + "|\t");
            for(int table=1;table<=i;table++){
                System.out.print("\t");
            }
            for(j=i;j<=12;j++){
                System.out.print(i*j + "\t");
            }
            System.out.println();
        }
        for(i=10;i<=12;i++){
            System.out.print(i + "|\t");
            for(int table=1;table<=i;table++){
                System.out.print("\t");
            }
            for(j=i;j<=12;j++){
                System.out.print(i*j + "\t");
            }
            System.out.println();
        }
    }
}
