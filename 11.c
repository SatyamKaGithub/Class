#include <stdio.h>
#include <stdlib.h>

// Structure to represent items
struct Item {
    int weight;
    int value;
};

// Function to compare items based on their value-to-weight ratio
int compare(const void *a, const void *b) {
    double ratio_a = (double)(((struct Item*)a)->value) / ((struct Item*)a)->weight;
    double ratio_b = (double)(((struct Item*)b)->value) / ((struct Item*)b)->weight;

    if (ratio_a < ratio_b) return 1;
    else if (ratio_a > ratio_b) return -1;
    else return 0;
}

// Function to solve Fractional Knapsack Problem
double fractionalKnapsack(int capacity, struct Item items[], int n) {
    // Sort items based on their value-to-weight ratio in non-increasing order
    qsort(items, n, sizeof(struct Item), compare);

    double totalValue = 0.0;  // Total value of items added to knapsack
    int currentWeight = 0;    // Current weight in knapsack

    // Loop through sorted items and add them to the knapsack
    for (int i = 0; i < n; ++i) {
        if (currentWeight + items[i].weight <= capacity) {
            // Add the whole item if it fits in the knapsack
            currentWeight += items[i].weight;
            totalValue += items[i].value;
        } else {
            // Add a fraction of the item if it doesn't fit completely
            double fraction = (double)(capacity - currentWeight) / items[i].weight;
            totalValue += fraction * items[i].value;
            break;  // Knapsack is full
        }
    }

    return totalValue;
}

int main() {
    int capacity, n;

    printf("Enter the capacity of the knapsack: ");
    scanf("%d", &capacity);

    printf("Enter the number of items: ");
    scanf("%d", &n);

    struct Item items[n];

    printf("Enter the weight and value of each item:\n");
    for (int i = 0; i < n; ++i) {
        printf("Item %d: ", i + 1);
        scanf("%d %d", &items[i].weight, &items[i].value);
    }

    double result = fractionalKnapsack(capacity, items, n);

    printf("The maximum value in the knapsack is: %.2lf\n", result);

    return 0;
}
