#include <stdio.h>
#include <limits.h>
int matrixChainMultiplication(int dimensions[], int i, int j) {
    if (i == j)
        return 0;
    int minOperations = INT_MAX;
    for (int k = i; k < j; k++) {
        int operations = matrixChainMultiplication(dimensions, i, k) +
                         matrixChainMultiplication(dimensions, k + 1, j) +
                         dimensions[i - 1] * dimensions[k] * dimensions[j];
        if (operations < minOperations)
            minOperations = operations;
    }
    return minOperations;
}
int main() {
    int dimensions[] = {30, 35, 15, 5, 10, 20, 25};
    int n = sizeof(dimensions) / sizeof(dimensions[0]);
    int result = matrixChainMultiplication(dimensions, 1, n - 1);
    printf("Minimum number of scalar multiplications: %d\n", result);
    return 0;
}
