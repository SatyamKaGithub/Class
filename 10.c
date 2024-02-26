#include <stdio.h>

// Structure to represent an activity
struct Activity {
    int start, finish;
};

// Function to compare two activities based on their finish times
int compare(const void *a, const void *b) {
    return ((struct Activity*)a)->finish - ((struct Activity*)b)->finish;
}

// Function to print the selected activities
void printActivities(struct Activity activities[], int n) {
    // Sort activities based on finish time
    qsort(activities, n, sizeof(struct Activity), compare);

    printf("Selected Activities:\n");

    // The first activity always gets selected
    int i = 0;
    printf("(%d, %d) ", activities[i].start, activities[i].finish);

    // Consider the rest of the activities
    for (int j = 1; j < n; j++) {
        // If this activity has a start time greater than or equal to the finish
        // time of the previously selected activity, then select it
        if (activities[j].start >= activities[i].finish) {
            printf("(%d, %d) ", activities[j].start, activities[j].finish);
            i = j;
        }
    }
}

int main() {
    // Example activities
    struct Activity activities[] = {
        {1, 2}, {3, 4}, {0, 6}, {5, 7}, {8, 9}, {5, 9}
    };

    int n = sizeof(activities) / sizeof(activities[0]);

    printActivities(activities, n);

    return 0;
}
