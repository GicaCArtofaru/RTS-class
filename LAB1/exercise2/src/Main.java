//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    int[][] m1 = {
            {2, 3, 1}, {7, 1, 6}, {9, 2, 4}
    };
    int[][] m2 = {
            {8, 5, 3}, {3, 9, 2}, {2, 7, 3}
    };
    int[][] sum = new int[3][3];
    int[][] sub = new int[3][3];
    int[][] prod = new int[3][3];
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            sum[i][j] = m1[i][j] + m2[i][j];
            sub[i][j] = m1[i][j] - m2[i][j];
        }
    }
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            prod[i][j] = 0;
            for (int k = 0; k < 3; k++) {
                prod[i][j] += m1[i][k] * m2[k][j];
            }
        }
    }
    System.out.println("Sum:");
    printingboi(sum);
    System.out.println("Subtraction");
    printingboi(sub);
    System.out.println("Product:");
    printingboi(prod);
}

static void printingboi(int[][] matrixx) {
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            System.out.print(matrixx[i][j] + " ");
        }
        System.out.println();
    }
    System.out.println();
}