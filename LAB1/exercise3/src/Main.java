import java.util.Random;
void main() {
        Random rand= new Random();
        int[] nr =new int[10];
        for (int i=0; i<nr.length; i++)
        {
            nr[i] = rand.nextInt(100);
            System.out.print(nr[i] + " ");
        }
    System.out.println();
    int maxi = nr[0];
    int mini = nr[0];
    for (int i = 1; i < nr.length; i++) {
        if (nr[i] > maxi) {
            maxi = nr[i];
        }
        if (nr[i] < mini) {
            mini = nr[i];
        }
    }

    System.out.println("Maximum: " + maxi);
    System.out.println("Minimum: " + mini);
}
