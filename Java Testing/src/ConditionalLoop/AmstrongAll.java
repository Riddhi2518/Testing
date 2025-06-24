package ConditionalLoop;

public class AmstrongAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 1;

        while (num <= 1000) {
            int sn = num;
            int temp = num;

            int sum = 0;
            temp = num;
            while (temp != 0) {
                int digit = temp % 10;
                sum += (digit*digit*digit);
                temp /= 10;
            }

            if (sum == sn) {
                System.out.println(sn + " is an Armstrong number");
            }

            num++;
        }
	}

}
