package Array;

public class OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = new int[20];
        for (int i = 0; i < 20; i++) {
            a[i] = i + 1;
        }

      
        System.out.println("Even Numbers from 1 to 20:");
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println();
        System.out.println("Odd Numbers from 1 to 20:");
        for (int i = 1; i <= 20; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
	}

}
