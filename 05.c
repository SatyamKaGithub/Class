#include <stdio.h>
#include <stdlib.h>
struct Node {
    int key;
    struct Node* left;
    struct Node* right;
};
struct Node* newNode(int key) {
    struct Node* node = (struct Node*)malloc(sizeof(struct Node));
    node->key = key;
    node->left = node->right = NULL;
    return node;
}
struct Node* insert(struct Node* root, int key) {
    if (root == NULL)
        return newNode(key);
    if (key < root->key)
        root->left = insert(root->left, key);
    else if (key > root->key)
        root->right = insert(root->right, key);
    return root;
}
struct Node* search(struct Node* root, int key) {
    if (root == NULL || root->key == key)
        return root;
    if (key < root->key)
        return search(root->left, key);
    return search(root->right, key);
}
int main() {
    struct Node* root = NULL;
    int keys[] = {50, 30, 20, 40, 70, 60, 80};
    for (int i = 0; i < sizeof(keys) / sizeof(keys[0]); i++)
        root = insert(root, keys[i]);
    int searchKey = 60;
    struct Node* result = search(root, searchKey);
    if (result != NULL)
        printf("Key %d found in the BST.\n", searchKey);
    else
        printf("Key %d not found in the BST.\n", searchKey);

    return 0;
}