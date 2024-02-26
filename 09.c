#include<stdio.h>
struct Activity {
    int start, finish;
};
int compare(const void *a, const void *b) {
    return ((struct Activity*)a)->finish - ((struct Activity*)b)->finish;
}
void printActivities(struct Activity arr[], int n) {

    qsort(arr, n, sizeof(arr[0]), compare);

    printf("Selected activities:\n");

    int i = 0;
    printf("(%d, %d)\n", arr[i].start, arr[i].finish);

    for (int j = 1; j < n; j++) {

        if (arr[j].start >= arr[i].finish) {
            printf("(%d, %d)\n", arr[j].start, arr[j].finish);
            i = j;
        }
    }
}

int main() {
    struct Activity activities[] = {
        {1, 4}, {3, 5}, {0, 6}, {5, 7}, {3, 8},
        {5, 9}, {6, 10}, {8, 11}, {8, 12}, {2, 13},
        {12, 14}
    };
    int n = sizeof(activities) / sizeof(activities[0]);
    printActivities(activities, n);
    return 0;
}